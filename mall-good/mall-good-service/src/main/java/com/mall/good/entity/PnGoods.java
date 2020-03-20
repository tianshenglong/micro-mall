/**
  * PnGoods.java
  * Copyright(C) 2017-2020 
  * @date 2020-03-19
  */
package com.mall.good.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Title pn_goods表实体类
 * @Description 
 * @Version 1.0 
 * @Author tianshenglong 
 * @Date 2020-03-19 22:50:49
 */
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value ="PnGoods")
public class PnGoods implements Serializable {
    /**
     * @Fields id 
     */
    @ApiModelProperty(value = "")
    private String id;

    /**
     * @Fields goodsName 
     */
    @ApiModelProperty(value = "")
    private String goodsName;

    /**
     * @Fields goodsType 商品分类
     */
    @ApiModelProperty(value = "商品分类")
    private String goodsType;

    /**
     * @Fields goodsCode 
     */
    @ApiModelProperty(value = "")
    private String goodsCode;

    /**
     * @Fields price 
     */
    @ApiModelProperty(value = "")
    private BigDecimal price;

    /**
     * @Fields count 库存
     */
    @ApiModelProperty(value = "库存")
    private Integer count;

    /**
     * @Fields goodsImg 
     */
    @ApiModelProperty(value = "")
    private String goodsImg;

    /**
     * @Fields description 商品描述
     */
    @ApiModelProperty(value = "商品描述")
    private String description;

    /**
     * @Fields status 1启用2禁用
     */
    @ApiModelProperty(value = "1启用2禁用")
    private Integer status;

    /**
     * @Fields createTime 
     */
    @ApiModelProperty(value = "")
    private Date createTime;

    /**
     * @Fields modifyTime 
     */
    @ApiModelProperty(value = "")
    private Date modifyTime;

    /**
     * @Fields deleteFlag 1正常2删除
     */
    @ApiModelProperty(value = "1正常2删除")
    private Integer deleteFlag;

    /**
     * @Fields platNo 所属平台1微信公众号2app
     */
    @ApiModelProperty(value = "所属平台1微信公众号2app")
    private Integer platNo;

    /**
     * @Fields platForm 1-安卓  2-ios  3...
     */
    @ApiModelProperty(value = "1-安卓  2-ios  3...")
    private Integer platForm;

    /**
     * @Fields goodsDetail 商品详情
     */
    @ApiModelProperty(value = "商品详情")
    private String goodsDetail;

    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:pn_goods.id
     *
     * @return pn_goods.id, 
     */
    public String getId() {
        return id;
    }

    /**
     * 设置  字段:pn_goods.id
     *
     * @param id the value for pn_goods.id, 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取  字段:pn_goods.goods_name
     *
     * @return pn_goods.goods_name, 
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置  字段:pn_goods.goods_name
     *
     * @param goodsName the value for pn_goods.goods_name, 
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * 获取 商品分类 字段:pn_goods.goods_type
     *
     * @return pn_goods.goods_type, 商品分类
     */
    public String getGoodsType() {
        return goodsType;
    }

    /**
     * 设置 商品分类 字段:pn_goods.goods_type
     *
     * @param goodsType the value for pn_goods.goods_type, 商品分类
     */
    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * 获取  字段:pn_goods.goods_code
     *
     * @return pn_goods.goods_code, 
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * 设置  字段:pn_goods.goods_code
     *
     * @param goodsCode the value for pn_goods.goods_code, 
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    /**
     * 获取  字段:pn_goods.price
     *
     * @return pn_goods.price, 
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置  字段:pn_goods.price
     *
     * @param price the value for pn_goods.price, 
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取 库存 字段:pn_goods.count
     *
     * @return pn_goods.count, 库存
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置 库存 字段:pn_goods.count
     *
     * @param count the value for pn_goods.count, 库存
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 获取  字段:pn_goods.goods_img
     *
     * @return pn_goods.goods_img, 
     */
    public String getGoodsImg() {
        return goodsImg;
    }

