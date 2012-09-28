package com.tony.jee.service;

import com.tony.jee.pojo.base.AgQuestionScoreRule;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;

public interface AgQuestionScoreRuleService {
    int countByExample(Criteria example);

    AgQuestionScoreRule selectByPrimaryKey(String pkId);

    List<AgQuestionScoreRule> selectByExample(Criteria example);

    int deleteByPrimaryKey(String pkId);

    int updateByPrimaryKeySelective(AgQuestionScoreRule record);

    int updateByPrimaryKey(AgQuestionScoreRule record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(AgQuestionScoreRule record, Criteria example);

    int updateByExample(AgQuestionScoreRule record, Criteria example);

    int insert(AgQuestionScoreRule record);

    int insertSelective(AgQuestionScoreRule record);
}