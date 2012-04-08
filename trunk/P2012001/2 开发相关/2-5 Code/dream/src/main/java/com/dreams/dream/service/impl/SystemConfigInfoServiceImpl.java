package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.SystemConfigInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.SystemConfigInfo;
import com.dreams.dream.service.SystemConfigInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemConfigInfoServiceImpl implements SystemConfigInfoService {
    @Autowired
    private SystemConfigInfoMapper systemConfigInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(SystemConfigInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.systemConfigInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public SystemConfigInfo selectByPrimaryKey(Integer systemConfigId) {
        return this.systemConfigInfoMapper.selectByPrimaryKey(systemConfigId);
    }

    public List<SystemConfigInfo> selectByExample(Criteria example) {
        return this.systemConfigInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer systemConfigId) {
        return this.systemConfigInfoMapper.deleteByPrimaryKey(systemConfigId);
    }

    public int updateByPrimaryKeySelective(SystemConfigInfo record) {
        return this.systemConfigInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SystemConfigInfo record) {
        return this.systemConfigInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.systemConfigInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(SystemConfigInfo record, Criteria example) {
        return this.systemConfigInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(SystemConfigInfo record, Criteria example) {
        return this.systemConfigInfoMapper.updateByExample(record, example);
    }

    public int insert(SystemConfigInfo record) {
        return this.systemConfigInfoMapper.insert(record);
    }

    public int insertSelective(SystemConfigInfo record) {
        return this.systemConfigInfoMapper.insertSelective(record);
    }
}