package com.idwxy.exindex.service;

import com.idwxy.exindex.common.PaginationObject;
import com.idwxy.exindex.entity.Food;

public interface FoodService {

    /**
     * 查询食物
     * @param id
     * @return
     */
    Food getFoodById(Integer id);

    /**
     * 创建食物
     * @param food
     * @return
     */
    int insert(Food food);

    /**
     * 分页查询所有食物
     * @param pageNum
     * @param pageSize
     * @return
     */
    PaginationObject getAllFood(Integer pageNum, Integer pageSize);

    /**
     * 更新食物
     * @param food
     * @return
     */
    int updateFood(Food food);

    /**
     * 删除食物
     * @param id
     * @return
     */
    int deleteFood(Integer id);
}
