package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.GameInfo;
import java.util.List;

public interface GameInfoService {
    int countByExample(Criteria example);

    GameInfo selectByPrimaryKey(String gameId);

    List<GameInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(String gameId);

    int updateByPrimaryKeySelective(GameInfo record);

    int updateByPrimaryKey(GameInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(GameInfo record, Criteria example);

    int updateByExample(GameInfo record, Criteria example);

    int insert(GameInfo record);

    int insertSelective(GameInfo record);
}