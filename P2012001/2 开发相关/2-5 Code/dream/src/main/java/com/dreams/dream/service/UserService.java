package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.User;
import java.util.List;

public interface UserService {
    int countByExample(Criteria example);

    User selectByPrimaryKey(Integer id);

    List<User> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(User record, Criteria example);

    int updateByExample(User record, Criteria example);

    int insert(User record);

    int insertSelective(User record);
}