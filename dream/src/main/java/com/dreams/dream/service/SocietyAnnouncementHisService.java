package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.SocietyAnnouncementHis;
import java.util.List;

public interface SocietyAnnouncementHisService {
    int countByExample(Criteria example);

    SocietyAnnouncementHis selectByPrimaryKey(String announcementId);

    List<SocietyAnnouncementHis> selectByExample(Criteria example);

    int deleteByPrimaryKey(String announcementId);

    int updateByPrimaryKeySelective(SocietyAnnouncementHis record);

    int updateByPrimaryKey(SocietyAnnouncementHis record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(SocietyAnnouncementHis record, Criteria example);

    int updateByExample(SocietyAnnouncementHis record, Criteria example);

    int insert(SocietyAnnouncementHis record);

    int insertSelective(SocietyAnnouncementHis record);
}