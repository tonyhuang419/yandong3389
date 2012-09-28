package com.tony.jee.service;

import com.tony.jee.pojo.base.AgAuditPerson;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;

public interface AgAuditPersonService {
    int countByExample(Criteria example);

    AgAuditPerson selectByPrimaryKey(String pkId);

    List<AgAuditPerson> selectByExample(Criteria example);

    int deleteByPrimaryKey(String pkId);

    int updateByPrimaryKeySelective(AgAuditPerson record);

    int updateByPrimaryKey(AgAuditPerson record);

    int deleteByExample(Criteria example);

    int updateByExampleSelective(AgAuditPerson record, Criteria example);

    int updateByExample(AgAuditPerson record, Criteria example);

    int insert(AgAuditPerson record);

    int insertSelective(AgAuditPerson record);
}