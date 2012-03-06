package com.dreams.dream.dao.base;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.GiftInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GiftInfoMapper {
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
    int deleteByPrimaryKey(Integer giftId);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(GiftInfo record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(GiftInfo record);

    /**
     * 根据条件查询记录集
     */
    List<GiftInfo> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    GiftInfo selectByPrimaryKey(Integer giftId);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") GiftInfo record, @Param("example") Criteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") GiftInfo record, @Param("example") Criteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(GiftInfo record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(GiftInfo record);
}