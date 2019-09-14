package com.idwxy.exindex.dao;

import com.idwxy.exindex.entity.EnergyDate;
import com.idwxy.exindex.entity.UserSportHistory;

import java.util.List;

public interface UserSportHistoryDao {

    /**
     * 记录用户运动
     * @param userSportHistory
     * @return
     */
    int insert(UserSportHistory userSportHistory);

    /**
     * 获取指定用户所有运动记录
     * @param userId
     * @return
     */
    List<UserSportHistory> getAll(Integer userId);

    /**
     * 获取指定用户每日的运动消耗能量
     * @param userId
     * @return
     */
    List<EnergyDate> getSumConsumeEnergy(Integer userId);
}
