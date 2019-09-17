package com.idwxy.exindex.controller;

import com.idwxy.exindex.common.ResultObject;
import com.idwxy.exindex.entity.UserEverydayFoodSituation;
import com.idwxy.exindex.entity.UserFoodHistory;
import com.idwxy.exindex.service.UserFoodHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user_food_history")
public class UserFoodHistoryController {

    @Autowired
    private UserFoodHistoryService userFoodHistoryService;

    // 新建用户饮食记录
    @PostMapping("add")
    public ResultObject insertUserFoodHistory(@RequestBody UserFoodHistory userFoodHistory) {
        int modifyId = userFoodHistoryService.insertUserFoodHistory(userFoodHistory);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject();
        resultObject.setResult(map);
        if (modifyId == 1) {
            resultObject.setCode(1);
            resultObject.setMsg("success");
        } else {
            resultObject.setCode(-1);
            resultObject.setMsg("fail");
        }

        return resultObject;
    }
    
    // 查询用户所有运动历史记录
    @GetMapping("get")
    public ResultObject getAllUserFoodHistory(@RequestParam int userId) {
        List<UserEverydayFoodSituation> userEverydayFoodSituations = userFoodHistoryService.getAllUserFoodHistory(userId);
        ResultObject resultObject = new ResultObject(200, "success", userEverydayFoodSituations);
        return resultObject;
    }
}
