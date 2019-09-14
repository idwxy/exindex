package com.idwxy.exindex.dao;

import com.idwxy.exindex.entity.Food;

import java.util.List;

public interface FoodDao {

    /**
     * 创建食物
     * @param food
     * @return
     */
    int insert(Food food);

    /**
     * 查询食物
     * @param id
     * @return
     */
    Food getById(Integer id);

    /**
     * 查询所有食物
     * @return
     */
    List<Food> getAll();

    /**
     * 更新食物
     * @param food
     * @return
     */
    int update(Food food);

    /**
     * 删除食物
     * @param id
     * @return
     */
    int delete(int id);
}
