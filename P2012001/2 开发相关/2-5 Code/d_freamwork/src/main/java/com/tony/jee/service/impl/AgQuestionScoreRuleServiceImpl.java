package com.tony.jee.service.impl;

import com.tony.jee.dao.base.AgQuestionScoreRuleMapper;
import com.tony.jee.pojo.base.AgQuestionScoreRule;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.AgQuestionScoreRuleService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgQuestionScoreRuleServiceImpl implements AgQuestionScoreRuleService {
    @Autowired
    private AgQuestionScoreRuleMapper agQuestionScoreRuleMapper;

    private static final Logger logger = LoggerFactory.getLogger(AgQuestionScoreRuleServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.agQuestionScoreRuleMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AgQuestionScoreRule selectByPrimaryKey(String pkId) {
        return this.agQuestionScoreRuleMapper.selectByPrimaryKey(pkId);
    }

    public List<AgQuestionScoreRule> selectByExample(Criteria example) {
        return this.agQuestionScoreRuleMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String pkId) {
        return this.agQuestionScoreRuleMapper.deleteByPrimaryKey(pkId);
    }

    public int updateByPrimaryKeySelective(AgQuestionScoreRule record) {
        return this.agQuestionScoreRuleMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AgQuestionScoreRule record) {
        return this.agQuestionScoreRuleMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.agQuestionScoreRuleMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AgQuestionScoreRule record, Criteria example) {
        return this.agQuestionScoreRuleMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AgQuestionScoreRule record, Criteria example) {
        return this.agQuestionScoreRuleMapper.updateByExample(record, example);
    }

    public int insert(AgQuestionScoreRule record) {
        return this.agQuestionScoreRuleMapper.insert(record);
    }

    public int insertSelective(AgQuestionScoreRule record) {
        return this.agQuestionScoreRuleMapper.insertSelective(record);
    }
}