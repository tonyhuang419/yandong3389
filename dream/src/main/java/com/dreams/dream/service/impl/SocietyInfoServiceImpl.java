package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.SocietyInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.SocietyInfo;
import com.dreams.dream.service.SocietyInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocietyInfoServiceImpl implements SocietyInfoService {
    @Autowired
    private SocietyInfoMapper societyInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(SocietyInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.societyInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public SocietyInfo selectByPrimaryKey(String societyId) {
        return this.societyInfoMapper.selectByPrimaryKey(societyId);
    }

    public List<SocietyInfo> selectByExample(Criteria example) {
        return this.societyInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String societyId) {
        return this.societyInfoMapper.deleteByPrimaryKey(societyId);
    }

    public int updateByPrimaryKeySelective(SocietyInfo record) {
        return this.societyInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SocietyInfo record) {
        return this.societyInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.societyInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(SocietyInfo record, Criteria example) {
        return this.societyInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(SocietyInfo record, Criteria example) {
        return this.societyInfoMapper.updateByExample(record, example);
    }

    public int insert(SocietyInfo record) {
        return this.societyInfoMapper.insert(record);
    }

    public int insertSelective(SocietyInfo record) {
        return this.societyInfoMapper.insertSelective(record);
    }
}