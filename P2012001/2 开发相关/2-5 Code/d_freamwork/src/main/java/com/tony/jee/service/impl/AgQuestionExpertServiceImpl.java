package com.tony.jee.service.impl;

import com.tony.jee.dao.base.AgQuestionExpertMapper;
import com.tony.jee.pojo.base.AgQuestionExpert;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.AgQuestionExpertService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgQuestionExpertServiceImpl implements AgQuestionExpertService {
    @Autowired
    private AgQuestionExpertMapper agQuestionExpertMapper;

    private static final Logger logger = LoggerFactory.getLogger(AgQuestionExpertServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.agQuestionExpertMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AgQuestionExpert selectByPrimaryKey(String pkId) {
        return this.agQuestionExpertMapper.selectByPrimaryKey(pkId);
    }

    public List<AgQuestionExpert> selectByExample(Criteria example) {
        return this.agQuestionExpertMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String pkId) {
        return this.agQuestionExpertMapper.deleteByPrimaryKey(pkId);
    }

    public int updateByPrimaryKeySelective(AgQuestionExpert record) {
        return this.agQuestionExpertMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AgQuestionExpert record) {
        return this.agQuestionExpertMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.agQuestionExpertMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AgQuestionExpert record, Criteria example) {
        return this.agQuestionExpertMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AgQuestionExpert record, Criteria example) {
        return this.agQuestionExpertMapper.updateByExample(record, example);
    }

    public int insert(AgQuestionExpert record) {
        return this.agQuestionExpertMapper.insert(record);
    }

    public int insertSelective(AgQuestionExpert record) {
        return this.agQuestionExpertMapper.insertSelective(record);
    }
}