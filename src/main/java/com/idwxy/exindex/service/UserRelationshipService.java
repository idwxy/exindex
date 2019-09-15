package com.idwxy.exindex.service;

import com.idwxy.exindex.entity.UserRelationship;

public interface UserRelationshipService {

    /**
     * 查询用户饮食、运动、生理指标关系
     * @param userId
     * @return
     */
    UserRelationship getRelationship(Integer userId);
}
