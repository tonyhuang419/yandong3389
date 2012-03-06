package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.CommentReplyInfoMapper;
import com.dreams.dream.pojo.base.CommentReplyInfo;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.service.CommentReplyInfoService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentReplyInfoServiceImpl implements CommentReplyInfoService {
    @Autowired
    private CommentReplyInfoMapper commentReplyInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(CommentReplyInfoServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.commentReplyInfoMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public CommentReplyInfo selectByPrimaryKey(Integer replyId) {
        return this.commentReplyInfoMapper.selectByPrimaryKey(replyId);
    }

    public List<CommentReplyInfo> selectByExample(Criteria example) {
        return this.commentReplyInfoMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer replyId) {
        return this.commentReplyInfoMapper.deleteByPrimaryKey(replyId);
    }

    public int updateByPrimaryKeySelective(CommentReplyInfo record) {
        return this.commentReplyInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(CommentReplyInfo record) {
        return this.commentReplyInfoMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.commentReplyInfoMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(CommentReplyInfo record, Criteria example) {
        return this.commentReplyInfoMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(CommentReplyInfo record, Criteria example) {
        return this.commentReplyInfoMapper.updateByExample(record, example);
    }

    public int insert(CommentReplyInfo record) {
        return this.commentReplyInfoMapper.insert(record);
    }

    public int insertSelective(CommentReplyInfo record) {
        return this.commentReplyInfoMapper.insertSelective(record);
    }
}