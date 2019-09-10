package com.idwxy.exindex.entity;

import java.util.Date;

public class User {

    // 用户 id
    private Integer id;
    // 用户姓名
    private String name;
    // 用户性别
    private Integer gender;
    // 用户年龄
    private Integer age;
    // 用户手机号
    private String phone;
    // 创建时间
    private Date createTime;
    // 用户工作
    private Integer job;
    // 用户地址
    private  String address;

    public User() {
        super();
    }

    public User(String name, Integer gender, Integer age, String phone, Date createTime, Integer job, String address) {
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.createTime = createTime;
        this.job = job;
        this.address = address;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getJob() {
        return job;
    }

    public void setJob(Integer job) {
        this.job = job;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User [id=" + id +
                ",name=" + name +
                ",gender=" + gender +
                ",age=" + age +
                ",phone=" + phone +
                ",createTime=" + createTime +
                ",job=" + job +
                ",address=" + address + "]";
    }
}
