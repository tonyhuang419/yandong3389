package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.ArticleCommentInfoMapper;
import com.dreams.dream.pojo.base.ArticleCommentInfo;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.service.ArticleCommentInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleCommentInfoServiceImpl implements ArticleCommentInfoService {
    @Autowired
    private ArticleCommentInfoMapper articleCommentInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(ArticleCommentInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.articleCommentInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ArticleCommentInfo selectByPrimaryKey(Integer articleCommentId) {
        return this.articleCommentInfoMapper.selectByPrimaryKey(articleCommentId);
    }

    public List<ArticleCommentInfo> selectByExample(Criteria example) {
        return this.articleCommentInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer articleCommentId) {
        return this.articleCommentInfoMapper.deleteByPrimaryKey(articleCommentId);
    }

    public int updateByPrimaryKeySelective(ArticleCommentInfo record) {
        return this.articleCommentInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ArticleCommentInfo record) {
        return this.articleCommentInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.articleCommentInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(ArticleCommentInfo record, Criteria example) {
        return this.articleCommentInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(ArticleCommentInfo record, Criteria example) {
        return this.articleCommentInfoMapper.updateByExample(record, example);
    }

    public int insert(ArticleCommentInfo record) {
        return this.articleCommentInfoMapper.insert(record);
    }

    public int insertSelective(ArticleCommentInfo record) {
        return this.articleCommentInfoMapper.insertSelective(record);
    }
}