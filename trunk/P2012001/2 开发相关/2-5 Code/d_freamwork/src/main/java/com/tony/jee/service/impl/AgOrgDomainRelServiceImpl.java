package com.tony.jee.service.impl;

import com.tony.jee.dao.base.AgOrgDomainRelMapper;
import com.tony.jee.pojo.base.AgOrgDomainRel;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.AgOrgDomainRelService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgOrgDomainRelServiceImpl implements AgOrgDomainRelService {
    @Autowired
    private AgOrgDomainRelMapper agOrgDomainRelMapper;

    private static final Logger logger = LoggerFactory.getLogger(AgOrgDomainRelServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.agOrgDomainRelMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AgOrgDomainRel selectByPrimaryKey(String pkId) {
        return this.agOrgDomainRelMapper.selectByPrimaryKey(pkId);
    }

    public List<AgOrgDomainRel> selectByExample(Criteria example) {
        return this.agOrgDomainRelMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String pkId) {
        return this.agOrgDomainRelMapper.deleteByPrimaryKey(pkId);
    }

    public int updateByPrimaryKeySelective(AgOrgDomainRel record) {
        return this.agOrgDomainRelMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AgOrgDomainRel record) {
        return this.agOrgDomainRelMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.agOrgDomainRelMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AgOrgDomainRel record, Criteria example) {
        return this.agOrgDomainRelMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AgOrgDomainRel record, Criteria example) {
        return this.agOrgDomainRelMapper.updateByExample(record, example);
    }

    public int insert(AgOrgDomainRel record) {
        return this.agOrgDomainRelMapper.insert(record);
    }

    public int insertSelective(AgOrgDomainRel record) {
        return this.agOrgDomainRelMapper.insertSelective(record);
    }
}