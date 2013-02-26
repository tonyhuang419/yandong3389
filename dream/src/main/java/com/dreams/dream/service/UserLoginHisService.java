package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserLoginHis;
import java.util.List;

public interface UserLoginHisService {
    int countByExample(Criteria example);

    UserLoginHis selectByPrimaryKey(String loginHisId);

    List<UserLoginHis> selectByExample(Criteria example);

    int deleteByPrimaryKey(String loginHisId);

    int updateByPrimaryKeySelective(UserLoginHis record);

    int updateByPrimaryKey(UserLoginHis record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(UserLoginHis record, Criteria example);

    int updateByExample(UserLoginHis record, Criteria example);

    int insert(UserLoginHis record);

    int insertSelective(UserLoginHis record);
}