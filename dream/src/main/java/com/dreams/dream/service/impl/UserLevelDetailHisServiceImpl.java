package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.UserLevelDetailHisMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserLevelDetailHis;
import com.dreams.dream.service.UserLevelDetailHisService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLevelDetailHisServiceImpl implements UserLevelDetailHisService {
    @Autowired
    private UserLevelDetailHisMapper userLevelDetailHisMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserLevelDetailHisServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.userLevelDetailHisMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public UserLevelDetailHis selectByPrimaryKey(String levelDetailId) {
        return this.userLevelDetailHisMapper.selectByPrimaryKey(levelDetailId);
    }

    public List<UserLevelDetailHis> selectByExample(Criteria example) {
        return this.userLevelDetailHisMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String levelDetailId) {
        return this.userLevelDetailHisMapper.deleteByPrimaryKey(levelDetailId);
    }

    public int updateByPrimaryKeySelective(UserLevelDetailHis record) {
        return this.userLevelDetailHisMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserLevelDetailHis record) {
        return this.userLevelDetailHisMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.userLevelDetailHisMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(UserLevelDetailHis record, Criteria example) {
        return this.userLevelDetailHisMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(UserLevelDetailHis record, Criteria example) {
        return this.userLevelDetailHisMapper.updateByExample(record, example);
    }

    public int insert(UserLevelDetailHis record) {
        return this.userLevelDetailHisMapper.insert(record);
    }

    public int insertSelective(UserLevelDetailHis record) {
        return this.userLevelDetailHisMapper.insertSelective(record);
    }
}