package com.idwxy.exindex.service.impl;

import com.idwxy.exindex.dao.UserIndexDao;
import com.idwxy.exindex.entity.UserIndex;
import com.idwxy.exindex.service.UserIndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class UserIndexServiceImpl implements UserIndexService {

    @Resource
    private UserIndexDao userIndexDao;

    @Override
    public List<UserIndex> getUserIndexById(Integer userId) {
        List<UserIndex> userIndices = userIndexDao.getById(userId);
        return userIndices;
    }

    @Override
    public int insertUserIndex(UserIndex userIndex) {
        // 设置创建时间
        userIndex.setCollectDate(new java.sql.Date(new Date().getTime()));
        int modifyId = userIndexDao.insert(userIndex);
        return modifyId;
    }

    @Override
    public int updateUserIndex(UserIndex userIndex) {
        int modifyId = userIndexDao.update(userIndex);
        return modifyId;
    }

    @Override
    public int delete(Integer userIndexId) {
        int modifyId = userIndexDao.delete(userIndexId);
        return modifyId;
    }
}
