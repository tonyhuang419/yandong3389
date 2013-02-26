package com.dreams.dream.dao.base;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserAccount;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountMapper {
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
    int deleteByPrimaryKey(String userAccountId);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(UserAccount record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(UserAccount record);

    /**
     * 根据条件查询记录集
     */
    List<UserAccount> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    UserAccount selectByPrimaryKey(String userAccountId);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") UserAccount record, @Param("example") Criteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") UserAccount record, @Param("example") Criteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(UserAccount record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(UserAccount record);
}