package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.SubscribeInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.SubscribeInfo;
import com.dreams.dream.service.SubscribeInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscribeInfoServiceImpl implements SubscribeInfoService {
    @Autowired
    private SubscribeInfoMapper subscribeInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(SubscribeInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.subscribeInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public SubscribeInfo selectByPrimaryKey(Integer subscribeId) {
        return this.subscribeInfoMapper.selectByPrimaryKey(subscribeId);
    }

    public List<SubscribeInfo> selectByExample(Criteria example) {
        return this.subscribeInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer subscribeId) {
        return this.subscribeInfoMapper.deleteByPrimaryKey(subscribeId);
    }

    public int updateByPrimaryKeySelective(SubscribeInfo record) {
        return this.subscribeInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SubscribeInfo record) {
        return this.subscribeInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.subscribeInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(SubscribeInfo record, Criteria example) {
        return this.subscribeInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(SubscribeInfo record, Criteria example) {
        return this.subscribeInfoMapper.updateByExample(record, example);
    }

    public int insert(SubscribeInfo record) {
        return this.subscribeInfoMapper.insert(record);
    }

    public int insertSelective(SubscribeInfo record) {
        return this.subscribeInfoMapper.insertSelective(record);
    }
}