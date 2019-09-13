package com.idwxy.exindex.entity;

import java.util.Date;

// 某日用户消耗、摄入能量情况
public class EnergyDate {

    // 用户摄入能量或消耗能量
    private Integer energy;

    // 日期
    private Date collectDate;

    public EnergyDate() {
        super();
    }

    public EnergyDate(Integer energy, Date collectDate) {
        super();
        this.energy = energy;
        this.collectDate = collectDate;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Date getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Date collectDate) {
        this.collectDate = collectDate;
    }

    @Override
    public String toString() {
        return "EnergyDate [energy=" + energy +
                ",collectDate=" + collectDate + "]";
    }
}
