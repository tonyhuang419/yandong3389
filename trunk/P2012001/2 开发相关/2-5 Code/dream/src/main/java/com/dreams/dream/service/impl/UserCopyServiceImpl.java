package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.UserCopyMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserCopy;
import com.dreams.dream.service.UserCopyService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
// @Transactional(propagation=Propagation.REQUIRED,readOnly=false)
//设置默认的事务管理策略，即没有标注@Transactional的方法的事务处理方式，意思为不要求方法必须在一个事务中运行
public class UserCopyServiceImpl implements UserCopyService {
    @Autowired
    private UserCopyMapper userCopyMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserCopyServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.userCopyMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public UserCopy selectByPrimaryKey(Integer id) {
        return this.userCopyMapper.selectByPrimaryKey(id);
    }

    public List<UserCopy> selectByExample(Criteria example) {
        return this.userCopyMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.userCopyMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(UserCopy record) {
        return this.userCopyMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserCopy record) {
        return this.userCopyMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.userCopyMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(UserCopy record, Criteria example) {
        return this.userCopyMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(UserCopy record, Criteria example) {
        return this.userCopyMapper.updateByExample(record, example);
    }

    public int insert(UserCopy record) {
        return this.userCopyMapper.insert(record);
    }

    public int insertSelective(UserCopy record) {
        return this.userCopyMapper.insertSelective(record);
    }
}