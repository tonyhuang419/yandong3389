package com.tony.jee.service;

import com.tony.jee.pojo.base.BaseFields;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;

public interface BaseFieldsService {
    int countByExample(Criteria example);

    BaseFields selectByPrimaryKey(String fieldId);

    List<BaseFields> selectByExample(Criteria example);

    int deleteByPrimaryKey(String fieldId);

    int updateByPrimaryKeySelective(BaseFields record);

    int updateByPrimaryKey(BaseFields record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(BaseFields record, Criteria example);

    int updateByExample(BaseFields record, Criteria example);

    int insert(BaseFields record) ;

    int insertSelective(BaseFields record);
}