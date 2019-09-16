package com.idwxy.exindex.controller;

import com.idwxy.exindex.common.ResultObject;
import com.idwxy.exindex.entity.UserIndex;
import com.idwxy.exindex.service.UserIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/userIndex")
public class UserIndexController {

    @Autowired
    private UserIndexService userIndexService;

    // 创建用户生理指标数据
    @PostMapping("/add")
    public ResultObject insertUserIndex(@RequestBody UserIndex userIndex) {
        int modifyId = userIndexService.insertUserIndex(userIndex);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "", map);
        return resultObject;
    }

    // 通过 user ID、类型查询用户生理指标值
    @GetMapping("/get")
    public ResultObject getUserIndexById(@RequestBody UserIndex userIndex) {
        List<UserIndex> userIndexIndexs = userIndexService.getUserIndexById(userIndex.getUserId());
        ResultObject resultObject = new ResultObject(200, "", userIndexIndexs);
        return resultObject;
    }

    // 删除用户
    @DeleteMapping("/delete")
    public ResultObject deleteUserIndex(@RequestParam Integer id) {
        int modifyId = userIndexService.delete(id);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "", map);
        return resultObject;
    }

    // 更新用户
    @PutMapping("/edit")
    public ResultObject updateUserIndex(@RequestBody UserIndex userIndex) {
        int modifyId = userIndexService.updateUserIndex(userIndex);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "", map);
        return resultObject;
    }

}
