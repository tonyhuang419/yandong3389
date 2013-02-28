package com.dreams.dream.service;

import com.dreams.dream.pojo.base.AdminInfo;
import com.dreams.dream.pojo.base.Criteria;
import java.util.List;

public interface AdminInfoService {
    int countByExample(Criteria example);

    AdminInfo selectByPrimaryKey(byte[] adminId);

    List<AdminInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(byte[] adminId);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(AdminInfo record, Criteria example);

    int updateByExample(AdminInfo record, Criteria example);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);
}