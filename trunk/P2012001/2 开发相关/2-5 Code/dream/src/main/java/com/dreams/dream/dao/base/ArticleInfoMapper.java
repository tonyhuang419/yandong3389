package com.dreams.dream.dao.base;

import com.dreams.dream.pojo.base.ArticleInfo;
import com.dreams.dream.pojo.base.Criteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleInfoMapper {
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
    int deleteByPrimaryKey(Integer articleId);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(ArticleInfo record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(ArticleInfo record);

    /**
     * 根据条件查询记录集
     */
    List<ArticleInfo> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    ArticleInfo selectByPrimaryKey(Integer articleId);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") ArticleInfo record, @Param("example") Criteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") ArticleInfo record, @Param("example") Criteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(ArticleInfo record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(ArticleInfo record);
}