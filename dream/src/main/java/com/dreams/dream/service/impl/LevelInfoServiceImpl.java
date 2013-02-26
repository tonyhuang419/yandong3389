package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.LevelInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.LevelInfo;
import com.dreams.dream.service.LevelInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LevelInfoServiceImpl implements LevelInfoService {
    @Autowired
    private LevelInfoMapper levelInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(LevelInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.levelInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public LevelInfo selectByPrimaryKey(String levelId) {
        return this.levelInfoMapper.selectByPrimaryKey(levelId);
    }

    public List<LevelInfo> selectByExample(Criteria example) {
        return this.levelInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String levelId) {
        return this.levelInfoMapper.deleteByPrimaryKey(levelId);
    }

    public int updateByPrimaryKeySelective(LevelInfo record) {
        return this.levelInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LevelInfo record) {
        return this.levelInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.levelInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(LevelInfo record, Criteria example) {
        return this.levelInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(LevelInfo record, Criteria example) {
        return this.levelInfoMapper.updateByExample(record, example);
    }

    public int insert(LevelInfo record) {
        return this.levelInfoMapper.insert(record);
    }

    public int insertSelective(LevelInfo record) {
        return this.levelInfoMapper.insertSelective(record);
    }
}