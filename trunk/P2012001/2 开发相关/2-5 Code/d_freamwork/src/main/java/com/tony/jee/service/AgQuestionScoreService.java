package com.tony.jee.service;

import com.tony.jee.pojo.base.AgQuestionScore;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;

public interface AgQuestionScoreService {
    int countByExample(Criteria example);

    AgQuestionScore selectByPrimaryKey(String pkId);

    List<AgQuestionScore> selectByExample(Criteria example);

    int deleteByPrimaryKey(String pkId);

    int updateByPrimaryKeySelective(AgQuestionScore record);

    int updateByPrimaryKey(AgQuestionScore record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(AgQuestionScore record, Criteria example);

    int updateByExample(AgQuestionScore record, Criteria example);

    int insert(AgQuestionScore record);

    int insertSelective(AgQuestionScore record);
}