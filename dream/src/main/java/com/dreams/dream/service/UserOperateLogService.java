package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserOperateLog;
import java.util.List;

public interface UserOperateLogService {
    int countByExample(Criteria example);

    UserOperateLog selectByPrimaryKey(String userOperateId);

    List<UserOperateLog> selectByExample(Criteria example);

    int deleteByPrimaryKey(String userOperateId);

    int updateByPrimaryKeySelective(UserOperateLog record);

    int updateByPrimaryKey(UserOperateLog record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(UserOperateLog record, Criteria example);

    int updateByExample(UserOperateLog record, Criteria example);

    int insert(UserOperateLog record);

    int insertSelective(UserOperateLog record);
}