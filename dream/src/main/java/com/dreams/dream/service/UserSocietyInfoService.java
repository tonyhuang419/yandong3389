package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserSocietyInfo;
import java.util.List;

public interface UserSocietyInfoService {
    int countByExample(Criteria example);

    UserSocietyInfo selectByPrimaryKey(String userSocietyId);

    List<UserSocietyInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(String userSocietyId);

    int updateByPrimaryKeySelective(UserSocietyInfo record);

    int updateByPrimaryKey(UserSocietyInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(UserSocietyInfo record, Criteria example);

    int updateByExample(UserSocietyInfo record, Criteria example);

    int insert(UserSocietyInfo record);

    int insertSelective(UserSocietyInfo record);
}