package com.tony.jee.service.impl;

import com.tony.jee.dao.base.AgQuestionBelongMapper;
import com.tony.jee.pojo.base.AgQuestionBelong;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.AgQuestionBelongService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgQuestionBelongServiceImpl implements AgQuestionBelongService {
    @Autowired
    private AgQuestionBelongMapper agQuestionBelongMapper;

    private static final Logger logger = LoggerFactory.getLogger(AgQuestionBelongServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.agQuestionBelongMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AgQuestionBelong selectByPrimaryKey(String pkId) {
        return this.agQuestionBelongMapper.selectByPrimaryKey(pkId);
    }

    public List<AgQuestionBelong> selectByExample(Criteria example) {
        return this.agQuestionBelongMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String pkId) {
        return this.agQuestionBelongMapper.deleteByPrimaryKey(pkId);
    }

    public int updateByPrimaryKeySelective(AgQuestionBelong record) {
        return this.agQuestionBelongMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AgQuestionBelong record) {
        return this.agQuestionBelongMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.agQuestionBelongMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AgQuestionBelong record, Criteria example) {
        return this.agQuestionBelongMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AgQuestionBelong record, Criteria example) {
        return this.agQuestionBelongMapper.updateByExample(record, example);
    }

    public int insert(AgQuestionBelong record) {
        return this.agQuestionBelongMapper.insert(record);
    }

    public int insertSelective(AgQuestionBelong record) {
        return this.agQuestionBelongMapper.insertSelective(record);
    }
}