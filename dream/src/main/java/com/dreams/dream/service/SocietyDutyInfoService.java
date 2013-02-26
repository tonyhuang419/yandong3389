package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.SocietyDutyInfo;
import java.util.List;

public interface SocietyDutyInfoService {
    int countByExample(Criteria example);

    SocietyDutyInfo selectByPrimaryKey(String societyDutyId);

    List<SocietyDutyInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(String societyDutyId);

    int updateByPrimaryKeySelective(SocietyDutyInfo record);

    int updateByPrimaryKey(SocietyDutyInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(SocietyDutyInfo record, Criteria example);

    int updateByExample(SocietyDutyInfo record, Criteria example);

    int insert(SocietyDutyInfo record);

    int insertSelective(SocietyDutyInfo record);
}