package com.idwxy.exindex.dao;

import com.idwxy.exindex.entity.EnergyDate;
import com.idwxy.exindex.entity.UserFoodHistory;

import java.util.List;

public interface UserFoodHistoryDao {

    /**
     * 记录用户饮食
     * @param userFoodHistory
     * @return
     */
    int insert(UserFoodHistory userFoodHistory);

    /**
     * 获取指定用户所用饮食记录
     * @param userId
     * @return
     */
    List<UserFoodHistory> getAll(Integer userId);

    /**
     * 获取指定用户每日的摄入能量
     * @param userId
     * @return
     */
    List<EnergyDate> getSumFoodEnergy(Integer userId);

}
