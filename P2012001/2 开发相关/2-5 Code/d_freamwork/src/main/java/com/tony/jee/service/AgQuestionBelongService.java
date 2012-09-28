package com.tony.jee.service;

import com.tony.jee.pojo.base.AgQuestionBelong;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;

public interface AgQuestionBelongService {
    int countByExample(Criteria example);

    AgQuestionBelong selectByPrimaryKey(String pkId);

    List<AgQuestionBelong> selectByExample(Criteria example);

    int deleteByPrimaryKey(String pkId);

    int updateByPrimaryKeySelective(AgQuestionBelong record);

    int updateByPrimaryKey(AgQuestionBelong record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(AgQuestionBelong record, Criteria example);

    int updateByExample(AgQuestionBelong record, Criteria example);

    int insert(AgQuestionBelong record);

    int insertSelective(AgQuestionBelong record);
}