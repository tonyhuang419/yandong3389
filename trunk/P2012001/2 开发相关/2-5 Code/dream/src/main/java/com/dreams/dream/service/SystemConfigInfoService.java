package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.SystemConfigInfo;
import java.util.List;

public interface SystemConfigInfoService {
    int countByExample(Criteria example);

    SystemConfigInfo selectByPrimaryKey(Integer systemConfigId);

    List<SystemConfigInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer systemConfigId);

    int updateByPrimaryKeySelective(SystemConfigInfo record);

    int updateByPrimaryKey(SystemConfigInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(SystemConfigInfo record, Criteria example);

    int updateByExample(SystemConfigInfo record, Criteria example);

    int insert(SystemConfigInfo record);

    int insertSelective(SystemConfigInfo record);
}