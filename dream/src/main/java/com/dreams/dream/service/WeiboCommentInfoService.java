package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.WeiboCommentInfo;
import java.util.List;

public interface WeiboCommentInfoService {
    int countByExample(Criteria example);

    WeiboCommentInfo selectByPrimaryKey(String weiboCommentId);

    List<WeiboCommentInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(String weiboCommentId);

    int updateByPrimaryKeySelective(WeiboCommentInfo record);

    int updateByPrimaryKey(WeiboCommentInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(WeiboCommentInfo record, Criteria example);

    int updateByExample(WeiboCommentInfo record, Criteria example);

    int insert(WeiboCommentInfo record);

    int insertSelective(WeiboCommentInfo record);
}