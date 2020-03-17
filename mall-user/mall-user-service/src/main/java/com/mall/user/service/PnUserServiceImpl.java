package com.mall.user.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall.user.dao.PnUserMapper;
import com.mall.user.entity.PnUser;
import com.mall.user.entity.PnUserCriteria;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service("pnUserService")
@Slf4j
public class PnUserServiceImpl {

    @Autowired
    private PnUserMapper pnUserMapper;

    public int countByExample(PnUserCriteria example) {
        int count = this.pnUserMapper.countByExample(example);
        log.debug("count: {}", count);
        return count;
    }

    public PnUser selectByPrimaryKey(String id) {
        return this.pnUserMapper.selectByPrimaryKey(id);
    }

    public List<PnUser> selectByExample(PnUserCriteria example) {
        return this.pnUserMapper.selectByExample(example);
    }

    public PageInfo<PnUser> selectPageByExample(PnUserCriteria example) {
        PageHelper.startPage(example.getPageNumber(), example.getPageSize());
        List<PnUser> list = this.pnUserMapper.selectByExample(example);
        PageInfo<PnUser> pageInfo = new PageInfo<PnUser>(list);
        return pageInfo;
    }

    public int deleteByPrimaryKey(String id) {
        return this.pnUserMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(PnUser record) {
        return this.pnUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(PnUser record) {
        return this.pnUserMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(PnUserCriteria example) {
        return this.pnUserMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(PnUser record, PnUserCriteria example) {
        return this.pnUserMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(PnUser record, PnUserCriteria example) {
        return this.pnUserMapper.updateByExample(record, example);
    }

    public int insert(PnUser record) {
        return this.pnUserMapper.insert(record);
    }

    public int insertSelective(PnUser record) {
        record.setCreateTime(LocalDateTime.now());
        record.setStatus((byte) 1);
        record.setDeleteFlag((byte) 1);
        return this.pnUserMapper.insertSelective(record);
    }
}