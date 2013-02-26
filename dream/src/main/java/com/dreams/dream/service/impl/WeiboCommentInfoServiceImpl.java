package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.WeiboCommentInfoMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.WeiboCommentInfo;
import com.dreams.dream.service.WeiboCommentInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeiboCommentInfoServiceImpl implements WeiboCommentInfoService {
    @Autowired
    private WeiboCommentInfoMapper weiboCommentInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(WeiboCommentInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.weiboCommentInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public WeiboCommentInfo selectByPrimaryKey(String weiboCommentId) {
        return this.weiboCommentInfoMapper.selectByPrimaryKey(weiboCommentId);
    }

    public List<WeiboCommentInfo> selectByExample(Criteria example) {
        return this.weiboCommentInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String weiboCommentId) {
        return this.weiboCommentInfoMapper.deleteByPrimaryKey(weiboCommentId);
    }

    public int updateByPrimaryKeySelective(WeiboCommentInfo record) {
        return this.weiboCommentInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(WeiboCommentInfo record) {
        return this.weiboCommentInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.weiboCommentInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(WeiboCommentInfo record, Criteria example) {
        return this.weiboCommentInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(WeiboCommentInfo record, Criteria example) {
        return this.weiboCommentInfoMapper.updateByExample(record, example);
    }

    public int insert(WeiboCommentInfo record) {
        return this.weiboCommentInfoMapper.insert(record);
    }

    public int insertSelective(WeiboCommentInfo record) {
        return this.weiboCommentInfoMapper.insertSelective(record);
    }
}