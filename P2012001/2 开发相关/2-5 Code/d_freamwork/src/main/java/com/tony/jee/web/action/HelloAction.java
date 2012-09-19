package com.tony.jee.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.collect.Maps;
import com.tony.jee.common.action.BaseAction;
import com.tony.jee.common.action.BaseActionImpl;
import com.tony.jee.pojo.base.BaseFields;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.BaseFieldsService;

@SuppressWarnings("serial")
public class HelloAction extends BaseActionImpl implements BaseAction {

    @Autowired
    private BaseFieldsService baseFieldsService;
    
    public String toIndex() {
        
        System.out.println("toIndex....");
        
//        Criteria example = new Criteria();
//        
//        example.put("fieldId", value);
//        
        
        List<BaseFields> baseFields = baseFieldsService.selectByExample(null);
        
        
        for (int i = 0; i < baseFields.size(); i++) {
            
            System.out.println(baseFields.get(i).getFieldName());
        }
        
        setAttribute("baseFields", baseFields);
        
        return "success";
    }
}
