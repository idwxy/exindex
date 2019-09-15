package com.idwxy.exindex.service;

import com.idwxy.exindex.entity.UserEverydayFoodSituation;
import com.idwxy.exindex.entity.UserFoodHistory;

import java.util.List;

public interface UserFoodHistoryService {

    /**
     * 创建用户饮食记录
     * @param userFoodHistory
     * @return
     */
    int insertUserFoodHistory(UserFoodHistory userFoodHistory);

    /**
     * 查询用户所有饮食记录
     * @param userId
     * @return
     */
    List<UserEverydayFoodSituation> getAllUserFoodHistory(Integer userId);
}
