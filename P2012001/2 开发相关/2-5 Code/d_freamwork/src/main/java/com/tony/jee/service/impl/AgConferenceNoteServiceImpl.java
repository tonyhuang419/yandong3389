package com.tony.jee.service.impl;

import com.tony.jee.dao.base.AgConferenceNoteMapper;
import com.tony.jee.pojo.base.AgConferenceNote;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.AgConferenceNoteService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgConferenceNoteServiceImpl implements AgConferenceNoteService {
    @Autowired
    private AgConferenceNoteMapper agConferenceNoteMapper;

    private static final Logger logger = LoggerFactory.getLogger(AgConferenceNoteServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.agConferenceNoteMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AgConferenceNote selectByPrimaryKey(String pkId) {
        return this.agConferenceNoteMapper.selectByPrimaryKey(pkId);
    }

    public List<AgConferenceNote> selectByExample(Criteria example) {
        return this.agConferenceNoteMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String pkId) {
        return this.agConferenceNoteMapper.deleteByPrimaryKey(pkId);
    }

    public int updateByPrimaryKeySelective(AgConferenceNote record) {
        return this.agConferenceNoteMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AgConferenceNote record) {
        return this.agConferenceNoteMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.agConferenceNoteMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(AgConferenceNote record, Criteria example) {
        return this.agConferenceNoteMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(AgConferenceNote record, Criteria example) {
        return this.agConferenceNoteMapper.updateByExample(record, example);
    }

    public int insert(AgConferenceNote record) {
        return this.agConferenceNoteMapper.insert(record);
    }

    public int insertSelective(AgConferenceNote record) {
        return this.agConferenceNoteMapper.insertSelective(record);
    }
}