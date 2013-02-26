package com.dreams.dream.dao.base;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.WeiboCommentInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeiboCommentInfoMapper {
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
    int deleteByPrimaryKey(String weiboCommentId);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(WeiboCommentInfo record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(WeiboCommentInfo record);

    /**
     * 根据条件查询记录集
     */
    List<WeiboCommentInfo> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    WeiboCommentInfo selectByPrimaryKey(String weiboCommentId);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") WeiboCommentInfo record, @Param("example") Criteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") WeiboCommentInfo record, @Param("example") Criteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(WeiboCommentInfo record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(WeiboCommentInfo record);
}