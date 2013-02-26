package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.GameInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.GameInfo;
import com.dreams.dream.service.GameInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameInfoServiceImpl implements GameInfoService {
    @Autowired
    private GameInfoMapper gameInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(GameInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.gameInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public GameInfo selectByPrimaryKey(String gameId) {
        return this.gameInfoMapper.selectByPrimaryKey(gameId);
    }

    public List<GameInfo> selectByExample(Criteria example) {
        return this.gameInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String gameId) {
        return this.gameInfoMapper.deleteByPrimaryKey(gameId);
    }

    public int updateByPrimaryKeySelective(GameInfo record) {
        return this.gameInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(GameInfo record) {
        return this.gameInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.gameInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(GameInfo record, Criteria example) {
        return this.gameInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(GameInfo record, Criteria example) {
        return this.gameInfoMapper.updateByExample(record, example);
    }

    public int insert(GameInfo record) {
        return this.gameInfoMapper.insert(record);
    }

    public int insertSelective(GameInfo record) {
        return this.gameInfoMapper.insertSelective(record);
    }
}