package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.SocietyAnnouncementHisMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.SocietyAnnouncementHis;
import com.dreams.dream.service.SocietyAnnouncementHisService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocietyAnnouncementHisServiceImpl implements SocietyAnnouncementHisService {
    @Autowired
    private SocietyAnnouncementHisMapper societyAnnouncementHisMapper;

    private static final Logger logger = LoggerFactory.getLogger(SocietyAnnouncementHisServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.societyAnnouncementHisMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public SocietyAnnouncementHis selectByPrimaryKey(String announcementId) {
        return this.societyAnnouncementHisMapper.selectByPrimaryKey(announcementId);
    }

    public List<SocietyAnnouncementHis> selectByExample(Criteria example) {
        return this.societyAnnouncementHisMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String announcementId) {
        return this.societyAnnouncementHisMapper.deleteByPrimaryKey(announcementId);
    }

    public int updateByPrimaryKeySelective(SocietyAnnouncementHis record) {
        return this.societyAnnouncementHisMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SocietyAnnouncementHis record) {
        return this.societyAnnouncementHisMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.societyAnnouncementHisMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(SocietyAnnouncementHis record, Criteria example) {
        return this.societyAnnouncementHisMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(SocietyAnnouncementHis record, Criteria example) {
        return this.societyAnnouncementHisMapper.updateByExample(record, example);
    }

    public int insert(SocietyAnnouncementHis record) {
        return this.societyAnnouncementHisMapper.insert(record);
    }

    public int insertSelective(SocietyAnnouncementHis record) {
        return this.societyAnnouncementHisMapper.insertSelective(record);
    }
}