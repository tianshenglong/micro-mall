/**
  * PnGoodsMapper.java
  * Copyright(C) 2017-2020 
  * @date 2020-03-19
  */
package com.mall.good.dao;

import com.mall.good.entity.PnGoods;
import com.mall.good.entity.PnGoodsCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PnGoodsMapper {
    /**
     *  根据指定的条件获取数据库记录数:pn_goods
     *
     * @param example
     */
    int countByExample(PnGoodsCriteria example);

    /**
     *  根据指定的条件删除数据库符合条件的记录:pn_goods
     *
     * @param example
     */
    int deleteByExample(PnGoodsCriteria example);

    /**
     *  根据主键删除数据库的记录:pn_goods
     *
     * @param id
     */
    int deleteByPrimaryKey(String id);

    /**
     *  新写入数据库记录:pn_goods
     *
     * @param record
     */
    int insert(PnGoods record);

    /**
     *  动态字段,写入数据库记录:pn_goods
     *
     * @param record
     */
    int insertSelective(PnGoods record);

    /**
     * :pn_goods
     *
     * @param example
     */
    List<PnGoods> selectByExampleWithBLOBs(PnGoodsCriteria example);

    /**
     *  根据指定的条件查询符合条件的数据库记录:pn_goods
     *
     * @param example
     */
    List<PnGoods> selectByExample(PnGoodsCriteria example);

    /**
     *  根据指定主键获取一条数据库记录:pn_goods
     *
     * @param id
     */
    PnGoods selectByPrimaryKey(String id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录:pn_goods
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") PnGoods record, @Param("example") PnGoodsCriteria example);

    /**
     * :pn_goods
     *
     * @param record
     * @param example
     */
    int updateByExampleWithBLOBs(@Param("record") PnGoods record, @Param("example") PnGoodsCriteria example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录:pn_goods
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") PnGoods record, @Param("example") PnGoodsCriteria example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录:pn_goods
     *
     * @param record
     */
    int updateByPrimaryKeySelective(PnGoods record);

    /**
     * :pn_goods
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(PnGoods record);

    /**
     *  根据主键来更新符合条件的数据库记录:pn_goods
     *
     * @param record
     */
    int updateByPrimaryKey(PnGoods record);
}