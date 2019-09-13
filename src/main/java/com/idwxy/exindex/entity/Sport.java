package com.idwxy.exindex.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT)
public class Sport {

    // 主键自增 id
    private Integer id;
    // 运动名称
    private String name;
    // 运动描述
    private String description;
    // 运动每小时所耗能量
    private Integer consumeEnergy;

    public Sport () {
        super();
    }

    public Sport(String name, String description, Integer consumeEnergy) {
        super();
        this.name = name;
        this.description = description;
        this.consumeEnergy = consumeEnergy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getConsumeEnergy() {
        return consumeEnergy;
    }

    public void setConsumeEnergy(Integer consumeEnergy) {
        this.consumeEnergy = consumeEnergy;
    }

    @Override
    public String toString() {
        return "Sport [id=" + id +
                ",name=" + name +
                ",description=" + description +
                ",consumeEnergy" + consumeEnergy + "]";

    }
}
