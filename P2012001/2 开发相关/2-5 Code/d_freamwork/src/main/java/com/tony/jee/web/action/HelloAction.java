package com.tony.jee.web.action;

import com.tony.jee.common.action.BaseAction;
import com.tony.jee.common.action.BaseActionImpl;

@SuppressWarnings("serial")
public class HelloAction extends BaseActionImpl implements BaseAction {

    public String toIndex() {
        
        System.out.println("toIndex....");
        
        return "success";
    }
}