    /**
     * 设置  字段:pn_goods.goods_img
     *
     * @param goodsImg the value for pn_goods.goods_img, 
     */
    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    /**
     * 获取 商品描述 字段:pn_goods.description
     *
     * @return pn_goods.description, 商品描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置 商品描述 字段:pn_goods.description
     *
     * @param description the value for pn_goods.description, 商品描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取 1启用2禁用 字段:pn_goods.status
     *
     * @return pn_goods.status, 1启用2禁用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 1启用2禁用 字段:pn_goods.status
     *
     * @param status the value for pn_goods.status, 1启用2禁用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取  字段:pn_goods.create_time
     *
     * @return pn_goods.create_time, 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置  字段:pn_goods.create_time
     *
     * @param createTime the value for pn_goods.create_time, 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取  字段:pn_goods.modify_time
     *
     * @return pn_goods.modify_time, 
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置  字段:pn_goods.modify_time
     *
     * @param modifyTime the value for pn_goods.modify_time, 
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取 1正常2删除 字段:pn_goods.delete_flag
     *
     * @return pn_goods.delete_flag, 1正常2删除
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 设置 1正常2删除 字段:pn_goods.delete_flag
     *
     * @param deleteFlag the value for pn_goods.delete_flag, 1正常2删除
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * 获取 所属平台1微信公众号2app 字段:pn_goods.plat_no
     *
     * @return pn_goods.plat_no, 所属平台1微信公众号2app
     */
    public Integer getPlatNo() {
        return platNo;
    }

    /**
     * 设置 所属平台1微信公众号2app 字段:pn_goods.plat_no
     *
     * @param platNo the value for pn_goods.plat_no, 所属平台1微信公众号2app
     */
    public void setPlatNo(Integer platNo) {
        this.platNo = platNo;
    }

    /**
     * 获取 1-安卓  2-ios  3... 字段:pn_goods.plat_form
     *
     * @return pn_goods.plat_form, 1-安卓  2-ios  3...
     */
    public Integer getPlatForm() {
        return platForm;
    }

    /**
     * 设置 1-安卓  2-ios  3... 字段:pn_goods.plat_form
     *
     * @param platForm the value for pn_goods.plat_form, 1-安卓  2-ios  3...
     */
    public void setPlatForm(Integer platForm) {
        this.platForm = platForm;
    }

    /**
     * 获取 商品详情 字段:pn_goods.goods_detail
     *
     * @return pn_goods.goods_detail, 商品详情
     */
    public String getGoodsDetail() {
        return goodsDetail;
    }

    /**
     * 设置 商品详情 字段:pn_goods.goods_detail
     *
     * @param goodsDetail the value for pn_goods.goods_detail, 商品详情
     */
    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    /**
     * :pn_goods
     *
     * @param that
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PnGoods other = (PnGoods) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsType() == null ? other.getGoodsType() == null : this.getGoodsType().equals(other.getGoodsType()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getGoodsImg() == null ? other.getGoodsImg() == null : this.getGoodsImg().equals(other.getGoodsImg()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getPlatNo() == null ? other.getPlatNo() == null : this.getPlatNo().equals(other.getPlatNo()))
            && (this.getPlatForm() == null ? other.getPlatForm() == null : this.getPlatForm().equals(other.getPlatForm()))
            && (this.getGoodsDetail() == null ? other.getGoodsDetail() == null : this.getGoodsDetail().equals(other.getGoodsDetail()));
    }

    /**
     * :pn_goods
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsType() == null) ? 0 : getGoodsType().hashCode());
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getGoodsImg() == null) ? 0 : getGoodsImg().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getPlatNo() == null) ? 0 : getPlatNo().hashCode());
        result = prime * result + ((getPlatForm() == null) ? 0 : getPlatForm().hashCode());
        result = prime * result + ((getGoodsDetail() == null) ? 0 : getGoodsDetail().hashCode());
        return result;
    }

    /**
     * :pn_goods
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsType=").append(goodsType);
        sb.append(", goodsCode=").append(goodsCode);
        sb.append(", price=").append(price);
        sb.append(", count=").append(count);
        sb.append(", goodsImg=").append(goodsImg);
        sb.append(", description=").append(description);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", platNo=").append(platNo);
        sb.append(", platForm=").append(platForm);
        sb.append(", goodsDetail=").append(goodsDetail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}