package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.WeiboInfo;
import java.util.List;

public interface WeiboInfoService {
    int countByExample(Criteria example);

    WeiboInfo selectByPrimaryKey(String weiboId);

    List<WeiboInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(String weiboId);

    int updateByPrimaryKeySelective(WeiboInfo record);

    int updateByPrimaryKey(WeiboInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(WeiboInfo record, Criteria example);

    int updateByExample(WeiboInfo record, Criteria example);

    int insert(WeiboInfo record);

    int insertSelective(WeiboInfo record);
}