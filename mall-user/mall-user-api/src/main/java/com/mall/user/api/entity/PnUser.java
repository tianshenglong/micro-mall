/**
  * PnUser.java
  * Copyright(C) 2017-2020 
  * @date 2020-03-13
  */
package com.mall.user.api.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Title pn_user表实体类
 * @Description
 * @Version 1.0
 * @Author kelly
 * @Date 2020-03-13 00:28:57
 */

@ApiModel(value ="PnUser")
@Data
public class PnUser implements Serializable {
    /**
     * @Fields id 
     */
    @ApiModelProperty(value = "")
    private String id;

    /**
     * @Fields name 
     */
    @ApiModelProperty(value = "")
    private String name;

    /**
     * @Fields realName 
     */
    @ApiModelProperty(value = "")
    private String realName;

    /**
     * @Fields sex 1男2女
     */
    @ApiModelProperty(value = "1男2女")
    private Byte sex;

    /**
     * @Fields mobile 
     */
    @ApiModelProperty(value = "")
    private String mobile;

    /**
     * @Fields headImg 
     */
    @ApiModelProperty(value = "")
    private String headImg;

    /**
     * @Fields status 1可用2不可用
     */
    @ApiModelProperty(value = "1可用2不可用")
    private Byte status;

    /**
     * @Fields lastLoginTime 
     */
    @ApiModelProperty(value = "")
    private LocalDateTime lastLoginTime;

    /**
     * @Fields createTime 
     */
    @ApiModelProperty(value = "")
    private LocalDateTime createTime;

    /**
     * @Fields modifyTime 
     */
    @ApiModelProperty(value = "")
    private LocalDateTime modifyTime;

    /**
     * @Fields deleteFlag 1正常2删除
     */
    @ApiModelProperty(value = "1正常2删除")
    private Byte deleteFlag;

    private static final long serialVersionUID = 1L;

    /**
     * :pn_user
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
        PnUser other = (PnUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getHeadImg() == null ? other.getHeadImg() == null : this.getHeadImg().equals(other.getHeadImg()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLastLoginTime() == null ? other.getLastLoginTime() == null : this.getLastLoginTime().equals(other.getLastLoginTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()));
    }

    /**
     * :pn_user
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getHeadImg() == null) ? 0 : getHeadImg().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        return result;
    }

    /**
     * :pn_user
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", realName=").append(realName);
        sb.append(", sex=").append(sex);
        sb.append(", mobile=").append(mobile);
        sb.append(", headImg=").append(headImg);
        sb.append(", status=").append(status);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}