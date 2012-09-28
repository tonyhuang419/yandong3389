package com.tony.jee.web.tag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ComponentTagSupport;

import com.opensymphony.xwork2.util.ValueStack;

@SuppressWarnings("serial")
public class PagePowerTag extends ComponentTagSupport {
    // 模块
    private String model;
    // 画面
    private String page;

    /**
     * 通过值栈栈顶的内容初始化对象，并将其返回
     */
    public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new PagePower(stack);
    }

    /**
     * 为标签基本类赋值
     */
    protected void populateParams() {
        // 为模块属性赋值
        ((PagePower) getComponent()).setModel(this.model);
        // 为画面属性赋值
        ((PagePower) getComponent()).setPage(this.page);
    }

    // 为模块赋值
    public void setModel(String model) {
        this.model = model;
    }

    // 为画面赋值
    public void setPage(String page) {
        this.page = page;
    }
}
