package com.idwxy.exindex.service;

import com.idwxy.exindex.common.PaginationObject;
import com.idwxy.exindex.entity.Sport;

public interface SportService {

    /**
     * 查询运动
     * @param id
     * @return
     */
    Sport getSportById(Integer id);

    /**
     * 创建运动
     * @param sport
     * @return
     */
    int insertSport(Sport sport);

    /**
     * 分页查询运动
     * @param pageNum
     * @param pageSize
     * @return
     */
    PaginationObject getAllSport(Integer pageNum, Integer pageSize);

    /**
     * 更新运动
     * @param sport
     * @return
     */
    int updateSport(Sport sport);

    /**
     * 删除运动
     * @param id
     * @return
     */
    int deleteSport(Integer id);
}
