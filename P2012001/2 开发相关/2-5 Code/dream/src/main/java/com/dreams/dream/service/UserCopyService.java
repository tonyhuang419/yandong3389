package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserCopy;
import java.util.List;

public interface UserCopyService {
    int countByExample(Criteria example);

    UserCopy selectByPrimaryKey(Integer id);

    List<UserCopy> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCopy record);

    int updateByPrimaryKey(UserCopy record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(UserCopy record, Criteria example);

    int updateByExample(UserCopy record, Criteria example);

    int insert(UserCopy record);

    int insertSelective(UserCopy record);
}