package com.tony.jee.service.impl;

import com.tony.jee.dao.base.AgQuestionStateRuleMapper;
import com.tony.jee.pojo.base.AgQuestionStateRule;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.AgQuestionStateRuleService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgQuestionStateRuleServiceImpl implements AgQuestionStateRuleService {
    @Autowired
    private AgQuestionStateRuleMapper agQuestionStateRuleMapper;

    private static final Logger logger = LoggerFactory.getLogger(AgQuestionStateRuleServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.agQuestionStateRuleMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AgQuestionStateRule selectByPrimaryKey(String pkId) {
        return this.agQuestionStateRuleMapper.selectByPrimaryKey(pkId);
    }

    public List<AgQuestionStateRule> selectByExample(Criteria example) {
        return this.agQuestionStateRuleMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String pkId) {
        return this.agQuestionStateRuleMapper.deleteByPrimaryKey(pkId);
    }

    public int updateByPrimaryKeySelective(AgQuestionStateRule record) {
        return this.agQuestionStateRuleMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AgQuestionStateRule record) {
        return this.agQuestionStateRuleMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.agQuestionStateRuleMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AgQuestionStateRule record, Criteria example) {
        return this.agQuestionStateRuleMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AgQuestionStateRule record, Criteria example) {
        return this.agQuestionStateRuleMapper.updateByExample(record, example);
    }

    public int insert(AgQuestionStateRule record) {
        return this.agQuestionStateRuleMapper.insert(record);
    }

    public int insertSelective(AgQuestionStateRule record) {
        return this.agQuestionStateRuleMapper.insertSelective(record);
    }
}