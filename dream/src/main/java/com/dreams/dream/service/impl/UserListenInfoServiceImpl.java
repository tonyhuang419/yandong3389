package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.UserListenInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserListenInfo;
import com.dreams.dream.service.UserListenInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserListenInfoServiceImpl implements UserListenInfoService {
    @Autowired
    private UserListenInfoMapper userListenInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserListenInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.userListenInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public UserListenInfo selectByPrimaryKey(String userListenId) {
        return this.userListenInfoMapper.selectByPrimaryKey(userListenId);
    }

    public List<UserListenInfo> selectByExample(Criteria example) {
        return this.userListenInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String userListenId) {
        return this.userListenInfoMapper.deleteByPrimaryKey(userListenId);
    }

    public int updateByPrimaryKeySelective(UserListenInfo record) {
        return this.userListenInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserListenInfo record) {
        return this.userListenInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.userListenInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(UserListenInfo record, Criteria example) {
        return this.userListenInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(UserListenInfo record, Criteria example) {
        return this.userListenInfoMapper.updateByExample(record, example);
    }

    public int insert(UserListenInfo record) {
        return this.userListenInfoMapper.insert(record);
    }

    public int insertSelective(UserListenInfo record) {
        return this.userListenInfoMapper.insertSelective(record);
    }
}