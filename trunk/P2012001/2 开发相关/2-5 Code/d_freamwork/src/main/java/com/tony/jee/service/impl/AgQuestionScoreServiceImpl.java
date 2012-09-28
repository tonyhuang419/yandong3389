package com.tony.jee.service.impl;

import com.tony.jee.dao.base.AgQuestionScoreMapper;
import com.tony.jee.pojo.base.AgQuestionScore;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.AgQuestionScoreService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgQuestionScoreServiceImpl implements AgQuestionScoreService {
    @Autowired
    private AgQuestionScoreMapper agQuestionScoreMapper;

    private static final Logger logger = LoggerFactory.getLogger(AgQuestionScoreServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.agQuestionScoreMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AgQuestionScore selectByPrimaryKey(String pkId) {
        return this.agQuestionScoreMapper.selectByPrimaryKey(pkId);
    }

    public List<AgQuestionScore> selectByExample(Criteria example) {
        return this.agQuestionScoreMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String pkId) {
        return this.agQuestionScoreMapper.deleteByPrimaryKey(pkId);
    }

    public int updateByPrimaryKeySelective(AgQuestionScore record) {
        return this.agQuestionScoreMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AgQuestionScore record) {
        return this.agQuestionScoreMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.agQuestionScoreMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AgQuestionScore record, Criteria example) {
        return this.agQuestionScoreMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AgQuestionScore record, Criteria example) {
        return this.agQuestionScoreMapper.updateByExample(record, example);
    }

    public int insert(AgQuestionScore record) {
        return this.agQuestionScoreMapper.insert(record);
    }

    public int insertSelective(AgQuestionScore record) {
        return this.agQuestionScoreMapper.insertSelective(record);
    }
}