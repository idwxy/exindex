package com.idwxy.exindex.service;

import com.idwxy.exindex.common.PaginationObject;
import com.idwxy.exindex.entity.User;

public interface insertUser {

    /**
     * 创建用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 通过 id 查询用户
     * @param id
     * @return
     */
    User getUserById(Integer id);

    /**
     * 分页查询用户
     * @param pageNum
     * @param pageSize
     * @return
     */
    PaginationObject getAllUser(Integer pageNum, Integer pageSize);

    /**
     * 更新用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     * @param id
     * @return
     */
    int delete(Integer id);
}
