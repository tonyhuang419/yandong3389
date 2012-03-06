package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.AdminInfoMapper;
import com.dreams.dream.pojo.base.AdminInfo;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.service.AdminInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminInfoServiceImpl implements AdminInfoService {
    @Autowired
    private AdminInfoMapper adminInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(AdminInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.adminInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AdminInfo selectByPrimaryKey(Integer userId) {
        return this.adminInfoMapper.selectByPrimaryKey(userId);
    }

    public List<AdminInfo> selectByExample(Criteria example) {
        return this.adminInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer userId) {
        return this.adminInfoMapper.deleteByPrimaryKey(userId);
    }

    public int updateByPrimaryKeySelective(AdminInfo record) {
        return this.adminInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AdminInfo record) {
        return this.adminInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.adminInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AdminInfo record, Criteria example) {
        return this.adminInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AdminInfo record, Criteria example) {
        return this.adminInfoMapper.updateByExample(record, example);
    }

    public int insert(AdminInfo record) {
        return this.adminInfoMapper.insert(record);
    }

    public int insertSelective(AdminInfo record) {
        return this.adminInfoMapper.insertSelective(record);
    }
}