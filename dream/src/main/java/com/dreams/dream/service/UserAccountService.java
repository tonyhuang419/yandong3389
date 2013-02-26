package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserAccount;
import java.util.List;

public interface UserAccountService {
    int countByExample(Criteria example);

    UserAccount selectByPrimaryKey(String userAccountId);

    List<UserAccount> selectByExample(Criteria example);

    int deleteByPrimaryKey(String userAccountId);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(UserAccount record, Criteria example);

    int updateByExample(UserAccount record, Criteria example);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);
}