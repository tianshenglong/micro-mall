package com.mall.user.controller;

import com.github.pagehelper.PageInfo;
import com.mall.user.entity.PnUser;
import com.mall.user.entity.PnUserCriteria;
import com.mall.user.service.PnUserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>Description  UserController</p>
 *
 * @author tianshenglong
 * @date 2020/3/16 22:11
 * @return
 */
@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Resource(name = "pnUserService")
    private PnUserServiceImpl pnUserService;

    @PostMapping()
    public ResponseEntity<String> saveUser(@RequestBody PnUser user){
        pnUserService.insertSelective(user);
        return ResponseEntity.ok(HttpStatus.OK.toString());
    }

    @PutMapping
    public ResponseEntity<String> modifyUser(@RequestBody PnUser user){
        pnUserService.updateByPrimaryKeySelective(user);
        return ResponseEntity.ok(HttpStatus.OK.toString());
    }

    @GetMapping("/list")
    public ResponseEntity<PageInfo<PnUser>> listUser(Integer pageNum,Integer pageSize){

        PnUserCriteria pnUserCriteria = new PnUserCriteria();
        pnUserCriteria.setPageNumber(pageNum);
        pnUserCriteria.setPageSize(pageSize);
        pnUserCriteria.createCriteria().andDeleteFlagEqualTo((byte) 1);
        return ResponseEntity.ok(pnUserService.selectPageByExample(pnUserCriteria));
    }


}
