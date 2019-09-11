package com.idwxy.exindex.dao;

import com.idwxy.exindex.entity.User;

import java.util.List;

public interface UserDao {

    /**
     * 通过 id 查找用户
     * @param id
     * @return
     */
    User getById(Integer id);

    /**
     * 查找所有用户
     * @return
     */
    List<User> getAll();

    /**
     * 添加用户
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 用户更新
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 通过 id 删除用户
     * @param id
     * @return
     */
    int delete(Integer id);
}
