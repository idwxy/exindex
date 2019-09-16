package com.idwxy.exindex.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idwxy.exindex.common.PaginationObject;
import com.idwxy.exindex.dao.FoodDao;
import com.idwxy.exindex.entity.Food;
import com.idwxy.exindex.service.FoodService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class FoodServiceImpl implements FoodService {

    @Resource
    private FoodDao foodDao;

    @Override
    public Food getFoodById(Integer id) {
        Food food = foodDao.getById(id);
        return food;
    }

    @Override
    public int insert(Food food) {
        int modifyId = foodDao.insert(food);
        return modifyId;
    }

    @Override
    public PaginationObject getAllFood(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Food> foods = foodDao.getAll();
        PageInfo<Food> appsPageInfo = new PageInfo<>(foods);
        long total = appsPageInfo.getTotal();
        PaginationObject paginationObject = new PaginationObject(foods, pageNum, pageSize, total);
        return paginationObject;
    }

    @Override
    public int updateFood(Food food) {
        int modifyId = foodDao.update(food);
        return modifyId;
    }

    @Override
    public int deleteFood(Integer id) {
        int modifyId = foodDao.delete(id);
        return modifyId;
    }
}
