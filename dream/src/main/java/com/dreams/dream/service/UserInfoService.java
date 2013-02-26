package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserInfo;
import java.util.List;

public interface UserInfoService {
    int countByExample(Criteria example);

    UserInfo selectByPrimaryKey(String userId);

    List<UserInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(UserInfo record, Criteria example);

    int updateByExample(UserInfo record, Criteria example);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);
}