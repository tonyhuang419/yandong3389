package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserGameInfo;
import java.util.List;

public interface UserGameInfoService {
    int countByExample(Criteria example);

    UserGameInfo selectByPrimaryKey(String userGameId);

    List<UserGameInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(String userGameId);

    int updateByPrimaryKeySelective(UserGameInfo record);

    int updateByPrimaryKey(UserGameInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(UserGameInfo record, Criteria example);

    int updateByExample(UserGameInfo record, Criteria example);

    int insert(UserGameInfo record);

    int insertSelective(UserGameInfo record);
}