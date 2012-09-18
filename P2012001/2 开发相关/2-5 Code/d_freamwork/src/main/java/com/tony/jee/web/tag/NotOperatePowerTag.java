package com.tony.jee.web.tag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ComponentTagSupport;

import com.opensymphony.xwork2.util.ValueStack;

@SuppressWarnings("serial")
public class NotOperatePowerTag extends ComponentTagSupport {
    // 定义模块接收变量
    private String model = null;
    // 定义画面接收变量
    private String page = null;
    // 定义操作接收变量
    private String operate = null;

    /**
     * 通过值栈栈顶的内容初始化对象，并将其返回
     */
    public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new NotOperatePower(stack);
    }

    /**
     * 为标签基本类赋值
     */
    protected void populateParams() {
        // 判断model属性是否为null
        if (null == model) {
            ((NotOperatePower) getComponent()).setModel("");
        }
        else {
            ((NotOperatePower) getComponent()).setModel(this.model);
        }
        // 判断page属性是否为null
        if (null == page) {
            ((NotOperatePower) getComponent()).setPage("");
        }
        else {
            ((NotOperatePower) getComponent()).setPage(this.page);
        }
        ((NotOperatePower) getComponent()).setOperate(this.operate);
    }

    /**
     * 为模块属性赋值
     */
    public void setModel(String model) {
        // 判断模块属性是否为null或""
        if ((null == model) || ("".equals(model))) {
            this.model = "";
        }
        else {
            this.model = model;
        }
    }

    /**
     * 为画面属性赋值
     */
    public void setPage(String page) {
        // 判断画面属性是否为null或“”
        if ((null == page) || ("".equals(page))) {
            this.page = "";
        }
        else {
            this.page = page;
        }
    }

    /**
     * 为具体操作属性赋值
     */
    public void setOperate(String operate) {
        this.operate = operate;
    }
}
