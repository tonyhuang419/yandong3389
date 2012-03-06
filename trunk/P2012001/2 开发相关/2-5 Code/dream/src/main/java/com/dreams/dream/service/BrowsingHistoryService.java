package com.dreams.dream.service;

import com.dreams.dream.pojo.base.BrowsingHistory;
import com.dreams.dream.pojo.base.Criteria;
import java.util.List;

public interface BrowsingHistoryService {
    int countByExample(Criteria example);

    BrowsingHistory selectByPrimaryKey(Integer browsingHistoryId);

    List<BrowsingHistory> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer browsingHistoryId);

    int updateByPrimaryKeySelective(BrowsingHistory record);

    int updateByPrimaryKey(BrowsingHistory record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(BrowsingHistory record, Criteria example);

    int updateByExample(BrowsingHistory record, Criteria example);

    int insert(BrowsingHistory record);

    int insertSelective(BrowsingHistory record);
}