package com.quvideo.dao.impl;

import com.quvideo.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class UserDaoImpl implements UserDao {
    @Value("${user.id}")
    private int id;
    @Value("${user.username}")
    private String username;

//    public void setId(int id) {
//        this.id = id;
//    }

//    public void setUsername(String username) {
//        this.username = username;
//    }

    @Override
    public void add() {
        System.out.println("User Dao add..."+id+", "+username);
    }
}
