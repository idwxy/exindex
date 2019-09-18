package com.idwxy.exindex.controller;

import com.idwxy.exindex.common.ResultObject;
import com.idwxy.exindex.entity.UserRelationship;
import com.idwxy.exindex.service.UserRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/relationship")
public class UserRelationshipController {

    @Autowired
    private UserRelationshipService relationshipService;

    // 查询用户饮食、运动、生理指标关系
    @RequestMapping("/get")
    public ResultObject getRelationship(@RequestParam Integer userId) {
        UserRelationship relationship = relationshipService.getRelationship(userId);
        ResultObject resultObject = new ResultObject(200, "success", relationship);
        return resultObject;
    }
}
