package com.idwxy.exindex.controller;

import com.idwxy.exindex.common.ResultObject;
import com.idwxy.exindex.entity.UserEverydaySportSituation;
import com.idwxy.exindex.entity.UserSportHistory;
import com.idwxy.exindex.service.UserSportHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user_sport_history")
public class UserSportHistoryController {

    @Autowired
    private UserSportHistoryService userSportHistoryService;

    // 新建用户饮食记录
    @PostMapping("/add")
    public ResultObject insertUserSportHistory(@RequestBody UserSportHistory userSportHistory) {
        int modifyId = userSportHistoryService.insertUserSportHistory(userSportHistory);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject();
        resultObject.setResult(map);

        // 通过 modifyId 判断是否执行成功
        if (modifyId == 1) {
            resultObject.setCode(200);
            resultObject.setMsg("success");
        } else {
            resultObject.setCode(406);
            resultObject.setMsg("fail");
        }

        return resultObject;
    }

    // 查询用户饮食历史
    @GetMapping("/get")
    public ResultObject getAllUserSportHistory(@RequestParam Integer userId) {
        List<UserEverydaySportSituation> userEverydaySportSituations =
                userSportHistoryService.getAllUserSportHistory(userId);
        ResultObject resultObject = new ResultObject(200, "success", userEverydaySportSituations);
        return resultObject;
    }
}
