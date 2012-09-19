package com.tony.jee.service.impl;

import com.tony.jee.dao.base.BaseFieldsMapper;
import com.tony.jee.pojo.base.BaseFields;
import com.tony.jee.pojo.base.Criteria;
import com.tony.jee.service.BaseFieldsService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseFieldsServiceImpl implements BaseFieldsService {
    @Autowired
    private BaseFieldsMapper baseFieldsMapper;

    private static final Logger logger = LoggerFactory.getLogger(BaseFieldsServiceImpl.class);

    public int countByExample(Criteria example) {
        int count = this.baseFieldsMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public BaseFields selectByPrimaryKey(String fieldId) {
        return this.baseFieldsMapper.selectByPrimaryKey(fieldId);
    }

    public List<BaseFields> selectByExample(Criteria example) {
        return this.baseFieldsMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(String fieldId) {
        return this.baseFieldsMapper.deleteByPrimaryKey(fieldId);
    }

    public int updateByPrimaryKeySelective(BaseFields record) {
        return this.baseFieldsMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(BaseFields record) {
        return this.baseFieldsMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.baseFieldsMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(BaseFields record, Criteria example) {
        return this.baseFieldsMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(BaseFields record, Criteria example) {
        return this.baseFieldsMapper.updateByExample(record, example);
    }

    public int insert(BaseFields record) {
        return this.baseFieldsMapper.insert(record);
    }

    public int insertSelective(BaseFields record) {
        return this.baseFieldsMapper.insertSelective(record);
    }
}