package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.GoldDetailHis;
import java.util.List;

public interface GoldDetailHisService {
    int countByExample(Criteria example);

    GoldDetailHis selectByPrimaryKey(String goldDetailId);

    List<GoldDetailHis> selectByExample(Criteria example);

    int deleteByPrimaryKey(String goldDetailId);

    int updateByPrimaryKeySelective(GoldDetailHis record);

    int updateByPrimaryKey(GoldDetailHis record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(GoldDetailHis record, Criteria example);

    int updateByExample(GoldDetailHis record, Criteria example);

    int insert(GoldDetailHis record);

    int insertSelective(GoldDetailHis record);
}