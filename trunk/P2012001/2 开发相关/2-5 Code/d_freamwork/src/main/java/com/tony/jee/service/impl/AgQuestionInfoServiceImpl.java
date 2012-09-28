package com.tony.jee.service.impl;

import com.tony.jee.dao.base.AgQuestionInfoMapper;
import com.tony.jee.pojo.base.AgQuestionInfo;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.AgQuestionInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgQuestionInfoServiceImpl implements AgQuestionInfoService {
    @Autowired
    private AgQuestionInfoMapper agQuestionInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(AgQuestionInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.agQuestionInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AgQuestionInfo selectByPrimaryKey(String pkId) {
        return this.agQuestionInfoMapper.selectByPrimaryKey(pkId);
    }

    public List<AgQuestionInfo> selectByExample(Criteria example) {
        return this.agQuestionInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String pkId) {
        return this.agQuestionInfoMapper.deleteByPrimaryKey(pkId);
    }

    public int updateByPrimaryKeySelective(AgQuestionInfo record) {
        return this.agQuestionInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AgQuestionInfo record) {
        return this.agQuestionInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.agQuestionInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AgQuestionInfo record, Criteria example) {
        return this.agQuestionInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AgQuestionInfo record, Criteria example) {
        return this.agQuestionInfoMapper.updateByExample(record, example);
    }

    public int insert(AgQuestionInfo record) {
        return this.agQuestionInfoMapper.insert(record);
    }

    public int insertSelective(AgQuestionInfo record) {
        return this.agQuestionInfoMapper.insertSelective(record);
    }
}