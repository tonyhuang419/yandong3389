package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.UserSocietyInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserSocietyInfo;
import com.dreams.dream.service.UserSocietyInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSocietyInfoServiceImpl implements UserSocietyInfoService {
    @Autowired
    private UserSocietyInfoMapper userSocietyInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserSocietyInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.userSocietyInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public UserSocietyInfo selectByPrimaryKey(String userSocietyId) {
        return this.userSocietyInfoMapper.selectByPrimaryKey(userSocietyId);
    }

    public List<UserSocietyInfo> selectByExample(Criteria example) {
        return this.userSocietyInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String userSocietyId) {
        return this.userSocietyInfoMapper.deleteByPrimaryKey(userSocietyId);
    }

    public int updateByPrimaryKeySelective(UserSocietyInfo record) {
        return this.userSocietyInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserSocietyInfo record) {
        return this.userSocietyInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.userSocietyInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(UserSocietyInfo record, Criteria example) {
        return this.userSocietyInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(UserSocietyInfo record, Criteria example) {
        return this.userSocietyInfoMapper.updateByExample(record, example);
    }

    public int insert(UserSocietyInfo record) {
        return this.userSocietyInfoMapper.insert(record);
    }

    public int insertSelective(UserSocietyInfo record) {
        return this.userSocietyInfoMapper.insertSelective(record);
    }
}