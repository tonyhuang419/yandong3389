package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.OperateLog;
import java.util.List;

public interface OperateLogService {
    int countByExample(Criteria example);

    OperateLog selectByPrimaryKey(Integer operateLogId);

    List<OperateLog> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer operateLogId);

    int updateByPrimaryKeySelective(OperateLog record);

    int updateByPrimaryKey(OperateLog record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(OperateLog record, Criteria example);

    int updateByExample(OperateLog record, Criteria example);

    int insert(OperateLog record);

    int insertSelective(OperateLog record);
}