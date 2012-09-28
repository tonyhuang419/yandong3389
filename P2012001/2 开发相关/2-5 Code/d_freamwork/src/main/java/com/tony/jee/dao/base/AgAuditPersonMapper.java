package com.tony.jee.dao.base;

import com.tony.jee.pojo.base.AgAuditPerson;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgAuditPersonMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(Criteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(Criteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(String pkId);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(AgAuditPerson record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(AgAuditPerson record);

    /**
     * 根据条件查询记录集
     */
    List<AgAuditPerson> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    AgAuditPerson selectByPrimaryKey(String pkId);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") AgAuditPerson record, @Param("example") Criteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") AgAuditPerson record, @Param("example") Criteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(AgAuditPerson record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(AgAuditPerson record);
}