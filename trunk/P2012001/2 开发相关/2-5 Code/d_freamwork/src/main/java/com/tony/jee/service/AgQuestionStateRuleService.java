package com.tony.jee.service;

import com.tony.jee.pojo.base.AgQuestionStateRule;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;

public interface AgQuestionStateRuleService {
    int countByExample(Criteria example);

    AgQuestionStateRule selectByPrimaryKey(String pkId);

    List<AgQuestionStateRule> selectByExample(Criteria example);

    int deleteByPrimaryKey(String pkId);

    int updateByPrimaryKeySelective(AgQuestionStateRule record);

    int updateByPrimaryKey(AgQuestionStateRule record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(AgQuestionStateRule record, Criteria example);

    int updateByExample(AgQuestionStateRule record, Criteria example);

    int insert(AgQuestionStateRule record);

    int insertSelective(AgQuestionStateRule record);
}