package com.tony.jee.service.impl;

import com.tony.jee.dao.base.AgAuditPersonMapper;
import com.tony.jee.pojo.base.AgAuditPerson;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.AgAuditPersonService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgAuditPersonServiceImpl implements AgAuditPersonService {
    @Autowired
    private AgAuditPersonMapper agAuditPersonMapper;

    private static final Logger logger = LoggerFactory.getLogger(AgAuditPersonServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.agAuditPersonMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AgAuditPerson selectByPrimaryKey(String pkId) {
        return this.agAuditPersonMapper.selectByPrimaryKey(pkId);
    }

    public List<AgAuditPerson> selectByExample(Criteria example) {
        return this.agAuditPersonMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String pkId) {
        return this.agAuditPersonMapper.deleteByPrimaryKey(pkId);
    }

    public int updateByPrimaryKeySelective(AgAuditPerson record) {
        return this.agAuditPersonMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AgAuditPerson record) {
        return this.agAuditPersonMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.agAuditPersonMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AgAuditPerson record, Criteria example) {
        return this.agAuditPersonMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AgAuditPerson record, Criteria example) {
        return this.agAuditPersonMapper.updateByExample(record, example);
    }

    public int insert(AgAuditPerson record) {
        return this.agAuditPersonMapper.insert(record);
    }

    public int insertSelective(AgAuditPerson record) {
        return this.agAuditPersonMapper.insertSelective(record);
    }
}