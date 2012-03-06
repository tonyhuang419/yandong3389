package com.dreams.dream.dao.base;

import com.dreams.dream.pojo.base.ArticleTypeInfo;
import com.dreams.dream.pojo.base.Criteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleTypeInfoMapper {
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
    int deleteByPrimaryKey(Integer articleTypeId);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(ArticleTypeInfo record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(ArticleTypeInfo record);

    /**
     * 根据条件查询记录集
     */
    List<ArticleTypeInfo> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    ArticleTypeInfo selectByPrimaryKey(Integer articleTypeId);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") ArticleTypeInfo record, @Param("example") Criteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") ArticleTypeInfo record, @Param("example") Criteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(ArticleTypeInfo record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(ArticleTypeInfo record);
}