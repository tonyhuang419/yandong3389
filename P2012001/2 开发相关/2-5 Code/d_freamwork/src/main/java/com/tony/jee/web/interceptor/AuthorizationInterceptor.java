package com.tony.jee.web.interceptor;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.tony.jee.common.exception.SystemException;

@SuppressWarnings("serial")
public class AuthorizationInterceptor implements Interceptor {

    /** token无效时,跳转标识 */
    private static final String INVALID_TOKEN_CODE = "invalid.token";
    /** token的名称 */
    private static final String TOKEN_NAME_FIELD = "tokenName";
    /** 代理令牌 */
    private static final String PROXY_TOKEN = "N6UKYC6SH67QTPB0FMPN964WAZLY7HU8";
    /** 是否为ajax方式请求 */
    private static final String IS_AJAX = "isAjax";
    /** 响应对象的类型和编码 */
    private static final String CONTENT_TYPE = "type=text/html;charset=UTF-8";

    private static final Logger log = LoggerFactory.getLogger(AuthorizationInterceptor.class);

    
    @Override
    public String intercept(ActionInvocation invocation) {
        // 获取session
        Map<String, Object> session = invocation.getInvocationContext().getSession();
        // 获取请求的action的name
        String actionName = invocation.getProxy().getActionName();

        // 验证token有效性
        if (!validToken(invocation, actionName)) {
            return INVALID_TOKEN_CODE;
        }

        // 根据URL获得所有的功能ID
        try {
            return invocation.invoke();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new SystemException(e);
        }
    }

    /**
     * 验证token有效性
     * @param invocation action控制对象
     * @return boolean 验证结果(true：有效,false：无效)
     * @throws Exception
     * @author 闫冬
     */
    public boolean validToken(ActionInvocation invocation, String actionName) throws SystemException {

        // 取得session会话对象
        Map<String, Object> session = invocation.getInvocationContext().getSession();

        // 画面初始化时重置令牌
        if (actionName.endsWith("init")) {
            // 重置令牌
            setAjaxToken(session);
            return true;
            // 如果是取得验证码操作，就放行
        }
        else if (actionName.endsWith("_getValidateCode")) {
            return true;
        }

        // 取得请求对象
        HttpServletRequest request = ServletActionContext.getRequest();
        // 取出会话中的令牌
        String strSessionToken = (String) session.get(TOKEN_NAME_FIELD);
        // 页面中的令牌
        String strRequestToken = request.getParameter(TOKEN_NAME_FIELD);

        // 如果传递过来的是代理令牌,则直接返回true
        if (PROXY_TOKEN.equals(strRequestToken)) {
            return true;
        }
        // 如果令牌,不匹配的时候,直接返回false
        else if (strSessionToken != null && !strSessionToken.equals(strRequestToken)) {
            return false;
        }
        // 重置令牌
        setAjaxToken(session);
        // 否则正常运行
        return true;
    }

    /**
     * 在ajax请求时设置token到页面
     * @author 闫冬
     * @throws IOException
     */
    public void setAjaxToken(Map<String, Object> session) throws SystemException {
        // 生成令牌
        String tokenID = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        // 取得请求对象
        HttpServletRequest request = ServletActionContext.getRequest();
        // 取得响应对象
        HttpServletResponse response = ServletActionContext.getResponse();
        // 取得ajax访问标识
        boolean isAjax = Boolean.valueOf(request.getParameter(IS_AJAX));

        // 如果是ajax方式请求,则输出令牌到页面
        if (isAjax) {
            // 设置编码类型
            try {
                response.setContentType(CONTENT_TYPE);
                response.getWriter().print(tokenID);
            } catch (IOException e) {
                log.error("重置令牌时出现异常...", e);
                throw new SystemException(e);
            }
        }
        // 如果不是ajax方式请求,则将令牌保存到request中
        else {
            // 将新生成的令牌设置到请求对象中
            request.setAttribute(TOKEN_NAME_FIELD, tokenID);
        }

        // 将新生成的令牌设置到会话对象中
        session.put(TOKEN_NAME_FIELD, tokenID);
    }

    /**
     * 接口中继承的方法，空实现
     */
    @Override
    public void destroy() {

    }

    /**
     * 接口中继承的方法，空实现
     */
    @Override
    public void init() {

    }
}
