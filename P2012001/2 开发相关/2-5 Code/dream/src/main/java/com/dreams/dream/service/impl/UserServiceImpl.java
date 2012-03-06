package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.UserMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.User;
import com.dreams.dream.service.UserService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.userMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public User selectByPrimaryKey(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    public List<User> selectByExample(Criteria example) {
        return this.userMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.userMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(User record) {
        return this.userMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(User record) {
        return this.userMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.userMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(User record, Criteria example) {
        return this.userMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(User record, Criteria example) {
        return this.userMapper.updateByExample(record, example);
    }

    public int insert(User record) {
        return this.userMapper.insert(record);
    }

    public int insertSelective(User record) {
        return this.userMapper.insertSelective(record);
    }
}