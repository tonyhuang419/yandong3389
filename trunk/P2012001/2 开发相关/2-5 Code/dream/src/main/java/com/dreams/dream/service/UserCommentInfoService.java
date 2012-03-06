package com.dreams.dream.service;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserCommentInfo;
import java.util.List;

public interface UserCommentInfoService {
    int countByExample(Criteria example);

    UserCommentInfo selectByPrimaryKey(Integer userCommentId);

    List<UserCommentInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer userCommentId);

    int updateByPrimaryKeySelective(UserCommentInfo record);

    int updateByPrimaryKey(UserCommentInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(UserCommentInfo record, Criteria example);

    int updateByExample(UserCommentInfo record, Criteria example);

    int insert(UserCommentInfo record);

    int insertSelective(UserCommentInfo record);
}