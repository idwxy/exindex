package com.idwxy.exindex.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Date;

@JsonInclude(Include.NON_DEFAULT)
public class UserSportHistory {

    // 主键自增 id
    private Integer id;
    // 用户 id
    private Integer userId;
    // 运动详情
    private Sport sport;
    // 运行时间，单位 h
    private Integer sportTime;
    // 运动日期
    private Date collectDate;

    // 构造函数
    public UserSportHistory() {
        super();
    }

    public UserSportHistory(Integer userId, Sport sport, Integer sportTime, Date collectDate) {
        super();
        this.userId = userId;
        this.sport = sport;
        this.sportTime = sportTime;
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

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Integer getSportTime() {
        return sportTime;
    }

    public void setSportTime(Integer sportTime) {
        this.sportTime = sportTime;
    }

    public Date getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Date collectDate) {
        this.collectDate = collectDate;
    }

    // 重写 toString
    @Override
    public String toString() {
        return "UserSportHistory [id=" + id +
                ", userId=" + userId +
                ", sport=" + sport +
                ", sportTime=" + sportTime +
                ", collectDate=" + collectDate + "]";
    }
}
