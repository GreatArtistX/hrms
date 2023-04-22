package com.xqj.entity;

import java.util.PriorityQueue;

public class EmployeeEntity {

    private Integer id;
    private String name;
    private String gender;
    private String politics;
    private Integer age;
    private String job;
    private String department;
    private Integer phone;
    private String award;

    public EmployeeEntity() {
    }

    public EmployeeEntity(Integer id, String name, String gender, String politics, Integer age, String job, String department, Integer phone, String award) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.politics = politics;
        this.age = age;
        this.job = job;
        this.department = department;
        this.phone = phone;
        this.award = award;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", politics='" + politics + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", department='" + department + '\'' +
                ", phone=" + phone +
                ", award='" + award + '\'' +
                '}';
    }
}
