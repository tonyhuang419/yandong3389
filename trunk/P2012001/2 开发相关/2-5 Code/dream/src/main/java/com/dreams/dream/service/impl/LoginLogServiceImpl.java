package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.LoginLogMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.LoginLog;
import com.dreams.dream.service.LoginLogService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginLogServiceImpl implements LoginLogService {
    @Autowired
    private LoginLogMapper loginLogMapper;

    private static final Logger logger = LoggerFactory.getLogger(LoginLogServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.loginLogMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public LoginLog selectByPrimaryKey(Integer loginLogId) {
        return this.loginLogMapper.selectByPrimaryKey(loginLogId);
    }

    public List<LoginLog> selectByExample(Criteria example) {
        return this.loginLogMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer loginLogId) {
        return this.loginLogMapper.deleteByPrimaryKey(loginLogId);
    }

    public int updateByPrimaryKeySelective(LoginLog record) {
        return this.loginLogMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LoginLog record) {
        return this.loginLogMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.loginLogMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(LoginLog record, Criteria example) {
        return this.loginLogMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(LoginLog record, Criteria example) {
        return this.loginLogMapper.updateByExample(record, example);
    }

    public int insert(LoginLog record) {
        return this.loginLogMapper.insert(record);
    }

    public int insertSelective(LoginLog record) {
        return this.loginLogMapper.insertSelective(record);
    }
}