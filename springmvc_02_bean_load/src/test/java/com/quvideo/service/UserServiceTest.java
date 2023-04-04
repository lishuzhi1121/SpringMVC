package com.quvideo.service;

import com.quvideo.config.SpringConfig;
import com.quvideo.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testFindAll() {
        List<User> users = userService.findAll();
        System.out.println(users);
    }

    @Test
    public void testFindById() {
        User user = userService.findById(3);
        System.out.println(user);
    }


}
