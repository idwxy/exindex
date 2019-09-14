package com.idwxy.exindex.entity;

import java.util.Date;
import java.util.List;

public class UserEverydayFoodSituation {

    // 用户 id
    private Integer userId;
    // 饮食日期
    private Date collectDate;
    // 该日摄入总能量
    private Integer sumFoodEnergy;
    // 该日摄入食物详情
    private List<UserFoodHistory> userFoodHistories;

    // 构造函数
    public UserEverydayFoodSituation() {
        super();;
    }

    public UserEverydayFoodSituation(Integer userId, Date collectDate, Integer sumFoodEnergy,
                                     List<UserFoodHistory> userFoodHistories) {
        super();
        this.userId = userId;
        this.collectDate = collectDate;
        this.sumFoodEnergy = sumFoodEnergy;
        this.userFoodHistories = userFoodHistories;
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

    public Integer getSumFoodEnergy() {
        return sumFoodEnergy;
    }

    public void setSumFoodEnergy(Integer sumFoodEnergy) {
        this.sumFoodEnergy = sumFoodEnergy;
    }

    public List<UserFoodHistory> getUserFoodHistories() {
        return userFoodHistories;
    }

    public void setUserFoodHistories(List<UserFoodHistory> userFoodHistories) {
        this.userFoodHistories = userFoodHistories;
    }

    @Override
    public String toString() {
        return "UserEverydayFoodSituation [userId=" + userId +
                ", collectDate=" + collectDate +
                ", sumFoodEnergy=" + sumFoodEnergy +
                ", userFoodHistories=" + userFoodHistories + "]";
    }
}
