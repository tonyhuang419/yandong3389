package com.tony.jee.service;

import com.tony.jee.pojo.base.AgQuestionExpert;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;

public interface AgQuestionExpertService {
    int countByExample(Criteria example);

    AgQuestionExpert selectByPrimaryKey(String pkId);

    List<AgQuestionExpert> selectByExample(Criteria example);

    int deleteByPrimaryKey(String pkId);

    int updateByPrimaryKeySelective(AgQuestionExpert record);

    int updateByPrimaryKey(AgQuestionExpert record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(AgQuestionExpert record, Criteria example);

    int updateByExample(AgQuestionExpert record, Criteria example);

    int insert(AgQuestionExpert record);

    int insertSelective(AgQuestionExpert record);
}