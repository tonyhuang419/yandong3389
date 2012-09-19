package com.tony.jee.web.action;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.tony.jee.common.action.BaseAction;
import com.tony.jee.common.action.BaseActionImpl;
import com.tony.jee.pojo.base.BaseFields;
import com.tony.jee.service.BaseFieldsService;

@SuppressWarnings("serial")
public class HelloAction extends BaseActionImpl implements BaseAction {

    Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
    private BaseFieldsService baseFieldsService;
    
    private BaseFields baseFields;
    
    public BaseFields getBaseFields() {
        return baseFields;
    }

    public void setBaseFields(BaseFields baseFields) {
        this.baseFields = baseFields;
    }

    public String toIndex() {

        System.out.println("toIndex....");

        // Criteria example = new Criteria();
        //
        // example.put("fieldId", value);
        //

        List<BaseFields> baseFieldsList = baseFieldsService.selectByExample(null);

        setAttribute("baseFieldsList", baseFieldsList);

        return "success";
    }
    
    /**
     * 新增一条数据
     * @return
     */
    public String insert(){
        
        int result = baseFieldsService.insert(baseFields);
        
        logger.info("插入数据返回结果:" + result);
        
        return "toIndex";
    }
    
    /**
     * 取得修改内容显示到画面上
     * @return
     */
    public String toUpdata(){
        
        String pkid = getStringValue("pkid");
        
        BaseFields baseFields = baseFieldsService.selectByPrimaryKey(pkid);
        
        setAttribute("baseFields", baseFields);
        
        List<BaseFields> baseFieldsList = baseFieldsService.selectByExample(null);

        setAttribute("baseFieldsList", baseFieldsList);
        
        return "success";
    }
     
    /**
     * 修改一条数据
     * @return
     */
    public String updata(){
        
        int result = baseFieldsService.updateByPrimaryKey(baseFields);
        
        logger.info("修改数据返回结果:" + result);
        
        return "toIndex";
    }
    
    /**
     *  删除一条数据
     * @return
     */
    public String delete(){
        
        String pkid = getStringValue("pkid");
        
        int result = baseFieldsService.deleteByPrimaryKey(pkid);
        
        logger.info("删除数据返回结果:" + result);
        
        return "toIndex";
    }
}
