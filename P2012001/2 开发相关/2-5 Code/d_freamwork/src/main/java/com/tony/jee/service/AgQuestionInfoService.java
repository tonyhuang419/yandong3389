package com.tony.jee.service;

import com.tony.jee.pojo.base.AgQuestionInfo;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;

public interface AgQuestionInfoService {
    int countByExample(Criteria example);

    AgQuestionInfo selectByPrimaryKey(String pkId);

    List<AgQuestionInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(String pkId);

    int updateByPrimaryKeySelective(AgQuestionInfo record);

    int updateByPrimaryKey(AgQuestionInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(AgQuestionInfo record, Criteria example);

    int updateByExample(AgQuestionInfo record, Criteria example);

    int insert(AgQuestionInfo record);

    int insertSelective(AgQuestionInfo record);
}