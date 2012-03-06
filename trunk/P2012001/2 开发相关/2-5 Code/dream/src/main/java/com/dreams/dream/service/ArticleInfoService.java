package com.dreams.dream.service;

import com.dreams.dream.pojo.base.ArticleInfo;
import com.dreams.dream.pojo.base.Criteria;
import java.util.List;

public interface ArticleInfoService {
    int countByExample(Criteria example);

    ArticleInfo selectByPrimaryKey(Integer articleId);

    List<ArticleInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(ArticleInfo record);

    int updateByPrimaryKey(ArticleInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(ArticleInfo record, Criteria example);

    int updateByExample(ArticleInfo record, Criteria example);

    int insert(ArticleInfo record);

    int insertSelective(ArticleInfo record);
}