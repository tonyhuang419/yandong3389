package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserInfo;
import java.util.List;

public interface UserInfoService {
    int countByExample(Criteria example);

    UserInfo selectByPrimaryKey(Integer userId);

    List<UserInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(UserInfo record, Criteria example);

    int updateByExample(UserInfo record, Criteria example);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);
}