package com.idwxy.exindex.controller;

import com.idwxy.exindex.common.PaginationObject;
import com.idwxy.exindex.common.ResultObject;
import com.idwxy.exindex.entity.Food;
import com.idwxy.exindex.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    // 查询食物
    @GetMapping("/get")
    public ResultObject getFoodById(@RequestParam Integer id) {
        Food food = foodService.getFoodById(id);
        ResultObject resultObject = new ResultObject(200, "success", food);
        return resultObject;
    }

    // 新建食物
    @PostMapping("/add")
    public ResultObject insertFood(@RequestBody Food food) {
        int modifyId = foodService.insert(food);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 分页查询食物
    @GetMapping("/list")
    public ResultObject getAllFood(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        PaginationObject paginationObject = foodService.getAllFood(pageNum, pageSize);
        ResultObject resultObject = new ResultObject(200, "success", paginationObject);
        return resultObject;
    }

    // 删除食物
    @DeleteMapping("/delete")
    public ResultObject deleteFood(@RequestParam Integer id) {
        int modifyId = foodService.deleteFood(id);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 更新食物
    @PutMapping("/edit")
    public ResultObject updateFood(@RequestBody Food food) {
        int modifyId = foodService.updateFood(food);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId" , modifyId);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }
}
