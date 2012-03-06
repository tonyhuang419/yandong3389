package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.ArticleTypeInfoMapper;
import com.dreams.dream.pojo.base.ArticleTypeInfo;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.service.ArticleTypeInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleTypeInfoServiceImpl implements ArticleTypeInfoService {
    @Autowired
    private ArticleTypeInfoMapper articleTypeInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(ArticleTypeInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.articleTypeInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ArticleTypeInfo selectByPrimaryKey(Integer articleTypeId) {
        return this.articleTypeInfoMapper.selectByPrimaryKey(articleTypeId);
    }

    public List<ArticleTypeInfo> selectByExample(Criteria example) {
        return this.articleTypeInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer articleTypeId) {
        return this.articleTypeInfoMapper.deleteByPrimaryKey(articleTypeId);
    }

    public int updateByPrimaryKeySelective(ArticleTypeInfo record) {
        return this.articleTypeInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ArticleTypeInfo record) {
        return this.articleTypeInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.articleTypeInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(ArticleTypeInfo record, Criteria example) {
        return this.articleTypeInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(ArticleTypeInfo record, Criteria example) {
        return this.articleTypeInfoMapper.updateByExample(record, example);
    }

    public int insert(ArticleTypeInfo record) {
        return this.articleTypeInfoMapper.insert(record);
    }

    public int insertSelective(ArticleTypeInfo record) {
        return this.articleTypeInfoMapper.insertSelective(record);
    }
}