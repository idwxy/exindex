package com.idwxy.exindex.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Date;

// 记录用户饮食历史
@JsonInclude(Include.NON_DEFAULT)
public class UserFoodHistory {

    // 主键自增 id
    private Integer id;
    // 用户 id
    private  Integer userId;
    // 食物详情
    private Food food;
    // 该食物摄入量，单位 g
    private Integer foodQuantity;
    // 摄入饮食日期
    private Date collectDate;

    public UserFoodHistory() {
        super();
    }

    public UserFoodHistory(Integer userId, Food food, Integer foodQuantity, Date collectDate) {
        super();
        this.userId = userId;
        this.food = food;
        this.foodQuantity = foodQuantity;
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

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Integer getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(Integer foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public Date getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Date collectDate) {
        this.collectDate = collectDate;
    }

    @Override
    public String toString() {
        return "UserFoodHistory [id=" + id +
                ", userId=" + userId +
                ", food=" + food + 
                ", foodQuantity=" + foodQuantity +
                ", collectDate=" + collectDate + "]";
    }
}
