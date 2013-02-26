package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.LevelInfo;
import java.util.List;

public interface LevelInfoService {
    int countByExample(Criteria example);

    LevelInfo selectByPrimaryKey(String levelId);

    List<LevelInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(String levelId);

    int updateByPrimaryKeySelective(LevelInfo record);

    int updateByPrimaryKey(LevelInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(LevelInfo record, Criteria example);

    int updateByExample(LevelInfo record, Criteria example);

    int insert(LevelInfo record);

    int insertSelective(LevelInfo record);
}