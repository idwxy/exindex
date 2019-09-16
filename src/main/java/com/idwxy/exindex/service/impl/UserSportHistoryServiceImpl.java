package com.idwxy.exindex.service.impl;

import com.idwxy.exindex.dao.UserSportHistoryDao;
import com.idwxy.exindex.entity.UserEverydaySportSituation;
import com.idwxy.exindex.entity.UserSportHistory;
import com.idwxy.exindex.service.UserSportHistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class UserSportHistoryServiceImpl implements UserSportHistoryService {

    @Resource
    private UserSportHistoryDao userSportHistoryDao;

    @Override
    public int insertUserSportHistory(UserSportHistory userSportHistory) {
        int modifyId = userSportHistoryDao.insert(userSportHistory);
        return modifyId;
    }

    @Override
    public List<UserEverydaySportSituation> getAllUserSportHistory(Integer userId) {
        List<UserSportHistory> userSportHistories = userSportHistoryDao.getAll(userId);

        // userSportMap,key 为日期，value 为用户该日运动情况
        Map<Date, List<UserSportHistory>> userSportMap = new HashMap<>();

        for (UserSportHistory userSportHistory : userSportHistories) {
            Date cDate = userSportHistory.getCollectDate();

            // 如果当前日期已经存在于 userSportMap 中，将这条运动记录直接添加到 list 末尾
            if (userSportMap.containsKey(cDate)) {
                List<UserSportHistory> userSportList = userSportMap.get(cDate);
                userSportList.add(userSportHistory);

                // 如果 userSportMap 中不存在当前日期，则新建 list，并将这条运动记录直接添加到 list 中
            } else {
                List<UserSportHistory> userSportList = new ArrayList<>();
                userSportList.add(userSportHistory);
                userSportMap.put(cDate, userSportList);
            }
        }

        // userEverydaySportSituations, 一个元素代表用户一天的运动情况合消耗能量情况
        List<UserEverydaySportSituation> userEverydaySportSituations = new ArrayList<>();

        for (Map.Entry<Date, List<UserSportHistory>> entry : userSportMap.entrySet()) {
            UserEverydaySportSituation userEverydaySportSituation = new UserEverydaySportSituation();
            userEverydaySportSituation.setUserId(userId);
            userEverydaySportSituation.setCollectDate(entry.getKey());
            userEverydaySportSituation.setUserSportHistories(entry.getValue());

            // 消耗能量总和
            int sumConsumeEnergy = 0;
            for (UserSportHistory userSportHistory : entry.getValue()) {
                sumConsumeEnergy += userSportHistory.getSportTime() *
                        userSportHistory.getSport().getConsumeEnergy();
            }
            userEverydaySportSituation.setSumConsumeEnergy(sumConsumeEnergy);
            userEverydaySportSituations.add(userEverydaySportSituation);
        }
        return userEverydaySportSituations;
    }
}
