package com.dreams.dream.dao.base;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserCopy;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCopyMapper {
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
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(UserCopy record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(UserCopy record);

    /**
     * 根据条件查询记录集
     */
    List<UserCopy> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    UserCopy selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") UserCopy record, @Param("example") Criteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") UserCopy record, @Param("example") Criteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(UserCopy record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(UserCopy record);
}