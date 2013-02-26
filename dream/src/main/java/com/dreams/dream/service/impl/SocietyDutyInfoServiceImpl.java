package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.SocietyDutyInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.SocietyDutyInfo;
import com.dreams.dream.service.SocietyDutyInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocietyDutyInfoServiceImpl implements SocietyDutyInfoService {
    @Autowired
    private SocietyDutyInfoMapper societyDutyInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(SocietyDutyInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.societyDutyInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public SocietyDutyInfo selectByPrimaryKey(String societyDutyId) {
        return this.societyDutyInfoMapper.selectByPrimaryKey(societyDutyId);
    }

    public List<SocietyDutyInfo> selectByExample(Criteria example) {
        return this.societyDutyInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String societyDutyId) {
        return this.societyDutyInfoMapper.deleteByPrimaryKey(societyDutyId);
    }

    public int updateByPrimaryKeySelective(SocietyDutyInfo record) {
        return this.societyDutyInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SocietyDutyInfo record) {
        return this.societyDutyInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.societyDutyInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(SocietyDutyInfo record, Criteria example) {
        return this.societyDutyInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(SocietyDutyInfo record, Criteria example) {
        return this.societyDutyInfoMapper.updateByExample(record, example);
    }

    public int insert(SocietyDutyInfo record) {
        return this.societyDutyInfoMapper.insert(record);
    }

    public int insertSelective(SocietyDutyInfo record) {
        return this.societyDutyInfoMapper.insertSelective(record);
    }
}