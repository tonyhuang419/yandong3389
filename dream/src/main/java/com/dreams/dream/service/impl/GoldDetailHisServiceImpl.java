package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.GoldDetailHisMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.GoldDetailHis;
import com.dreams.dream.service.GoldDetailHisService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoldDetailHisServiceImpl implements GoldDetailHisService {
    @Autowired
    private GoldDetailHisMapper goldDetailHisMapper;

    private static final Logger logger = LoggerFactory.getLogger(GoldDetailHisServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.goldDetailHisMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public GoldDetailHis selectByPrimaryKey(String goldDetailId) {
        return this.goldDetailHisMapper.selectByPrimaryKey(goldDetailId);
    }

    public List<GoldDetailHis> selectByExample(Criteria example) {
        return this.goldDetailHisMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String goldDetailId) {
        return this.goldDetailHisMapper.deleteByPrimaryKey(goldDetailId);
    }

    public int updateByPrimaryKeySelective(GoldDetailHis record) {
        return this.goldDetailHisMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(GoldDetailHis record) {
        return this.goldDetailHisMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.goldDetailHisMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(GoldDetailHis record, Criteria example) {
        return this.goldDetailHisMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(GoldDetailHis record, Criteria example) {
        return this.goldDetailHisMapper.updateByExample(record, example);
    }

    public int insert(GoldDetailHis record) {
        return this.goldDetailHisMapper.insert(record);
    }

    public int insertSelective(GoldDetailHis record) {
        return this.goldDetailHisMapper.insertSelective(record);
    }
}