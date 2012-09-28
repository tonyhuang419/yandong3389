package com.tony.jee.service;

import com.tony.jee.pojo.base.AgConferenceNote;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;

public interface AgConferenceNoteService {
    int countByExample(Criteria example);

    AgConferenceNote selectByPrimaryKey(String pkId);

    List<AgConferenceNote> selectByExample(Criteria example);

    int deleteByPrimaryKey(String pkId);

    int updateByPrimaryKeySelective(AgConferenceNote record);

    int updateByPrimaryKey(AgConferenceNote record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(AgConferenceNote record, Criteria example);

    int updateByExample(AgConferenceNote record, Criteria example);

    int insert(AgConferenceNote record);

    int insertSelective(AgConferenceNote record);
}