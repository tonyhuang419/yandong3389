package com.dreams.dream.service;

import com.dreams.dream.pojo.base.CommentReplyInfo;
import com.dreams.dream.pojo.base.Criteria;
import java.util.List;

public interface CommentReplyInfoService {
    int countByExample(Criteria example);

    CommentReplyInfo selectByPrimaryKey(Integer replyId);

    List<CommentReplyInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer replyId);

    int updateByPrimaryKeySelective(CommentReplyInfo record);

    int updateByPrimaryKey(CommentReplyInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(CommentReplyInfo record, Criteria example);

    int updateByExample(CommentReplyInfo record, Criteria example);

    int insert(CommentReplyInfo record);

    int insertSelective(CommentReplyInfo record);
}