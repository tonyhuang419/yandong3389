package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.UserCommentInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserCommentInfo;
import com.dreams.dream.service.UserCommentInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCommentInfoServiceImpl implements UserCommentInfoService {
    @Autowired
    private UserCommentInfoMapper userCommentInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserCommentInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.userCommentInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public UserCommentInfo selectByPrimaryKey(Integer userCommentId) {
        return this.userCommentInfoMapper.selectByPrimaryKey(userCommentId);
    }

    public List<UserCommentInfo> selectByExample(Criteria example) {
        return this.userCommentInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer userCommentId) {
        return this.userCommentInfoMapper.deleteByPrimaryKey(userCommentId);
    }

    public int updateByPrimaryKeySelective(UserCommentInfo record) {
        return this.userCommentInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserCommentInfo record) {
        return this.userCommentInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.userCommentInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(UserCommentInfo record, Criteria example) {
        return this.userCommentInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(UserCommentInfo record, Criteria example) {
        return this.userCommentInfoMapper.updateByExample(record, example);
    }

    public int insert(UserCommentInfo record) {
        return this.userCommentInfoMapper.insert(record);
    }

    public int insertSelective(UserCommentInfo record) {
        return this.userCommentInfoMapper.insertSelective(record);
    }
}