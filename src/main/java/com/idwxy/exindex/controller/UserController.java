package com.idwxy.exindex.controller;

import com.idwxy.exindex.common.PaginationObject;
import com.idwxy.exindex.common.ResultObject;
import com.idwxy.exindex.entity.User;
import com.idwxy.exindex.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 创建用户
    @PostMapping("/add")
    public ResultObject insertUser(@RequestBody User user) {
        int modifyId = userService.insertUser(user);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, " ", map);
        return resultObject;
    }

    // 查询用户
    @GetMapping("/get")
    public ResultObject getUserById(@RequestParam Integer id) {
        User user = userService.getUserById(id);
        ResultObject resultObject = new ResultObject(200, "", user);
        return resultObject;
    }

    // 分页查询用户
    @GetMapping("/list")
    public ResultObject getAllUser(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        PaginationObject paginationObject = userService.getAllUser(pageNum, pageSize);
        ResultObject resultObject = new ResultObject(200, "", paginationObject);
        return resultObject;
    }

    // 删除用户
    @DeleteMapping("/delete")
    public ResultObject delete(@RequestParam Integer id) {
        int modifyId = userService.delete(id);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "", map);
        return resultObject;
    }

    // 更新用户
    @PutMapping("/edit")
    public ResultObject updateUser(@RequestBody User user) {
        int modifyId = userService.updateUser(user);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "", map);
        return resultObject;
    }

}
