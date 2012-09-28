package com.tony.jee.service;

import com.tony.jee.pojo.base.AgOrgDomainRel;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;

public interface AgOrgDomainRelService {
    int countByExample(Criteria example);

    AgOrgDomainRel selectByPrimaryKey(String pkId);

    List<AgOrgDomainRel> selectByExample(Criteria example);

    int deleteByPrimaryKey(String pkId);

    int updateByPrimaryKeySelective(AgOrgDomainRel record);

    int updateByPrimaryKey(AgOrgDomainRel record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(AgOrgDomainRel record, Criteria example);

    int updateByExample(AgOrgDomainRel record, Criteria example);

    int insert(AgOrgDomainRel record);

    int insertSelective(AgOrgDomainRel record);
}