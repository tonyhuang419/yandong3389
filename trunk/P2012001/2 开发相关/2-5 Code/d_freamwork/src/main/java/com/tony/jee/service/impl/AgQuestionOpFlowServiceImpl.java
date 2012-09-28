package com.tony.jee.service.impl;

import com.tony.jee.dao.base.AgQuestionOpFlowMapper;
import com.tony.jee.pojo.base.AgQuestionOpFlow;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.AgQuestionOpFlowService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgQuestionOpFlowServiceImpl implements AgQuestionOpFlowService {
    @Autowired
    private AgQuestionOpFlowMapper agQuestionOpFlowMapper;

    private static final Logger logger = LoggerFactory.getLogger(AgQuestionOpFlowServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.agQuestionOpFlowMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AgQuestionOpFlow selectByPrimaryKey(String pkId) {
        return this.agQuestionOpFlowMapper.selectByPrimaryKey(pkId);
    }

    public List<AgQuestionOpFlow> selectByExample(Criteria example) {
        return this.agQuestionOpFlowMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String pkId) {
        return this.agQuestionOpFlowMapper.deleteByPrimaryKey(pkId);
    }

    public int updateByPrimaryKeySelective(AgQuestionOpFlow record) {
        return this.agQuestionOpFlowMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AgQuestionOpFlow record) {
        return this.agQuestionOpFlowMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.agQuestionOpFlowMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AgQuestionOpFlow record, Criteria example) {
        return this.agQuestionOpFlowMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AgQuestionOpFlow record, Criteria example) {
        return this.agQuestionOpFlowMapper.updateByExample(record, example);
    }

    public int insert(AgQuestionOpFlow record) {
        return this.agQuestionOpFlowMapper.insert(record);
    }

    public int insertSelective(AgQuestionOpFlow record) {
        return this.agQuestionOpFlowMapper.insertSelective(record);
    }
}