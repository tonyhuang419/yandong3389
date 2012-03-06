package com.dreams.dream.service;

import com.dreams.dream.pojo.base.ArticleTypeInfo;
import com.dreams.dream.pojo.base.Criteria;
import java.util.List;

public interface ArticleTypeInfoService {
    int countByExample(Criteria example);

    ArticleTypeInfo selectByPrimaryKey(Integer articleTypeId);

    List<ArticleTypeInfo> selectByExample(Criteria example);

    int deleteByPrimaryKey(Integer articleTypeId);

    int updateByPrimaryKeySelective(ArticleTypeInfo record);

    int updateByPrimaryKey(ArticleTypeInfo record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(ArticleTypeInfo record, Criteria example);

    int updateByExample(ArticleTypeInfo record, Criteria example);

    int insert(ArticleTypeInfo record);

    int insertSelective(ArticleTypeInfo record);
}