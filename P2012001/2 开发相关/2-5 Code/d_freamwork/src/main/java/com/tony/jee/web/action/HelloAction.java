package com.tony.jee.web.action;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.tony.jee.common.action.BaseAction;
import com.tony.jee.common.action.BaseActionImpl;
import com.tony.jee.common.utils.PageUtil;
import com.tony.jee.pojo.base.BaseFields;
import com.tony.jee.pojo.base.Criteria;
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
        
        
        // 取得当前页数
        int currentPage = getIntValue("currentPage");
        
        // 当前页为0 查询所有
        if(currentPage == 0){
            List<BaseFields> baseFieldsList = baseFieldsService
                    .selectByExample(null);

            setAttribute("baseFieldsList", baseFieldsList);

            return "success";
        }
        
        // 每页显示条数
        int perPage = 5;
        
        // 分页查询起始条数
        int startRecord = PageUtil.getStartRecord(currentPage, perPage);
        
        // 分页查询截止条数
        int endRecord = PageUtil.getEndRecord(startRecord, perPage);

        
        Criteria example = new Criteria();
           
        example.setOracleStart(startRecord);
        
        example.setOracleEnd(endRecord);
        
        example.setOrderByClause("SORT ASC");
        
        
        List<BaseFields> baseFieldsList = baseFieldsService
                .selectByExample(example);

        setAttribute("baseFieldsList", baseFieldsList);

        return "success";
    }

    /**
     * 新增一条数据
     * 
     * @return
     */
    public String insert() {

        int result = baseFieldsService.insert(baseFields);

        logger.info("插入数据返回结果:" + result);

        return "toIndex";
    }

    /**
     * 取得修改内容显示到画面上
     * 
     * @return
     */
    public String toUpdata() {

        String pkid = getStringValue("pkid");

        // 根据主键取得数据
        BaseFields baseFields = baseFieldsService.selectByPrimaryKey(pkid);

        setAttribute("baseFields", baseFields);

        // 取得所有数据
        List<BaseFields> baseFieldsList = baseFieldsService
                .selectByExample(null);

        setAttribute("baseFieldsList", baseFieldsList);

        return "success";
    }

    /**
     * 修改一条数据
     * 
     * @return
     */
    public String updata() {

        int result = baseFieldsService.updateByPrimaryKey(baseFields);

        logger.info("修改数据返回结果:" + result);

        return "toIndex";
    }

    /**
     * 删除一条数据
     * 
     * @return
     */
    public String delete() {

        String pkid = getStringValue("pkid");

        int result = baseFieldsService.deleteByPrimaryKey(pkid);

        logger.info("删除数据返回结果:" + result);

        return "toIndex";
    }
}
