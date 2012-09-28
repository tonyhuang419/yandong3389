package com.tony.jee.common.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tony.jee.common.exception.SystemException;

/**
 * 类名称：BaseAction
 * 内容摘要：action处理接口,处理页面接收来的数据,和对request跟session的操作
 * @author 闫冬
 * @version 1.0 2011/06/15
 */
public interface BaseAction {

    /**
     * 设置请求对象
     * @param request 请求对象
     */
    public abstract void setServletRequest(HttpServletRequest request);

    /**
     * 设置响应对象
     * @param response 响应对象
     */
    public abstract void setServletResponse(HttpServletResponse response);

    /**
     * 从页面请求数据中获取一个int值
     * @param paramterName 参数的名称
     */
    public abstract int getIntValue(String paramterName);

    /**
     * 从页面请求数据中获取一个float值
     * @param paramterName 参数的名称
     */
    public abstract float getFloatValue(String paramterName);

    /**
     * 从页面请求数据中获取一个double值
     * @param paramterName 参数的名称
     */
    public abstract double getDoubleValue(String paramterName);

    /**
     * 从页面请求数据中获取一个boolean值
     * @param paramterName 参数的名称
     */
    public abstract boolean getBooleanValue(String paramterName);

    /**
     * 从页面请求的数据中获取一个String值
     * @param paramterName 参数的名称
     */
    public abstract String getStringValue(String paramterName);

    /**
     * 从session对象中获取一个int值
     * @param paramterName 参数的名称
     */
    public abstract int getSessionIntValue(String paramterName);

    /**
     * 从session对象中获取一个float值
     * @param paramterName 参数的名称
     */
    public abstract float getSessionFloatValue(String paramterName);

    /**
     * 从session对象中获取一个double值
     * @param paramterName 参数的名称
     */
    public abstract double getSessionDoubleValue(String paramterName);

    /**
     * 从session对象中获取一个boolean值
     * @param paramterName 参数的名称
     */
    public abstract boolean getSessionBooleanValue(String paramterName);

    /**
     * 从session对象中获取一个String值
     * @param paramterName 参数的名称
     */
    public abstract String getSessionStringValue(String paramterName);

    /**
     * 从session对象中获取一个Object对象
     * @param paramterName 参数的名称
     */
    public abstract Object getSessionValue(String paramterName);

    /**
     * 从页面请求的数据中获取一个Object对象
     * @param paramterName 参数的名称
     * @return Object 返回的对象
     */
    public abstract Object getValue(String paramterName);

    /**
     * 向session中存放一个对象
     * @param attributeName 对象名称
     * @param value 对象值
     */
    public abstract void setSessionAttribute(String attributeName, Object value);

    /**
     * 向request中存放一个对象
     * @param attributeName 对象名称
     * @param value 对象值
     */
    public abstract void setAttribute(String attributeName, Object value);
    
    /**
     * 将Object数据转换成json后输出到页面
     * @param data 要打印的Object数据
     * @throws SystemException
     */
    public void printJsonObjToPage(Object jsonObjData) throws SystemException;
    
    /**
     * 将List数据转换成json后输出到页面
     * @param jsonArrayData 要打印的List的数据
     * @throws SystemException
     */
    @SuppressWarnings("unchecked")
    public void printJsonArrayToPage(List jsonArrayData) throws SystemException;
    
    /**
     * 向页面输出字符串 
     * @param data 字符串数据
     * @throws SystemException
     */
    public void print(String data) throws SystemException;
}