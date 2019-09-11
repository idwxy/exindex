package com.idwxy.exindex.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Date;

// 用户生理指标类
public class UserIndex {

    // 自增 id 在
    private Integer id;

    // 用户 id
    @JsonInclude(Include.NON_DEFAULT)
    private Integer userId;

    // 生理指标类型，包括（体重、血压、血糖、血脂、心率等）
    @JsonInclude(Include.NON_DEFAULT)
    private Integer indexType;

    // 生理指标值
    private Integer indexContent;

    // 用户上传时间
    private Date collectDate;

    // 构造函数
    public UserIndex() {
        super();
    }

    public UserIndex(Integer userId, Integer indexType, Integer indexContent, Date collectDate) {
        super();
        this.userId = userId;
        this.indexType = indexType;
        this.indexContent = indexContent;
        this.collectDate = collectDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIndexType() {
        return indexType;
    }

    public void setIndexType(Integer indexType) {
        this.indexType = indexType;
    }

    public Integer getIndexContent() {
        return indexContent;
    }

    public void setIndexContent(Integer indexContent) {
        this.indexContent = indexContent;
    }

    public Date getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Date collectDate) {
        this.collectDate = collectDate;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "UserIndex [id=" + id +
                ",userId=" + userId +
                ",indexType=" + indexType +
                ",indexContent=" + indexContent +
                ",collectDate=" + collectDate + "]";
    }
}
