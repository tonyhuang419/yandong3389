package com.dreams.dream.dao.base;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.SystemConfigInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemConfigInfoMapper {
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
    int deleteByPrimaryKey(Integer systemConfigId);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(SystemConfigInfo record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(SystemConfigInfo record);

    /**
     * 根据条件查询记录集
     */
    List<SystemConfigInfo> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    SystemConfigInfo selectByPrimaryKey(Integer systemConfigId);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") SystemConfigInfo record, @Param("example") Criteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") SystemConfigInfo record, @Param("example") Criteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SystemConfigInfo record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SystemConfigInfo record);
}