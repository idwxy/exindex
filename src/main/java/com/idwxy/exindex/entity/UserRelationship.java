package com.idwxy.exindex.entity;

import java.util.List;
import java.util.Map;

public class UserRelationship {

    // 用户 id
    private Integer userId;
    // 用户每日饮食摄入能量
    private List<EnergyDate> foodEnergies;
    // 用户每日运动消耗能里
    private List<EnergyDate> sportEnergies;
    // 用户每日各项生理指标的情况
    private Map<Integer, List<UserIndex>> userIndexs;

    // 构造函数
    public UserRelationship() {
        super();
    }

    public UserRelationship(Integer userId, List<EnergyDate> foodEnergies, List<EnergyDate> sportEnergies,
                            Map<Integer, List<UserIndex>> userIndexs) {
        super();
        this.userId = userId;
        this.foodEnergies = foodEnergies;
        this.sportEnergies = sportEnergies;
        this.userIndexs = userIndexs;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<EnergyDate> getFoodEnergies() {
        return foodEnergies;
    }

    public void setFoodEnergies(List<EnergyDate> foodEnergies) {
        this.foodEnergies = foodEnergies;
    }

    public List<EnergyDate> getSportEnergies() {
        return sportEnergies;
    }

    public void setSportEnergies(List<EnergyDate> sportEnergies) {
        this.sportEnergies = sportEnergies;
    }

    public Map<Integer, List<UserIndex>> getUserIndexs() {
        return userIndexs;
    }

    public void setUserIndexs(Map<Integer, List<UserIndex>> userIndexs) {
        this.userIndexs = userIndexs;
    }

    @Override
    public String toString() {
        return "UserRelationship [userId=" + userId +
                ", foodEnergies=" + foodEnergies +
                ", sportEnergies=" + sportEnergies +
                ",userIndexs=" + userIndexs + "]";
    }
}
