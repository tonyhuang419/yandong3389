package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.ArticleInfoMapper;
import com.dreams.dream.pojo.base.ArticleInfo;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.service.ArticleInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleInfoServiceImpl implements ArticleInfoService {
    @Autowired
    private ArticleInfoMapper articleInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(ArticleInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.articleInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ArticleInfo selectByPrimaryKey(Integer articleId) {
        return this.articleInfoMapper.selectByPrimaryKey(articleId);
    }

    public List<ArticleInfo> selectByExample(Criteria example) {
        return this.articleInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer articleId) {
        return this.articleInfoMapper.deleteByPrimaryKey(articleId);
    }

    public int updateByPrimaryKeySelective(ArticleInfo record) {
        return this.articleInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ArticleInfo record) {
        return this.articleInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.articleInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(ArticleInfo record, Criteria example) {
        return this.articleInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(ArticleInfo record, Criteria example) {
        return this.articleInfoMapper.updateByExample(record, example);
    }

    public int insert(ArticleInfo record) {
        return this.articleInfoMapper.insert(record);
    }

    public int insertSelective(ArticleInfo record) {
        return this.articleInfoMapper.insertSelective(record);
    }
}