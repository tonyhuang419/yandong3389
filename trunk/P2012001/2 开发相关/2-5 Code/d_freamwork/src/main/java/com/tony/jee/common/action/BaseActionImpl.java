package com.tony.jee.common.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;
import com.tony.jee.common.exception.SystemException;
import com.tony.jee.common.utils.StringUtil;

/**
 * 类名称：BaseActionImpl
 * 内容摘要：action处理类,处理页面接收来的数据,和对request跟session的操作
 * @author 闫冬
 * @version 1.0 2011/06/15
 */
public class BaseActionImpl extends ActionSupport implements ServletRequestAware, ServletResponseAware {

    /** 响应对象的类型和编码 */
    private static final String CONTENT_TYPE = "type=text/html;charset=UTF-8";
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;
    /** 请求对象 */
    protected HttpServletRequest request;
    /** 响应对象 */
    protected HttpServletResponse response;
    /** session会话 */
    protected HttpSession session;

    /**
     * 设置请求对象
     * @param request 请求对象
     */
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
        this.session = request.getSession();
    }

    /**
     * 设置响应对象
     * @param response 响应对象
     */
    public void setServletResponse(HttpServletResponse response) {
        this.response = response;
    }

    /**
     * 从页面请求数据中获取一个int值
     * @param paramterName 参数的名称
     */
    public int getIntValue(String paramterName) {
        String value = this.request.getParameter(paramterName);
        return StringUtil.getIntValue(value);
    }

    /**
     * 从页面请求数据中获取一个float值
     * @param paramterName 参数的名称
     */
    public float getFloatValue(String paramterName) {
        String value = this.request.getParameter(paramterName);
        return StringUtil.getFloatValue(value);
    }

    /**
     * 从页面请求数据中获取一个double值
     * @param paramterName 参数的名称
     */
    public double getDoubleValue(String paramterName) {
        String value = this.request.getParameter(paramterName);
        return StringUtil.getDoubleValue(value);
    }

    /**
     * 从页面请求数据中获取一个boolean值
     * @param paramterName 参数的名称
     */
    public boolean getBooleanValue(String paramterName) {
        String value = this.request.getParameter(paramterName);
        return StringUtil.getBooleanValue(value);
    }

    /**
     * 从页面请求的数据中获取一个String值
     * @param paramterName 参数的名称
     */
    public String getStringValue(String paramterName) {
        String value = this.request.getParameter(paramterName);
        return value;
    }

    /**
     * 从页面请求的数据中获取一个String值(去前后的空格字符)
     * @param paramterName 参数的名称
     */
    public String getTrimStringValue(String paramterName) {
        String value = this.request.getParameter(paramterName);
        if (StringUtil.isNotEmpty(value)) {
            return value.trim();
        }
        return value;
    }

    /**
     * 从session对象中获取一个int值
     * @param paramterName 参数的名称
     */
    public int getSessionIntValue(String paramterName) {
        Object object = this.session.getAttribute(paramterName);
        if (object == null) {
            object = StringUtils.EMPTY;
        }
        return StringUtil.getIntValue(object.toString());
    }

    /**
     * 从session对象中获取一个float值
     * @param paramterName 参数的名称
     */
    public float getSessionFloatValue(String paramterName) {
        Object object = this.session.getAttribute(paramterName);
        if (object == null) {
            object = StringUtils.EMPTY;
        }
        return StringUtil.getFloatValue(object.toString());
    }

    /**
     * 从session对象中获取一个double值
     * @param paramterName 参数的名称
     */
    public double getSessionDoubleValue(String paramterName) {
        Object object = this.session.getAttribute(paramterName);
        if (object == null) {
            object = StringUtils.EMPTY;
        }
        return StringUtil.getDoubleValue(object.toString());
    }

    /**
     * 从session对象中获取一个boolean值
     * @param paramterName 参数的名称
     */
    public boolean getSessionBooleanValue(String paramterName) {
        Object object = this.session.getAttribute(paramterName);
        if (object == null) {
            object = StringUtils.EMPTY;
        }
        return StringUtil.getBooleanValue(object.toString());
    }

    /**
     * 从session对象中获取一个String值
     * @param paramterName 参数的名称
     */
    public String getSessionStringValue(String paramterName) {
        Object object = this.session.getAttribute(paramterName);
        if (object == null) {
            object = StringUtils.EMPTY;
        }
        return object.toString();
    }

    /**
     * 从session对象中获取一个Object对象
     * @param paramterName 参数的名称
     */
    public Object getSessionValue(String paramterName) {
        return this.session.getAttribute(paramterName);
    }

    /**
     * 从页面请求的数据中获取一个Object对象
     * @param paramterName 参数的名称
     * @return Object 返回的对象
     */
    public Object getValue(String paramterName) {
        return this.request.getParameter(paramterName);
    }

    /**
     * 向session中存放一个对象
     * @param attributeName 对象名称
     * @param value 对象值
     */
    public void setSessionAttribute(String attributeName, Object value) {
        this.session.setAttribute(attributeName, value);
    }

    /**
     * 向request中存放一个对象
     * @param attributeName 对象名称
     * @param value 对象值
     */
    public void setAttribute(String attributeName, Object value) {
        this.request.setAttribute(attributeName, value);
    }

    /**
     * 将Object数据转换成json后输出到页面
     * @param data 要打印的Object数据
     * @throws SystemException
     */
    public void printJsonObjToPage(Object jsonObjData) throws SystemException {
        try {
            if (jsonObjData != null) {
                this.response.setContentType(CONTENT_TYPE);
                this.response.getWriter().print(JSONObject.fromObject(jsonObjData));
            }
            else {
                this.response.setContentType(CONTENT_TYPE);
                this.response.getWriter().print(StringUtil.EMPTY);
            }
        } catch (IOException e) {
            throw new SystemException(e, e.getMessage());
        }
    }

    /**
     * 将List数据转换成json后输出到页面
     * @param jsonArrayData 要打印的List的数据
     * @throws SystemException
     */
    @SuppressWarnings("unchecked")
    public void printJsonArrayToPage(List jsonArrayData) throws SystemException {
        try {
            if (CollectionUtils.isNotEmpty(jsonArrayData)) {
                this.response.setContentType(CONTENT_TYPE);
                this.response.getWriter().print(JSONArray.fromObject(jsonArrayData));
            }
            else {
                this.response.setContentType(CONTENT_TYPE);
                this.response.getWriter().print(StringUtil.EMPTY);
            }
        } catch (IOException e) {
            throw new SystemException(e, e.getMessage());
        }
    }

    /**
     * 向页面输出字符串
     * @param data 字符串数据
     * @throws SystemException void
     */
    public void print(String data) throws SystemException {
        try {
            this.response.setContentType(CONTENT_TYPE);
            if (StringUtil.isNotEmpty(data)) {
                this.response.getWriter().print(data);
            }
            else {
                this.response.getWriter().print(StringUtil.EMPTY);
            }
        } catch (IOException e) {
            throw new SystemException(e, e.getMessage());
        }
    }
}
