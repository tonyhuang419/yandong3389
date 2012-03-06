package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.SubscribeInfo;
import java.util.List;

public interface SubscribeInfoService {
    int countByExample(Criteria example);

    SubscribeInfo selectByPrimaryKey(Integer subscribeId);

    List<SubscribeInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer subscribeId);

    int updateByPrimaryKeySelective(SubscribeInfo record);

    int updateByPrimaryKey(SubscribeInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(SubscribeInfo record, Criteria example);

    int updateByExample(SubscribeInfo record, Criteria example);

    int insert(SubscribeInfo record);

    int insertSelective(SubscribeInfo record);
}