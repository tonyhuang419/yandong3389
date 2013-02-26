package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.PowerInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.PowerInfo;
import com.dreams.dream.service.PowerInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PowerInfoServiceImpl implements PowerInfoService {
    @Autowired
    private PowerInfoMapper powerInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(PowerInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.powerInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public PowerInfo selectByPrimaryKey(String powerId) {
        return this.powerInfoMapper.selectByPrimaryKey(powerId);
    }

    public List<PowerInfo> selectByExample(Criteria example) {
        return this.powerInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String powerId) {
        return this.powerInfoMapper.deleteByPrimaryKey(powerId);
    }

    public int updateByPrimaryKeySelective(PowerInfo record) {
        return this.powerInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(PowerInfo record) {
        return this.powerInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.powerInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(PowerInfo record, Criteria example) {
        return this.powerInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(PowerInfo record, Criteria example) {
        return this.powerInfoMapper.updateByExample(record, example);
    }

    public int insert(PowerInfo record) {
        return this.powerInfoMapper.insert(record);
    }

    public int insertSelective(PowerInfo record) {
        return this.powerInfoMapper.insertSelective(record);
    }
}