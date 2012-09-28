package com.tony.jee.dao.base;

import com.tony.jee.pojo.base.AgConferenceNote;
import com.tony.jee.pojo.base.Criteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgConferenceNoteMapper {
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
    int insert(AgConferenceNote record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(AgConferenceNote record);

    /**
     * 根据条件查询记录集
     */
    List<AgConferenceNote> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    AgConferenceNote selectByPrimaryKey(String pkId);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") AgConferenceNote record, @Param("example") Criteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") AgConferenceNote record, @Param("example") Criteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(AgConferenceNote record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(AgConferenceNote record);
}