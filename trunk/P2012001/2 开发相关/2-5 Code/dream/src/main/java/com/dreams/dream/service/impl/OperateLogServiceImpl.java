package com.dreams.dream.service.impl;

import com.dreams.dream.dao.base.OperateLogMapper;
import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.OperateLog;
import com.dreams.dream.service.OperateLogService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperateLogServiceImpl implements OperateLogService {
    @Autowired
    private OperateLogMapper operateLogMapper;

    private static final Logger logger = LoggerFactory.getLogger(OperateLogServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.operateLogMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public OperateLog selectByPrimaryKey(Integer operateLogId) {
        return this.operateLogMapper.selectByPrimaryKey(operateLogId);
    }

    public List<OperateLog> selectByExample(Criteria example) {
        return this.operateLogMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer operateLogId) {
        return this.operateLogMapper.deleteByPrimaryKey(operateLogId);
    }

    public int updateByPrimaryKeySelective(OperateLog record) {
        return this.operateLogMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(OperateLog record) {
        return this.operateLogMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.operateLogMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(OperateLog record, Criteria example) {
        return this.operateLogMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(OperateLog record, Criteria example) {
        return this.operateLogMapper.updateByExample(record, example);
    }

    public int insert(OperateLog record) {
        return this.operateLogMapper.insert(record);
    }

    public int insertSelective(OperateLog record) {
        return this.operateLogMapper.insertSelective(record);
    }
}