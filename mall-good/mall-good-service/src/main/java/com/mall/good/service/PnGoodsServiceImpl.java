package com.mall.good.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall.good.dao.PnGoodsMapper;
import com.mall.good.entity.PnGoods;
import com.mall.good.entity.PnGoodsCriteria;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pnGoodsService")
@Slf4j
public class PnGoodsServiceImpl {
    @Autowired
    private PnGoodsMapper pnGoodsMapper;

    public int countByExample(PnGoodsCriteria example) {
        int count = this.pnGoodsMapper.countByExample(example);
        log.debug("count: {}", count);
        return count;
    }

    public PnGoods selectByPrimaryKey(String id) {
        return this.pnGoodsMapper.selectByPrimaryKey(id);
    }

    public List<PnGoods> selectByExample(PnGoodsCriteria example) {
        return this.pnGoodsMapper.selectByExample(example);
    }

    public PageInfo<PnGoods> selectPageByExample(PnGoodsCriteria example) {
        PageHelper.startPage(example.getPageNumber(), example.getPageSize());
        List<PnGoods> list = this.pnGoodsMapper.selectByExample(example);
        PageInfo<PnGoods> pageInfo = new PageInfo<PnGoods>(list);
        return pageInfo;
    }

    public int deleteByPrimaryKey(String id) {
        return this.pnGoodsMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(PnGoods record) {
        return this.pnGoodsMapper.updateByPrimaryKeySelective(record);
    }


    public int deleteByExample(PnGoodsCriteria example) {
        return this.pnGoodsMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(PnGoods record, PnGoodsCriteria example) {
        return this.pnGoodsMapper.updateByExampleSelective(record, example);
    }


    public int insert(PnGoods record) {
        return this.pnGoodsMapper.insert(record);
    }

    public int insertSelective(PnGoods record) {
        return this.pnGoodsMapper.insertSelective(record);
    }
}