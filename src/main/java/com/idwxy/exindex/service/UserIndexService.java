package com.idwxy.exindex.service;

import com.idwxy.exindex.entity.UserIndex;

import java.util.List;

public interface UserIndexService {

    /**
     * 通过 userId、类型查询用户生理指标数据
     * @param userIndex
     * @return
     */
    List<UserIndex> getUserIndexById(Integer userId);

    /**
     * 创建用户生理指标数据
     * @param userIndex
     * @return
     */
    int insertUserIndex(UserIndex userIndex);

    /**
     * 更新用户生理指标数据
     * @param userIndex
     * @return
     */
    int updateUserIndex(UserIndex userIndex);

    /**
     * 通过 id 删除用户生理指标数据
     * @param userIndexId
     * @return
     */
    int delete(Integer userIndexId);
}
