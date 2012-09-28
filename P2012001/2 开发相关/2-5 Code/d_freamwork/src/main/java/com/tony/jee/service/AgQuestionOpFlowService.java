package com.tony.jee.service;

import com.tony.jee.pojo.base.AgQuestionOpFlow;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;

public interface AgQuestionOpFlowService {
    int countByExample(Criteria example);

    AgQuestionOpFlow selectByPrimaryKey(String pkId);

    List<AgQuestionOpFlow> selectByExample(Criteria example);

    int deleteByPrimaryKey(String pkId);

    int updateByPrimaryKeySelective(AgQuestionOpFlow record);

    int updateByPrimaryKey(AgQuestionOpFlow record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(AgQuestionOpFlow record, Criteria example);

    int updateByExample(AgQuestionOpFlow record, Criteria example);

    int insert(AgQuestionOpFlow record);

    int insertSelective(AgQuestionOpFlow record);
}