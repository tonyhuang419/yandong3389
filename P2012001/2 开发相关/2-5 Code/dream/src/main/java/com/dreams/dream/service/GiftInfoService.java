package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.GiftInfo;
import java.util.List;

public interface GiftInfoService {
    int countByExample(Criteria example);

    GiftInfo selectByPrimaryKey(Integer giftId);

    List<GiftInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer giftId);

    int updateByPrimaryKeySelective(GiftInfo record);

    int updateByPrimaryKey(GiftInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(GiftInfo record, Criteria example);

    int updateByExample(GiftInfo record, Criteria example);

    int insert(GiftInfo record);

    int insertSelective(GiftInfo record);
}