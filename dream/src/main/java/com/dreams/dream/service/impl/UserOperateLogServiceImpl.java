package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.UserOperateLogMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserOperateLog;
import com.dreams.dream.service.UserOperateLogService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserOperateLogServiceImpl implements UserOperateLogService {
    @Autowired
    private UserOperateLogMapper userOperateLogMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserOperateLogServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.userOperateLogMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public UserOperateLog selectByPrimaryKey(String userOperateId) {
        return this.userOperateLogMapper.selectByPrimaryKey(userOperateId);
    }

    public List<UserOperateLog> selectByExample(Criteria example) {
        return this.userOperateLogMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String userOperateId) {
        return this.userOperateLogMapper.deleteByPrimaryKey(userOperateId);
    }

    public int updateByPrimaryKeySelective(UserOperateLog record) {
        return this.userOperateLogMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserOperateLog record) {
        return this.userOperateLogMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.userOperateLogMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(UserOperateLog record, Criteria example) {
        return this.userOperateLogMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(UserOperateLog record, Criteria example) {
        return this.userOperateLogMapper.updateByExample(record, example);
    }

    public int insert(UserOperateLog record) {
        return this.userOperateLogMapper.insert(record);
    }

    public int insertSelective(UserOperateLog record) {
        return this.userOperateLogMapper.insertSelective(record);
    }
}