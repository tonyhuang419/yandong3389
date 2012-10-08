package com.tony.jee.service.impl;

import com.tony.jee.common.pager.PagerModel;
import com.tony.jee.dao.base.AgDomainMapper;
import com.tony.jee.pojo.base.AgDomain;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.AgDomainService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgDomainServiceImpl implements AgDomainService {
    @Autowired
    private AgDomainMapper agDomainMapper;

    private static final Logger logger = LoggerFactory.getLogger(AgDomainServiceImpl.class);

    public PagerModel<AgDomain> findPageModel(Criteria example){
        
        int count = this.agDomainMapper.countByExample(null);
        
        List<AgDomain> datas = this.agDomainMapper.selectByExample(example);
        
        PagerModel<AgDomain> pagerModel = new PagerModel<AgDomain>();
        
        pagerModel.setDatas(datas);
        pagerModel.setTotal(count);
        
        return pagerModel;
    }
    
    public int countByExample(Criteria example) {
        int count = this.agDomainMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AgDomain selectByPrimaryKey(String pkId) {
        return this.agDomainMapper.selectByPrimaryKey(pkId);
    }

    public List<AgDomain> selectByExample(Criteria example) {
        return this.agDomainMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String pkId) {
        return this.agDomainMapper.deleteByPrimaryKey(pkId);
    }

    public int updateByPrimaryKeySelective(AgDomain record) {
        return this.agDomainMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AgDomain record) {
        return this.agDomainMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.agDomainMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AgDomain record, Criteria example) {
        return this.agDomainMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AgDomain record, Criteria example) {
        return this.agDomainMapper.updateByExample(record, example);
    }

    public int insert(AgDomain record) {
        return this.agDomainMapper.insert(record);
    }

    public int insertSelective(AgDomain record) {
        return this.agDomainMapper.insertSelective(record);
    }
}