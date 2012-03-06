package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.SupportInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.SupportInfo;
import com.dreams.dream.service.SupportInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupportInfoServiceImpl implements SupportInfoService {
    @Autowired
    private SupportInfoMapper supportInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(SupportInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.supportInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public SupportInfo selectByPrimaryKey(Integer supportId) {
        return this.supportInfoMapper.selectByPrimaryKey(supportId);
    }

    public List<SupportInfo> selectByExample(Criteria example) {
        return this.supportInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer supportId) {
        return this.supportInfoMapper.deleteByPrimaryKey(supportId);
    }

    public int updateByPrimaryKeySelective(SupportInfo record) {
        return this.supportInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SupportInfo record) {
        return this.supportInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.supportInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(SupportInfo record, Criteria example) {
        return this.supportInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(SupportInfo record, Criteria example) {
        return this.supportInfoMapper.updateByExample(record, example);
    }

    public int insert(SupportInfo record) {
        return this.supportInfoMapper.insert(record);
    }

    public int insertSelective(SupportInfo record) {
        return this.supportInfoMapper.insertSelective(record);
    }
}