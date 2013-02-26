package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserLevelDetailHis;
import java.util.List;

public interface UserLevelDetailHisService {
    int countByExample(Criteria example);

    UserLevelDetailHis selectByPrimaryKey(String levelDetailId);

    List<UserLevelDetailHis> selectByExample(Criteria example);

    int deleteByPrimaryKey(String levelDetailId);

    int updateByPrimaryKeySelective(UserLevelDetailHis record);

    int updateByPrimaryKey(UserLevelDetailHis record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(UserLevelDetailHis record, Criteria example);

    int updateByExample(UserLevelDetailHis record, Criteria example);

    int insert(UserLevelDetailHis record);

    int insertSelective(UserLevelDetailHis record);
}