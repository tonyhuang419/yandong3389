package com.tony.jee.web.tag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ComponentTagSupport;

import com.opensymphony.xwork2.util.ValueStack;

@SuppressWarnings("serial")
public class ModelPowerTag extends ComponentTagSupport {
    // 定义模块变量
    private String model;
    // 是否为系统模块
    private String systemModel;

    /**
     * 通过值栈栈顶的内容初始化对象，并将其返回
     */
    public Component getBean(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        return new ModelPower(stack);
    }

    /**
     * 为标签基本类赋值
     */
    protected void populateParams() {
        ((ModelPower) getComponent()).setModel(this.model);
        
        if(StringUtils.isNotEmpty(this.systemModel)){
            ((ModelPower) getComponent()).setSystemModel(this.systemModel);
        } else {
            ((ModelPower) getComponent()).setSystemModel(StringUtils.EMPTY);
        }
    }

    // 为模块属性赋值
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 设定 isSystemModel
     * @param isSystemModel String
     */
    public void setSystemModel(String systemModel) {
        
        if(StringUtils.isEmpty(systemModel)){
            
            this.systemModel = StringUtils.EMPTY;
        } else {
            
            this.systemModel = systemModel;
        }
    }
    
}
