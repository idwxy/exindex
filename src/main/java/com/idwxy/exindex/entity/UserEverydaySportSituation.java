package com.idwxy.exindex.entity;

import java.util.Date;
import java.util.List;

public class UserEverydaySportSituation {

    // 用户 id
    private Integer userId;
    // 用户运动日期
    private Date collectDate;
    // 该日总消耗能里
    private Integer sumConsumeEnergy;
    // 该日用户各项运动详情
    private List<UserSportHistory> userSportHistories;

    // 构造函数
    public UserEverydaySportSituation() {
        super();
    }

    public UserEverydaySportSituation(Integer userId, Date collectDate, Integer sumConsumeEnergy,
                                      List<UserSportHistory> userSportHistories) {
        super();
        this.userId = userId;
        this.collectDate = collectDate;
        this.sumConsumeEnergy = sumConsumeEnergy;
        this.userSportHistories = userSportHistories;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Date collectDate) {
        this.collectDate = collectDate;
    }

    public Integer getSumConsumeEnergy() {
        return sumConsumeEnergy;
    }

    public void setSumConsumeEnergy(Integer sumConsumeEnergy) {
        this.sumConsumeEnergy = sumConsumeEnergy;
    }

    public List<UserSportHistory> getUserSportHistories() {
        return userSportHistories;
    }

    public void setUserSportHistories(List<UserSportHistory> userSportHistories) {
        this.userSportHistories = userSportHistories;
    }

    @Override
    public String toString() {
        return "UserEverydaySportSituation [userId=" + userId +
                ", collectDate=" + collectDate +
                ", sumConsumeEnergy=" + sumConsumeEnergy +
                ", userSportHistories=" + userSportHistories + "]";
    }
}
