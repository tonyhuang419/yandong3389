package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.WeiboInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.WeiboInfo;
import com.dreams.dream.service.WeiboInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeiboInfoServiceImpl implements WeiboInfoService {
    @Autowired
    private WeiboInfoMapper weiboInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(WeiboInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.weiboInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public WeiboInfo selectByPrimaryKey(String weiboId) {
        return this.weiboInfoMapper.selectByPrimaryKey(weiboId);
    }

    public List<WeiboInfo> selectByExample(Criteria example) {
        return this.weiboInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String weiboId) {
        return this.weiboInfoMapper.deleteByPrimaryKey(weiboId);
    }

    public int updateByPrimaryKeySelective(WeiboInfo record) {
        return this.weiboInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(WeiboInfo record) {
        return this.weiboInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.weiboInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(WeiboInfo record, Criteria example) {
        return this.weiboInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(WeiboInfo record, Criteria example) {
        return this.weiboInfoMapper.updateByExample(record, example);
    }

    public int insert(WeiboInfo record) {
        return this.weiboInfoMapper.insert(record);
    }

    public int insertSelective(WeiboInfo record) {
        return this.weiboInfoMapper.insertSelective(record);
    }
}