package com.tony.jee.service;

import com.tony.jee.common.pager.PagerModel;
import com.tony.jee.pojo.base.AgDomain;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;

public interface AgDomainService {
    
    PagerModel<AgDomain> findPageModel(Criteria example);
    
    int countByExample(Criteria example);

    AgDomain selectByPrimaryKey(String pkId);

    List<AgDomain> selectByExample(Criteria example);

    int deleteByPrimaryKey(String pkId);

    int updateByPrimaryKeySelective(AgDomain record);

    int updateByPrimaryKey(AgDomain record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(AgDomain record, Criteria example);

    int updateByExample(AgDomain record, Criteria example);

    int insert(AgDomain record);

    int insertSelective(AgDomain record);
}