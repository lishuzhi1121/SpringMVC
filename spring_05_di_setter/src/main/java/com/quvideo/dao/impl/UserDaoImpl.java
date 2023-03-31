package com.quvideo.dao.impl;

import com.quvideo.dao.UserDao;

import java.util.Arrays;
import java.util.Map;

public class UserDaoImpl implements UserDao {
    private int id;
    private String username;
    private String password;
    private int age;
    private String phone;
    private String[] favorites;
    private Map schedules;

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFavorites(String[] favorites) {
        this.favorites = favorites;
    }

    public void setSchedules(Map schedules) {
        this.schedules = schedules;
    }

    @Override
    public void add() {
        System.out.println("User Dao add..."+favorites.length);
    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", favorites=" + Arrays.toString(favorites) +
                ", schedules=" + schedules +
                '}';
    }
}
