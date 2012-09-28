package com.tony.jee.service;

import com.tony.jee.pojo.base.AgQuestionPersonRel;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;

public interface AgQuestionPersonRelService {
    int countByExample(Criteria example);

    AgQuestionPersonRel selectByPrimaryKey(String pkId);

    List<AgQuestionPersonRel> selectByExample(Criteria example);

    int deleteByPrimaryKey(String pkId);

    int updateByPrimaryKeySelective(AgQuestionPersonRel record);

    int updateByPrimaryKey(AgQuestionPersonRel record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(AgQuestionPersonRel record, Criteria example);

    int updateByExample(AgQuestionPersonRel record, Criteria example);

    int insert(AgQuestionPersonRel record);

    int insertSelective(AgQuestionPersonRel record);
}