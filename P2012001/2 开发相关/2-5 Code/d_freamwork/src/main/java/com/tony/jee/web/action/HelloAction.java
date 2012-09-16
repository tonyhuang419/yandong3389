package com.tony.jee.web.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloAction extends ActionSupport {

    public String toIndex() {
        
        System.out.println("toIndex....");
        
        
        return "success";
    }
}
