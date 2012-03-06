package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.BrowsingHistoryMapper;
import com.dreams.dream.pojo.base.BrowsingHistory;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.service.BrowsingHistoryService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrowsingHistoryServiceImpl implements BrowsingHistoryService {
    @Autowired
    private BrowsingHistoryMapper browsingHistoryMapper;

    private static final Logger logger = LoggerFactory.getLogger(BrowsingHistoryServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.browsingHistoryMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public BrowsingHistory selectByPrimaryKey(Integer browsingHistoryId) {
        return this.browsingHistoryMapper.selectByPrimaryKey(browsingHistoryId);
    }

    public List<BrowsingHistory> selectByExample(Criteria example) {
        return this.browsingHistoryMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer browsingHistoryId) {
        return this.browsingHistoryMapper.deleteByPrimaryKey(browsingHistoryId);
    }

    public int updateByPrimaryKeySelective(BrowsingHistory record) {
        return this.browsingHistoryMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(BrowsingHistory record) {
        return this.browsingHistoryMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.browsingHistoryMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(BrowsingHistory record, Criteria example) {
        return this.browsingHistoryMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(BrowsingHistory record, Criteria example) {
        return this.browsingHistoryMapper.updateByExample(record, example);
    }

    public int insert(BrowsingHistory record) {
        return this.browsingHistoryMapper.insert(record);
    }

    public int insertSelective(BrowsingHistory record) {
        return this.browsingHistoryMapper.insertSelective(record);
    }
}