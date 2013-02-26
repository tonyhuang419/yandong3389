package com.dreams.dream.dao.base;

import com.dreams.dream.pojo.base.Criteria;
import com.dreams.dream.pojo.base.GameInfo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameInfoMapper {
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
    int deleteByPrimaryKey(String gameId);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(GameInfo record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(GameInfo record);

    /**
     * 根据条件查询记录集
     */
    List<GameInfo> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    GameInfo selectByPrimaryKey(String gameId);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") GameInfo record, @Param("example") Criteria example);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") GameInfo record, @Param("example") Criteria example);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(GameInfo record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(GameInfo record);
}