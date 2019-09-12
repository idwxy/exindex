package com.idwxy.exindex.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idwxy.exindex.common.PaginationObject;
import com.idwxy.exindex.dao.UserDao;
import com.idwxy.exindex.entity.User;
import com.idwxy.exindex.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // 自动注入 dao
    @Resource
    private UserDao userDao;

    @Override
    public int insertUser(User user) {
        // 设置时间
        user.setCreateTime(new java.sql.Date(new Date().getTime()));
        int modifyId = userDao.insert(user);
        return modifyId;
    }

    @Override
    public User getUserById(Integer id) {
        User user = userDao.getById(id);
        return user;
    }

    @Override
    public PaginationObject getAllUser(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userDao.getAll();
        PageInfo<User> appsPageInfo = new PageInfo<User>(users);
        long total = appsPageInfo.getTotal();
        PaginationObject paginationObject = new PaginationObject(users, pageNum, pageSize, total);
        return paginationObject;
    }

    @Override
    public int updateUser(User user) {
        int modifyId = userDao.update(user);
        return modifyId;
    }

    @Override
    public int delete(Integer id) {
        int modifyId = userDao.delete(id);
        return modifyId;s
    }
}
