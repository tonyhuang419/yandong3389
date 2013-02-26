package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.PowerInfo;
import java.util.List;

public interface PowerInfoService {
    int countByExample(Criteria example);

    PowerInfo selectByPrimaryKey(String powerId);

    List<PowerInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(String powerId);

    int updateByPrimaryKeySelective(PowerInfo record);

    int updateByPrimaryKey(PowerInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(PowerInfo record, Criteria example);

    int updateByExample(PowerInfo record, Criteria example);

    int insert(PowerInfo record);

    int insertSelective(PowerInfo record);
}