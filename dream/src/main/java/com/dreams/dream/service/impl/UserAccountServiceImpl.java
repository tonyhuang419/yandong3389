package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.UserAccountMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserAccount;
import com.dreams.dream.service.UserAccountService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl implements UserAccountService {
    @Autowired
    private UserAccountMapper userAccountMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserAccountServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.userAccountMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public UserAccount selectByPrimaryKey(String userAccountId) {
        return this.userAccountMapper.selectByPrimaryKey(userAccountId);
    }

    public List<UserAccount> selectByExample(Criteria example) {
        return this.userAccountMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String userAccountId) {
        return this.userAccountMapper.deleteByPrimaryKey(userAccountId);
    }

    public int updateByPrimaryKeySelective(UserAccount record) {
        return this.userAccountMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserAccount record) {
        return this.userAccountMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.userAccountMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(UserAccount record, Criteria example) {
        return this.userAccountMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(UserAccount record, Criteria example) {
        return this.userAccountMapper.updateByExample(record, example);
    }

    public int insert(UserAccount record) {
        return this.userAccountMapper.insert(record);
    }

    public int insertSelective(UserAccount record) {
        return this.userAccountMapper.insertSelective(record);
    }
}