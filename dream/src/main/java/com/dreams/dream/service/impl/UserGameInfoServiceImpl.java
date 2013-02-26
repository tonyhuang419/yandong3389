package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.UserGameInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserGameInfo;
import com.dreams.dream.service.UserGameInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserGameInfoServiceImpl implements UserGameInfoService {
    @Autowired
    private UserGameInfoMapper userGameInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserGameInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.userGameInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public UserGameInfo selectByPrimaryKey(String userGameId) {
        return this.userGameInfoMapper.selectByPrimaryKey(userGameId);
    }

    public List<UserGameInfo> selectByExample(Criteria example) {
        return this.userGameInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String userGameId) {
        return this.userGameInfoMapper.deleteByPrimaryKey(userGameId);
    }

    public int updateByPrimaryKeySelective(UserGameInfo record) {
        return this.userGameInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserGameInfo record) {
        return this.userGameInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.userGameInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(UserGameInfo record, Criteria example) {
        return this.userGameInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(UserGameInfo record, Criteria example) {
        return this.userGameInfoMapper.updateByExample(record, example);
    }

    public int insert(UserGameInfo record) {
        return this.userGameInfoMapper.insert(record);
    }

    public int insertSelective(UserGameInfo record) {
        return this.userGameInfoMapper.insertSelective(record);
    }
}