package com.dreams.dream.service;

import com.dreams.dream.pojo.base.ArticleCommentInfo;
import com.dreams.dream.pojo.base.Criteria;
import java.util.List;

public interface ArticleCommentInfoService {
    int countByExample(Criteria example);

    ArticleCommentInfo selectByPrimaryKey(Integer articleCommentId);

    List<ArticleCommentInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer articleCommentId);

    int updateByPrimaryKeySelective(ArticleCommentInfo record);

    int updateByPrimaryKey(ArticleCommentInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(ArticleCommentInfo record, Criteria example);

    int updateByExample(ArticleCommentInfo record, Criteria example);

    int insert(ArticleCommentInfo record);

    int insertSelective(ArticleCommentInfo record);
}