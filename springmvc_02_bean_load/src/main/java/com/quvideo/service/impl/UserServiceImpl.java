package com.quvideo.service.impl;

import com.quvideo.domain.User;
import com.quvideo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private User user;
    @Override
    public void add(User user) {
        System.out.println("User Service add...");
    }

    @Override
    public void delete(String username) {
        System.out.println("User Service delete...");
    }

    @Override
    public void update(User user) {
        System.out.println("User Service update...");
    }

    @Override
    public List<User> findAll() {
        System.out.println("User Service findAll...");
        User user1 = new User();
        return null;
    }

    @Override
    public User findById(Integer id) {
        System.out.println("User Service findById...");
        return null;
    }
}
