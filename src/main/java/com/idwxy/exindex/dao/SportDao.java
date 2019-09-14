package com.idwxy.exindex.dao;

import com.idwxy.exindex.entity.Sport;

import java.util.List;

public interface SportDao {

    /**
     * 创建运动
     * @param sport
     * @return
     */
    int insert(Sport sport);

    /**
     * 查询运动
     * @param id
     * @return
     */
    Sport getById(Integer id);

    /**
     * 查询所有运动
     * @return
     */
    List<Sport> getAll();

    /**
     * 更新运动
     * @param sport
     * @return
     */
    int update(Sport sport);

    /**
     * 删除运动
     * @param id
     * @return
     */
    int delete(Integer id);
}
