package com.idwxy.exindex.dao;

import com.idwxy.exindex.entity.UserIndex;

import java.util.List;

public interface UserIndexDao {

    /**
     * 通过用户 id 和指标类型获取用户的所有指标
     * @param userId
     * @return
     */
    List<UserIndex> getById(Integer userId);

    /**
     * 创建用户生理指标数据
     * @param userIndex
     * @return
     */
    int insert(UserIndex userIndex);

    /**
     * 更新用户生理指标数据
     * @param userIndex
     * @return
     */
    int update(UserIndex userIndex);

    /**
     * 删除用户生理指标数据
     * @param userIndexId
     * @return
     */
    int delete(Integer userIndexId);
}
