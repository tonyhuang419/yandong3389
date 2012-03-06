package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.SupportInfo;
import java.util.List;

public interface SupportInfoService {
    int countByExample(Criteria example);

    SupportInfo selectByPrimaryKey(Integer supportId);

    List<SupportInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer supportId);

    int updateByPrimaryKeySelective(SupportInfo record);

    int updateByPrimaryKey(SupportInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(SupportInfo record, Criteria example);

    int updateByExample(SupportInfo record, Criteria example);

    int insert(SupportInfo record);

    int insertSelective(SupportInfo record);
}