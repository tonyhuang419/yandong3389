package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.GiftInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.GiftInfo;
import com.dreams.dream.service.GiftInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiftInfoServiceImpl implements GiftInfoService {
    @Autowired
    private GiftInfoMapper giftInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(GiftInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.giftInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public GiftInfo selectByPrimaryKey(Integer giftId) {
        return this.giftInfoMapper.selectByPrimaryKey(giftId);
    }

    public List<GiftInfo> selectByExample(Criteria example) {
        return this.giftInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer giftId) {
        return this.giftInfoMapper.deleteByPrimaryKey(giftId);
    }

    public int updateByPrimaryKeySelective(GiftInfo record) {
        return this.giftInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(GiftInfo record) {
        return this.giftInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.giftInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(GiftInfo record, Criteria example) {
        return this.giftInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(GiftInfo record, Criteria example) {
        return this.giftInfoMapper.updateByExample(record, example);
    }

    public int insert(GiftInfo record) {
        return this.giftInfoMapper.insert(record);
    }

    public int insertSelective(GiftInfo record) {
        return this.giftInfoMapper.insertSelective(record);
    }
}