package com.quvideo.service;

import com.quvideo.domain.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void delete(String username);
    void update(User user);
    List<User> findAll();
    User findById(Integer id);

}
