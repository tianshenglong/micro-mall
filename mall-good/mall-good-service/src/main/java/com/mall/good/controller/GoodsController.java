package com.mall.good.controller;

import com.github.pagehelper.PageInfo;
import com.mall.good.entity.PnGoods;
import com.mall.good.entity.PnGoodsCriteria;
import com.mall.good.service.PnGoodsServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>Description  GoodsController</p>
 *
 * @author tianshenglong
 * @date 2020/3/19 23:11
 * @return
 */
@RestController
@RequestMapping("/v1/goods")
public class GoodsController {

    @Resource(name = "pnGoodsService")
    private PnGoodsServiceImpl pnGoodsService;

    @PostMapping()
    public ResponseEntity<String> saveUser(@RequestBody PnGoods pnGoods){
        pnGoodsService.insertSelective(pnGoods);
        return ResponseEntity.ok(HttpStatus.OK.toString());
    }

    @PutMapping
    public ResponseEntity<String> modifyUser(@RequestBody PnGoods pnGoods){
        pnGoodsService.updateByPrimaryKeySelective(pnGoods);
        return ResponseEntity.ok(HttpStatus.OK.toString());
    }

    @GetMapping("/list")
    public ResponseEntity<PageInfo<PnGoods>> listUser(Integer pageNum, Integer pageSize){

        PnGoodsCriteria pnGoodsCriteria = new PnGoodsCriteria();
        pnGoodsCriteria.setPageNumber(pageNum);
        pnGoodsCriteria.setPageSize(pageSize);
        pnGoodsCriteria.createCriteria().andDeleteFlagEqualTo( 1);
        return ResponseEntity.ok(pnGoodsService.selectPageByExample(pnGoodsCriteria));
    }
}
