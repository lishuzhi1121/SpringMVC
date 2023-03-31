package com.quvideo.service.impl;

import com.quvideo.dao.UserDao;
import com.quvideo.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("User Service add...");
        userDao.add();
    }
}
