package com.dreams.dream.dao.base;

import com.dreams.dream.pojo.base.CommentReplyInfo;
import com.dreams.dream.pojo.base.Criteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentReplyInfoMapper {
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
    int deleteByPrimaryKey(Integer replyId);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(CommentReplyInfo record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(CommentReplyInfo record);

    /**
     * 根据条件查询记录集
     */
    List<CommentReplyInfo> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    CommentReplyInfo selectByPrimaryKey(Integer replyId);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") CommentReplyInfo record, @Param("example") Criteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") CommentReplyInfo record, @Param("example") Criteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(CommentReplyInfo record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(CommentReplyInfo record);
}