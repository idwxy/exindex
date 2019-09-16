package com.idwxy.exindex.service.impl;

import com.idwxy.exindex.dao.UserFoodHistoryDao;
import com.idwxy.exindex.entity.UserEverydayFoodSituation;
import com.idwxy.exindex.entity.UserFoodHistory;
import com.idwxy.exindex.service.UserFoodHistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class UserFoodHistoryServiceImpl implements UserFoodHistoryService {

    @Resource
    private UserFoodHistoryDao userFoodHistoryDao;

    @Override
    public int insertUserFoodHistory(UserFoodHistory userFoodHistory) {
        int modifyId = userFoodHistoryDao.insert(userFoodHistory);
        return modifyId;
    }

    @Override
    public List<UserEverydayFoodSituation> getAllUserFoodHistory(Integer userId) {
        // 获取用户所有饮食记录
        List<UserFoodHistory> userFoodHistories = userFoodHistoryDao.getAll(userId);
        Map<Date, List<UserFoodHistory>> userFoodMap = new HashMap<>();
        for (UserFoodHistory userFoodHistory : userFoodHistories) {
            Date cDate = userFoodHistory.getCollectDate();
            // 如果当前日期已经存在于 userFoodMap 中，将这条饮食记录直接添加岛 list 末尾
            if (userFoodMap.containsKey(cDate)) {
                List<UserFoodHistory> userFoodList = userFoodMap.get(cDate);
                userFoodList.add(userFoodHistory);
                // 如果 userFoodMap 中不存在当前日期，则新建 list，并将这条饮食记录直接添加到 list 中
            } else {
                List<UserFoodHistory> userFoodList = new ArrayList<>();
                userFoodList.add(userFoodHistory);
                userFoodMap.put(cDate, userFoodList);
            }
        }

        // userEverydayFoodSituation 中，一个元素代表用户一天的饮食情况和摄入能量情况
        List<UserEverydayFoodSituation> userEverydayFoodSituations = new ArrayList<>();

        for (Map.Entry<Date, List<UserFoodHistory>> entry : userFoodMap.entrySet()) {
            UserEverydayFoodSituation userEverydayFoodSituation = new UserEverydayFoodSituation();
            userEverydayFoodSituation.setUserId(userId);
            userEverydayFoodSituation.setCollectDate(entry.getKey());
            userEverydayFoodSituation.setUserFoodHistories(entry.getValue());

            // 某日摄入能量总和
            int sumFoodEnergy = 0;

            for (UserFoodHistory userFoodHistory : entry.getValue()) {
                sumFoodEnergy += userFoodHistory.getFoodQuantity() * userFoodHistory.getFood().getFoodEnergy() / 500;
            }
            userEverydayFoodSituation.setSumFoodEnergy(sumFoodEnergy);
            userEverydayFoodSituations.add(userEverydayFoodSituation);
        }
        return userEverydayFoodSituations;
    }
}
