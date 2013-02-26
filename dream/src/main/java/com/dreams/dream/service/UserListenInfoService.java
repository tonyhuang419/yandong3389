package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserListenInfo;
import java.util.List;

public interface UserListenInfoService {
    int countByExample(Criteria example);

    UserListenInfo selectByPrimaryKey(String userListenId);

    List<UserListenInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(String userListenId);

    int updateByPrimaryKeySelective(UserListenInfo record);

    int updateByPrimaryKey(UserListenInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(UserListenInfo record, Criteria example);

    int updateByExample(UserListenInfo record, Criteria example);

    int insert(UserListenInfo record);

    int insertSelective(UserListenInfo record);
}