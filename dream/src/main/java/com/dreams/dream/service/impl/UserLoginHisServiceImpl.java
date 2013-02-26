package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.UserLoginHisMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserLoginHis;
import com.dreams.dream.service.UserLoginHisService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginHisServiceImpl implements UserLoginHisService {
    @Autowired
    private UserLoginHisMapper userLoginHisMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserLoginHisServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.userLoginHisMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public UserLoginHis selectByPrimaryKey(String loginHisId) {
        return this.userLoginHisMapper.selectByPrimaryKey(loginHisId);
    }

    public List<UserLoginHis> selectByExample(Criteria example) {
        return this.userLoginHisMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String loginHisId) {
        return this.userLoginHisMapper.deleteByPrimaryKey(loginHisId);
    }

    public int updateByPrimaryKeySelective(UserLoginHis record) {
        return this.userLoginHisMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserLoginHis record) {
        return this.userLoginHisMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.userLoginHisMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(UserLoginHis record, Criteria example) {
        return this.userLoginHisMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(UserLoginHis record, Criteria example) {
        return this.userLoginHisMapper.updateByExample(record, example);
    }

    public int insert(UserLoginHis record) {
        return this.userLoginHisMapper.insert(record);
    }

    public int insertSelective(UserLoginHis record) {
        return this.userLoginHisMapper.insertSelective(record);
    }
}