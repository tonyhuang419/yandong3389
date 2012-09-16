//package com.clbus.common.interceptor;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.UUID;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.struts2.ServletActionContext;
//
//import com.clbus.common.constant.CommonConstant;
//import com.clbus.common.eo.EOCOMail;
//import com.clbus.common.exception.SystemException;
//import com.clbus.common.log.Log;
//import com.clbus.common.util.CollectionUtils;
//import com.clbus.common.util.CompFunctionUtils;
//import com.clbus.common.util.MailUtil;
//import com.clbus.common.util.OpenModelServiceUtils;
//import com.clbus.common.util.PathPropertesUtil;
//import com.clbus.common.util.StringUtil;
//import com.clbus.ps.eo.EOPSVesselModel;
//import com.clbus.zz.eo.EOZZFunction;
//import com.clbus.zz.eo.EOZZPowerView;
//import com.clbus.zz.eo.EOZZSession;
//import com.opensymphony.xwork2.Action;
//import com.opensymphony.xwork2.ActionContext;
//import com.opensymphony.xwork2.ActionInvocation;
//import com.opensymphony.xwork2.interceptor.Interceptor;
//
///**
//@SuppressWarnings("serial")
//public class AuthorizationInterceptor implements Interceptor {
//
//    /** 登录的Action */
//    private static final String ZZ_SYSTEM_USER_ACTION_LOGIN = "ZZ0101Action_login";
//    /** 迁移到主页 */
//    private static final String ZZ_SYSTEM_ACTION_INDEX = "ZZ0102Action_init";
//    private static final String ZZ_SYSTEM_ADMIN_USER_ACTION_LOGIN = "ZZ0601Action_login";
//    private static final String ZZ_SYSTEM_SYS_USER_ACTION_LOGIN = "ZZ0605Action_login";
//    private static final String ZZ_SYSTEM_USER_ACTION_LOGOUT = "ZZ0101Action_logout";
//
//    /** token无效时,跳转标识 */
//    private static final String INVALID_TOKEN_CODE = "invalid.token";
//    /** 会员管理员操作 token无效时,跳转标识 */
//    private static final String ADMIN_INVALID_TOKEN_CODE = "admin.invalid.token";
//    /** token的名称 */
//    private static final String TOKEN_NAME_FIELD = "tokenName";
//    /** 代理令牌 */
//    private static final String PROXY_TOKEN = "N6UKYC6SH67QTPB0FMPN964WAZLY7HU8";
//    /** 是否为ajax方式请求 */
//    private static final String IS_AJAX = "isAjax";
//    /** 响应对象的类型和编码 */
//    private static final String CONTENT_TYPE = "type=text/html;charset=UTF-8";
//    /** 连接符 **/
//    private static String FLAG = "_";
//    /** 服务暂停时,跳转标识 */
//    private static final String SUSPEND_SERVICE = "suspendService";
//
//    /**
//     * 处理权限,及token
//     */
//    @Override
//    public String intercept(ActionInvocation invocation) {
//
//        String result = "";
//        // 获取请求的action的name
//        String actionName = invocation.getProxy().getActionName();
//        try {
//            result = excute(invocation);
//        } catch (SystemException e) {
//            System.out.println(actionName);
//            Log.error("错误ActionName：" + actionName);
//            if ("true".equals(PathPropertesUtil.getPath("error.mail.open"))) {
//                // 发生异常后，发送邮件
//                sendExceptionMail("intercept-SystemException", e);
//            }
//            throw e;
//        } catch (Exception e) {
//            System.out.println(actionName);
//            Log.error("错误ActionName：" + actionName);
//            if ("true".equals(PathPropertesUtil.getPath("error.mail.open"))) {
//                // 发生异常后，发送邮件
//                sendExceptionMail("intercept-Exception", e);
//            }
//            throw new SystemException("程序内部错误，操作失败！");
//        }
//
//        return result;
//    }
//
//    /**
//     * 执行权限判断、令牌判断、Action方法
//     * @param invocation ActionInvocation
//     * @return String 跳转字符串
//     * @author 金骞
//     */
//    private String excute(ActionInvocation invocation) {
//        // 获取session
//        Map<String, Object> session = invocation.getInvocationContext().getSession();
//        // 获取请求的action的name
//        String actionName = invocation.getProxy().getActionName();
//
//        // 验证token有效性
//        if (!validToken(invocation, actionName)) {
//            // 如果普通用户的session存在,并且会员管理员用户的session不存在时,token失效跳转到invalidation.jsp页面
//            if (null != session.get(CommonConstant.EOZZSESSION) && null == session.get(CommonConstant.EOZZADMINSESSION)) {
//                return INVALID_TOKEN_CODE;
//            }
//            else if (null == session.get(CommonConstant.EOZZSESSION)
//                    && null != session.get(CommonConstant.EOZZADMINSESSION)) {
//                return ADMIN_INVALID_TOKEN_CODE;
//            }
//        }
//
//        // 根据URL获得所有的功能ID
//        List<EOZZFunction> eoZZFunctionList = CompFunctionUtils.getEoZZURLMap().get(actionName);
//        // 判断如果是login或者logout就放行
//        if (ZZ_SYSTEM_USER_ACTION_LOGIN.equals(actionName)
//
//                // 获取验证码请求
//                || actionName.endsWith("_getValidateCode")
//                // 会员管理员登陆
//                || ZZ_SYSTEM_ADMIN_USER_ACTION_LOGIN.equals(actionName)
//                // 哥伦布管理员登陆
//                || ZZ_SYSTEM_SYS_USER_ACTION_LOGIN.equals(actionName)
//                // 更新我的任务信息列表
//                || "ZZ0101Action_updateMyTaskList".equals(actionName)
//                || actionName.startsWith("ZZ0405")
//                || actionName.startsWith("ZZ0401")
//                || actionName.startsWith("ZZ0905")
//                || actionName.startsWith("ZZ0103")
//                // 密码安全
//                || actionName.startsWith("ZZ0413")
//                // 服务条款
//                || actionName.startsWith("ZZ0403")
//                // TODO 设备物料
//                || "ZZ0807Action_uploadImage".equals(actionName) || "ZZ0807Action_doDelete".equals(actionName)
//                || "ZZ0815Action_uploadImage".equals(actionName) || "ZZ0815Action_doDelete".equals(actionName)
//                || "ZZ0921Action_init".equals(actionName) || "ZZ0921Action_getMyWarnList".equals(actionName)
//                // TODO 通知信息
//                || actionName.startsWith("ZZ0915") || actionName.startsWith("ZZ0917")
//                // TODO 我的帐户首页
//                || actionName.startsWith("ZZ0923") || "ZZ0101Action_getInformation".equals(actionName)
//                // TODO 意见反馈
//                || "ZZ0705Action_init2".equals(actionName) || "ZZ0705Action_saveAdiceInfo".equals(actionName)) {
//            // 继续往下执行
//            try {
//                return invocation.invoke();
//            } catch (Exception e) {
//                Log.error(e.getMessage());
//                // 清空Session
//                session.clear();
//                throw new SystemException(e.getMessage());
//            }
//        }
//        else {
//            // 判断用户是否登录 没有登录就跳转到登录画面
//            if (null == session.get(CommonConstant.EOZZSESSION)
//                    && null == session.get(CommonConstant.EOZZADMINFUNCSESSION)
//                    && null == session.get(CommonConstant.EOZZADMINSESSION)) {
//                return Action.LOGIN;
//            }
//            // 如果是公司管理员或者系统管理员登录，直接放行
//            if (null != session.get(CommonConstant.EOZZADMINFUNCSESSION)
//                    || null != session.get(CommonConstant.EOZZADMINSESSION)) {
//                // 直接放行
//                try {
//                    return invocation.invoke();
//                } catch (Exception e) {
//                    Log.error(e.getMessage());
//                    // 清空Session
//                    session.clear();
//                    throw new SystemException(e.getMessage());
//                }
//            }
//
//            // 迁到主页
//            if (ZZ_SYSTEM_ACTION_INDEX.equals(actionName)
//            // 登出请求
//                    || ZZ_SYSTEM_USER_ACTION_LOGOUT.equals(actionName) || actionName.startsWith("ZZ0102")
//                    // 我的帐户中的个人信息和修改密码
//                    || actionName.startsWith("ZZ0607")
//                    // 我的帐户中我的任务
//                    || actionName.startsWith("ZZ0608")) {
//                // 直接放行
//                try {
//                    return invocation.invoke();
//                } catch (Exception e) {
//                    Log.error(e.getMessage());
//                    // 清空Session
//                    session.clear();
//                    throw new SystemException(e.getMessage());
//                }
//            }
//
//            // 如果取得的数据为空
//            if (CollectionUtils.isEmpty(eoZZFunctionList)) {
//                ActionContext.getContext().put("message", "您没有使用此功能的权限");
//                // 清空Session
//                session.clear();
//                // 返回到无权限处理页面
//                return Action.LOGIN;
//            }
//            // 得到用户的session
//            EOZZSession eoZZSession = (EOZZSession) session.get(CommonConstant.EOZZSESSION);
//            // 根据操作URL从session中取得该角色所能操作的权限集合
//            List<EOZZPowerView> staffEoZZPowerList = eoZZSession.getStaffEoZZPowerOperateUrlMap().get(actionName);
//            // 如果用户没有权限
//            if (CollectionUtils.isEmpty(staffEoZZPowerList)) {
//                ActionContext.getContext().put("message", "您没有使用此功能的权限");
//                // 清空Session
//                session.clear();
//                // 返回到无权限处理页面
//                return Action.LOGIN;
//            }
//            // 从session中获取和该用户有关联的船舶IDlist
//            List<String> staffVesselIdList = eoZZSession.getStaffVesselInfoList();
//            // 如果船舶list为空，直接页面跳转
//            if (CollectionUtils.isEmpty(staffVesselIdList)) {
//                // 跳转到错误页面
//                return SUSPEND_SERVICE;
//            }
//            // 从eoZZSession获得该职员所属的公司id
//            String compId = eoZZSession.getComp_id();
//            // 公司——船舶——模块连接字符串
//            StringBuffer compId_vesselId_modelId;
//            // 模块开通标识
//            boolean modelOpenFlag = false;
//            // 用户所关联的船舶id
//            String vesselId;
//            // 根据页面上得URL获得的模块ID
//            String URLmodelId;
//            // 根据页面上得URL获得的功能ID
//            String URLfunctionId;
//            // 用户从权限定义表中获得的模块ID
//            String powerModelId;
//            // 用户从权限定义表中获得的功能ID
//            String powerFunctionId;
//            // 取得所有的字段进行比较
//            for (int i = 0; i < eoZZFunctionList.size(); i++) {
//                // 根据页面上得URL获得的模块ID
//                URLmodelId = eoZZFunctionList.get(i).getModel_id();
//                // 根据公司id船舶id及其模块id判断该公司的该模块是否开通
//                for (int k = 0; k < staffVesselIdList.size(); k++) {
//                    // 取得船舶id
//                    vesselId = staffVesselIdList.get(k);
//                    // 公司——船舶——模块连接字符串
//                    compId_vesselId_modelId = new StringBuffer();
//                    // 字符串连接
//                    compId_vesselId_modelId.append(compId).append(FLAG).append(vesselId).append(FLAG)
//                            .append(URLmodelId);
//                    // 判断该模块是否已开通
//                    EOPSVesselModel eoPSVesselModel = OpenModelServiceUtils.getOpenModelServiceMap().get(
//                            compId_vesselId_modelId.toString());
//                    // 如果不为null，可以放行
//                    if (eoPSVesselModel != null) {
//                        // 设为开通
//                        modelOpenFlag = true;
//                        break;
//                    }
//                }
//            }
//            // 如果没有开通，则不可以放行
//            if (!modelOpenFlag) {
//                // 跳转到服务暂停页面
//                return SUSPEND_SERVICE;
//            }
//            // 取得所有的字段进行比较
//            for (int i = 0; i < eoZZFunctionList.size(); i++) {
//                // 根据页面上得URL获得的模块ID
//                URLmodelId = eoZZFunctionList.get(i).getModel_id();
//                // 根据页面上得URL获得的功能ID
//                URLfunctionId = eoZZFunctionList.get(i).getFunction_id();
//                // 权限定义表中获得的功能ID,遍历权限定义表中获得的功能IDLIst
//                for (int j = 0; j < staffEoZZPowerList.size(); j++) {
//                    // 用户从权限定义表中获得的权限定义表中获得的模块ID
//                    powerModelId = staffEoZZPowerList.get(j).getModel_id();
//                    // 用户从权限定义表中获得的权限定义表中获得的功能ID
//                    powerFunctionId = staffEoZZPowerList.get(j).getFunction_id();
//                    // 如果通过效验，则可进行跳转
//                    if (URLmodelId.equals(powerModelId) && URLfunctionId.equals(powerFunctionId)) {
//                        try {
//                            return invocation.invoke();
//                        } catch (Exception e) {
//                            Log.error(e.getMessage());
//                            // 清空Session
//                            session.clear();
//                            throw new SystemException(e.getMessage());
//                        }
//                    }
//                }
//            }
//            ActionContext.getContext().put("message", "您没有使用此功能的权限");
//            // 清空Session
//            session.clear();
//
//            // 返回到无权限处理页面
//            return Action.LOGIN;
//        }
//    }
//
//    /**
//     * 验证token有效性
//     * @param invocation action控制对象
//     * @return boolean 验证结果(true：有效,false：无效)
//     * @throws Exception
//     * @author 闫冬
//     */
//    public boolean validToken(ActionInvocation invocation, String actionName) throws SystemException {
//
//        // 取得session会话对象
//        Map<String, Object> session = invocation.getInvocationContext().getSession();
//
//        // 判断如果是login或者logout就放行,或者是*_init方法时放行
//        if (ZZ_SYSTEM_USER_ACTION_LOGIN.equals(actionName) || ZZ_SYSTEM_USER_ACTION_LOGOUT.equals(actionName)
//                || actionName.endsWith("init") || ZZ_SYSTEM_ADMIN_USER_ACTION_LOGIN.equals(actionName)
//                || ZZ_SYSTEM_SYS_USER_ACTION_LOGIN.equals(actionName)) {
//            // 重置令牌
//            setAjaxToken(session);
//            return true;
//            // 如果是取得验证码操作，就放行
//        }
//        else if (actionName.endsWith("_getValidateCode")) {
//            return true;
//        }
//
//        // 取得请求对象
//        HttpServletRequest request = ServletActionContext.getRequest();
//        // 取出会话中的令牌
//        String strSessionToken = (String) session.get(TOKEN_NAME_FIELD);
//        // 页面中的令牌
//        String strRequestToken = request.getParameter(TOKEN_NAME_FIELD);
//
//        // 如果传递过来的是代理令牌,则直接返回true
//        if (PROXY_TOKEN.equals(strRequestToken)) {
//            return true;
//        }
//        // 如果令牌,不匹配的时候,直接返回false
//        else if (strSessionToken != null && !strSessionToken.equals(strRequestToken)) {
//            return false;
//        }
//        // 重置令牌
//        setAjaxToken(session);
//        // 否则正常运行
//        return true;
//    }
//
//    /**
//     * 在ajax请求时设置token到页面
//     * @author 闫冬
//     * @throws IOException
//     */
//    public void setAjaxToken(Map<String, Object> session) throws SystemException {
//        // 生成令牌
//        String tokenID = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
//        // 取得请求对象
//        HttpServletRequest request = ServletActionContext.getRequest();
//        // 取得响应对象
//        HttpServletResponse response = ServletActionContext.getResponse();
//        // 取得ajax访问标识
//        boolean isAjax = Boolean.valueOf(request.getParameter(IS_AJAX));
//
//        // 如果是ajax方式请求,则输出令牌到页面
//        if (isAjax) {
//            // 设置编码类型
//            try {
//                response.setContentType(CONTENT_TYPE);
//                response.getWriter().print(tokenID);
//            } catch (IOException e) {
//                Log.error(e.getMessage());
//                throw new SystemException(e.getMessage());
//            }
//        }
//        // 如果不是ajax方式请求,则将令牌保存到request中
//        else {
//            // 将新生成的令牌设置到请求对象中
//            request.setAttribute(TOKEN_NAME_FIELD, tokenID);
//        }
//
//        // 将新生成的令牌设置到会话对象中
//        session.put(TOKEN_NAME_FIELD, tokenID);
//    }
//
//    /**
//     * 接口中继承的方法，空实现
//     */
//    @Override
//    public void destroy() {
//
//    }
//
//    /**
//     * 接口中继承的方法，空实现
//     */
//    @Override
//    public void init() {
//
//    }
//
//    /**
//     * 发生异常后，向指定邮箱发送邮件。
//     * @param funcName 方法名
//     * @param e 异常实例
//     * @author 金骞
//     */
//    private void sendExceptionMail(String funcName, Exception e) {
//        StringBuffer contentBf = new StringBuffer();
//        contentBf.append("发生异常类名：" + this.getClass().toString() + "\r\n");
//        contentBf.append("发生异常方法名：" + funcName + "\r\n");
//        contentBf.append(e.getMessage() + "\r\n");
//        if (e.getCause() != null) {
//            contentBf.append(e.getCause().getMessage() + "\r\n");
//            if (e.getCause().getCause() != null) {
//                contentBf.append(e.getCause().getCause().getMessage() + "\r\n");
//            }
//            contentBf.append(e.getCause() + "\r\n");
//        }
//        StackTraceElement[] trace = e.getStackTrace();
//        for (int i = 0; i < trace.length; i++) {
//            contentBf.append(trace[i].toString() + "\r\n");
//        }
//
//        if (e.getCause() != null) {
//            trace = e.getCause().getStackTrace();
//            for (int i = 0; i < trace.length; i++) {
//                contentBf.append(trace[i].toString() + "\r\n");
//            }
//        }
//        if (e.getCause() != null && e.getCause().getCause() != null) {
//            trace = e.getCause().getCause().getStackTrace();
//            for (int i = 0; i < trace.length; i++) {
//                contentBf.append(trace[i].toString() + "\r\n");
//            }
//        }
//
//        // 发件人邮箱 TODO 测试使用以后删除
//        EOCOMail eoCOMail = new EOCOMail();
//        eoCOMail.setName("clbusmail");
//        eoCOMail.setAddress("clbusservice@gmail.com");
//        eoCOMail.setIs_ssl(true);
//        eoCOMail.setPassword("mailclbus");
//        eoCOMail.setSend_host("smtp.gmail.com");
//
//        List<EOCOMail> eoCOMailList = new ArrayList<EOCOMail>();
//        // error邮件通知列表
//        String strErrorMailAddList = PathPropertesUtil.getPath("error.mail.address.list");
//        // 如果邮件列表不为空，则向邮件列表内的所有对象发送邮件
//        if (StringUtil.isNotEmpty(strErrorMailAddList)) {
//            // 分割邮件列表中的邮件对象
//            String[] strErrorMailArr = strErrorMailAddList.split(",");
//            // 将邮件对象追加到发送列表
//            for (int i = 0; i < strErrorMailArr.length; i++) {
//                EOCOMail eoCOMailTo = new EOCOMail();
//                eoCOMailTo.setAddress(strErrorMailArr[i]);
//                eoCOMailList.add(eoCOMailTo);
//            }
//            // 发送邮件
//            MailUtil.sendMail(eoCOMail, eoCOMailList, null, "web服务器运行异常", contentBf.toString(), null);
//        }
//    }
//}
