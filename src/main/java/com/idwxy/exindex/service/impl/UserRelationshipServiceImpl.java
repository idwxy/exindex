package com.idwxy.exindex.service.impl;

import com.idwxy.exindex.dao.UserFoodHistoryDao;
import com.idwxy.exindex.dao.UserIndexDao;
import com.idwxy.exindex.dao.UserSportHistoryDao;
import com.idwxy.exindex.entity.EnergyDate;
import com.idwxy.exindex.entity.UserIndex;
import com.idwxy.exindex.entity.UserRelationship;
import com.idwxy.exindex.service.UserRelationshipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserRelationshipServiceImpl implements UserRelationshipService {

    @Resource
    private UserFoodHistoryDao userFoodHistoryDao;

    @Resource
    private UserSportHistoryDao userSportHistoryDao;

    @Resource
    private UserIndexDao userIndexDao;

    @Override
    public UserRelationship getRelationship(Integer userId) {
        UserRelationship relationship = new UserRelationship();

        // foodEnergies，用户每天摄入能量合日期
        List<EnergyDate> foodEnergies = userFoodHistoryDao.getSumFoodEnergy(userId);
        // sportEnergyDates,用户每天运动消耗能量合日期
        List<EnergyDate> sportEnergyDates = userSportHistoryDao.getSumConsumeEnergy(userId);
        // userIndexs,用户所有生理指标
        List<UserIndex> userIndexs = userIndexDao.getById(userId);
        // map, key: 生理指标类型，value：用户该项生理指标历史情况
        Map<Integer, List<UserIndex>> map = new HashMap<>();

        for (UserIndex userIndex : userIndexs) {
            int indexType = userIndex.getIndexType();
            if (map.containsKey(indexType)) {
                List<UserIndex> userIndexs2 = map.get(indexType);
                userIndexs2.add(userIndex);
            } else {
                List<UserIndex> userIndexs2 = new ArrayList<>();
                userIndexs2.add(userIndex);
                map.put(indexType, userIndexs2);
            }
        }

        relationship.setUserId(userId);
        relationship.setFoodEnergies(foodEnergies);
        relationship.setSportEnergies(sportEnergyDates);
        relationship.setUserIndexs(map);
        return relationship;
    }
}
