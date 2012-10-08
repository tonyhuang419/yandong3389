package com.tony.jee.web.action;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.tony.jee.common.action.BaseAction;
import com.tony.jee.common.action.BaseActionImpl;
import com.tony.jee.common.pager.PagerModel;
import com.tony.jee.common.utils.PageUtil;
import com.tony.jee.pojo.base.AgDomain;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.AgDomainService;

@SuppressWarnings("serial")
public class PagerAction extends BaseActionImpl implements BaseAction {
    
    @Autowired
    AgDomainService agDomainService = null;
    
    public PagerModel<AgDomain> pager;
    
    public PagerModel<AgDomain> getPager() {
        return pager;
    }

    public void setPager(PagerModel<AgDomain> pager) {
        this.pager = pager;
    }

    public String toIndex(){
        
        return SUCCESS;
    }
    
    public String findList(){

        int startPage = pager.getOffset();
        
        int endPage = PageUtil.getEndRecord(startPage, pager.getPerpage());
        
        // 设置分页参数
        Criteria example = new Criteria();
        example.setOracleStart(startPage);
        example.setOracleEnd(endPage);
        example.setOrderByClause("pk_id asc");
        
        pager = agDomainService.findPageModel(example);
        
        setAttribute("pm", pager);
        
        return SUCCESS;
    }
    
    public String insertList(){
        
        AgDomain record = null;
        
        for (int i = 180; i < 200; i++) {
            
            record = new AgDomain();
            
            record.setCompCode("C"+i);
            record.setDomainId("dnId" + i);
            record.setDomainName("domainName"+i);
            record.setMakeDate(new Date());
            record.setMakeEmp("1"+i);
            record.setModifyDate(new Date());
            record.setModifyEmp("1"+i);
            record.setPkId(String.valueOf(i) + UUID.randomUUID().toString());
            record.setSysCode("AA");
            agDomainService.insertSelective(record);
        }
        
        return SUCCESS;
    }
    
}
