package com.idwxy.exindex.controller;

import com.idwxy.exindex.common.PaginationObject;
import com.idwxy.exindex.common.ResultObject;
import com.idwxy.exindex.entity.Sport;
import com.idwxy.exindex.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ap1/v1/sport")
public class SportController {

    @Autowired
    private SportService sportService;

    // 查询运动
    @GetMapping("/get")
    public ResultObject getSportById(@RequestParam Integer id) {
        Sport sport = sportService.getSportById(id);
        ResultObject resultObject = new ResultObject(200, "sccess", sport);
        return resultObject;
    }

    // 新建运动
    @PostMapping("/add")
    public ResultObject insertSport(@RequestBody Sport sport) {
        int modifyId = sportService.insertSport(sport);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "sccess", modifyId);
        return resultObject;
    }

    // 分页查询运动
    @GetMapping("list")
    public ResultObject getAllSport(@RequestParam int pageNum, @RequestParam int pageSize) {
        PaginationObject paginationObject = sportService.getAllSport(pageNum, pageSize);
        ResultObject resultObject = new ResultObject(200, "success", paginationObject);
        return resultObject;
    }

    // 删除运动
    @DeleteMapping("delete")
    public ResultObject deleteSport(@RequestParam int id) {
        int modifyId = sportService.deleteSport(id);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 更新运动
    @PutMapping("/edit")
    public ResultObject updateSport(@RequestBody Sport sport) {
        int modifyId = sportService.updateSport(sport);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }
}
