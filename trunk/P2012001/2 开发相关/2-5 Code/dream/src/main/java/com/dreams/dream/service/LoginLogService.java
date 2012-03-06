package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.LoginLog;
import java.util.List;

public interface LoginLogService {
    int countByExample(Criteria example);

    LoginLog selectByPrimaryKey(Integer loginLogId);

    List<LoginLog> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer loginLogId);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(LoginLog record, Criteria example);

    int updateByExample(LoginLog record, Criteria example);

    int insert(LoginLog record);

    int insertSelective(LoginLog record);
}