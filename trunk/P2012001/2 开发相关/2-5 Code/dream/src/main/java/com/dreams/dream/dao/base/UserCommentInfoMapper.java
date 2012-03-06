package com.dreams.dream.dao.base;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.UserCommentInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCommentInfoMapper {
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
    int deleteByPrimaryKey(Integer userCommentId);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(UserCommentInfo record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(UserCommentInfo record);

    /**
     * 根据条件查询记录集
     */
    List<UserCommentInfo> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    UserCommentInfo selectByPrimaryKey(Integer userCommentId);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") UserCommentInfo record, @Param("example") Criteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") UserCommentInfo record, @Param("example") Criteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(UserCommentInfo record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(UserCommentInfo record);
}