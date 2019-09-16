package com.idwxy.exindex.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.idwxy.exindex.common.PaginationObject;
import com.idwxy.exindex.dao.SportDao;
import com.idwxy.exindex.entity.Sport;
import com.idwxy.exindex.service.SportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SportServiceImpl implements SportService {

    @Resource
    private SportDao sportDao;

    @Override
    public Sport getSportById(Integer id) {
        Sport sport = sportDao.getById(id);
        return sport;
    }

    @Override
    public int insertSport(Sport sport) {
        int modifyId = sportDao.insert(sport);
        return modifyId;
    }

    @Override
    public PaginationObject getAllSport(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Sport> sports = sportDao.getAll();
        PageInfo<Sport> appsPageInfo = new PageInfo<>(sports);
        long total = appsPageInfo.getTotal();
        PaginationObject paginationObject = new PaginationObject(sports, pageNum, pageSize, total);
        return paginationObject;
    }

    @Override
    public int updateSport(Sport sport) {
        int modifyId = sportDao.update(sport);
        return modifyId;
    }

    @Override
    public int deleteSport(Integer id) {
        int modifyId = sportDao.delete(id);
        return modifyId;
    }
}
