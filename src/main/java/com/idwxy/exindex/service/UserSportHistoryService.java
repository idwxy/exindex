package com.idwxy.exindex.service;

import com.idwxy.exindex.entity.UserEverydaySportSituation;
import com.idwxy.exindex.entity.UserSportHistory;

import java.util.List;

public interface UserSportHistoryService {

    /**
     * 创建用户运动记录
     * @param userSportHistory
     * @return
     */
    int insertUserSportHistory(UserSportHistory userSportHistory);

    /**
     * 查询用户所有运动记录
     * @param userId
     * @return
     */
    List<UserEverydaySportSituation> getAllUserSportHistory(Integer userId);
}
