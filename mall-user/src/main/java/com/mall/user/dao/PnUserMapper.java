/**
  * PnUserMapper.java
  * Copyright(C) 2017-2020 
  * @date 2020-03-13
  */
package com.mall.user.dao;

import com.mall.user.entity.PnUser;
import com.mall.user.entity.PnUserCriteria;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PnUserMapper {
    /**
     *  根据指定的条件获取数据库记录数:pn_user
     *
     * @param example
     */
    int countByExample(PnUserCriteria example);

    /**
     *  根据指定的条件删除数据库符合条件的记录:pn_user
     *
     * @param example
     */
    int deleteByExample(PnUserCriteria example);

    /**
     *  根据主键删除数据库的记录:pn_user
     *
     * @param id
     */
    int deleteByPrimaryKey(String id);

    /**
     *  新写入数据库记录:pn_user
     *
     * @param record
     */
    int insert(PnUser record);

    /**
     *  动态字段,写入数据库记录:pn_user
     *
     * @param record
     */
    int insertSelective(PnUser record);

    /**
     *  根据指定的条件查询符合条件的数据库记录:pn_user
     *
     * @param example
     */
    List<PnUser> selectByExample(PnUserCriteria example);

    /**
     *  根据指定主键获取一条数据库记录:pn_user
     *
     * @param id
     */
    PnUser selectByPrimaryKey(String id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录:pn_user
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") PnUser record, @Param("example") PnUserCriteria example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录:pn_user
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") PnUser record, @Param("example") PnUserCriteria example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录:pn_user
     *
     * @param record
     */
    int updateByPrimaryKeySelective(PnUser record);

    /**
     *  根据主键来更新符合条件的数据库记录:pn_user
     *
     * @param record
     */
    int updateByPrimaryKey(PnUser record);
}