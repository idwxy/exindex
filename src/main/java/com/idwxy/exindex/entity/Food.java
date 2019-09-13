package com.idwxy.exindex.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT)
public class Food {

    // 主键自增 id
    private Integer id;
    // 食物名称
    private String name;
    // 食物描述
    private String description;
    // 食物每 500g 所含能量
    private Integer foodEnergy;

    public Food() {
        super();
    }

    public Food(String name, String description, Integer foodEnergy) {
        super();
        this.name = name;
        this.description = description;
        this.foodEnergy = foodEnergy;
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

    public Integer getFoodEnergy() {
        return foodEnergy;
    }

    public void setFoodEnergy(Integer foodEnergy) {
        this.foodEnergy = foodEnergy;
    }

    @Override
    public String toString() {
        return "Food [id=" + id +
                ",name=" + name +
                ",description=" + description +
                ",foodEnergy=" + foodEnergy + "]";
    }
}
