package com.tony.jee.service.impl;

import com.tony.jee.dao.base.AgQuestionPersonRelMapper;
import com.tony.jee.pojo.base.AgQuestionPersonRel;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.AgQuestionPersonRelService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgQuestionPersonRelServiceImpl implements AgQuestionPersonRelService {
    @Autowired
    private AgQuestionPersonRelMapper agQuestionPersonRelMapper;

    private static final Logger logger = LoggerFactory.getLogger(AgQuestionPersonRelServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.agQuestionPersonRelMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AgQuestionPersonRel selectByPrimaryKey(String pkId) {
        return this.agQuestionPersonRelMapper.selectByPrimaryKey(pkId);
    }

    public List<AgQuestionPersonRel> selectByExample(Criteria example) {
        return this.agQuestionPersonRelMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String pkId) {
        return this.agQuestionPersonRelMapper.deleteByPrimaryKey(pkId);
    }

    public int updateByPrimaryKeySelective(AgQuestionPersonRel record) {
        return this.agQuestionPersonRelMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AgQuestionPersonRel record) {
        return this.agQuestionPersonRelMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.agQuestionPersonRelMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AgQuestionPersonRel record, Criteria example) {
        return this.agQuestionPersonRelMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AgQuestionPersonRel record, Criteria example) {
        return this.agQuestionPersonRelMapper.updateByExample(record, example);
    }

    public int insert(AgQuestionPersonRel record) {
        return this.agQuestionPersonRelMapper.insert(record);
    }

    public int insertSelective(AgQuestionPersonRel record) {
        return this.agQuestionPersonRelMapper.insertSelective(record);
    }
}