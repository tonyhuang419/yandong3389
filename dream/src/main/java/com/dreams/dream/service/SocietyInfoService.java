package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.SocietyInfo;
import java.util.List;

public interface SocietyInfoService {
    int countByExample(Criteria example);

    SocietyInfo selectByPrimaryKey(String societyId);

    List<SocietyInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(String societyId);

    int updateByPrimaryKeySelective(SocietyInfo record);

    int updateByPrimaryKey(SocietyInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(SocietyInfo record, Criteria example);

    int updateByExample(SocietyInfo record, Criteria example);

    int insert(SocietyInfo record);

    int insertSelective(SocietyInfo record);
}