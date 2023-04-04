package com.quvideo.controller;

import com.quvideo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 1. 响应页面
     */
    @RequestMapping("/page")
    public String toPage() {
        System.out.println("返回页面");
        return "page.jsp";
    }

    /**
     * 2. 响应纯文本
     * 注意: SpringMVC 默认你要返回的是一个页面, 如果你返回的不是一个页面, 那就需要加上 @ResponseBody 注解来说明
     */
    @RequestMapping("/text")
    @ResponseBody
    public String toText() {
        System.out.println("返回纯文本信息");
        return "response text!";
    }

    /**
     * 3. 响应POJO对象(JSON数据格式)
     */
    @RequestMapping("/pojo")
    @ResponseBody
    public User toPojo() {
        System.out.println("返回POJO对象");
        User user = new User();
        user.setId(102472);
        user.setUsername("sands");
        user.setPassword("xkdkaljfxndkasla");
        return user;
    }

    /**
     * 4. 响应POJO对象列表(JSON数据格式)
     */
    @RequestMapping("/pojoList")
    @ResponseBody
    public List<User> toPojoList() {
        System.out.println("返回POJO对象列表");
        User user1 = new User();
        user1.setId(100001);
        user1.setUsername("sands11");
        user1.setPassword("xkdkalHJsNKWIKL##@&");
        User user2 = new User();
        user2.setId(100002);
        user2.setUsername("sands22");
        user2.setPassword("SKJJDNJ@&##2xndkasla");
        User user3 = new User();
        user3.setId(100003);
        user3.setUsername("sands33");
        user3.setPassword("Sjdnkjvkaj##$&*@dknlvks");

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }


}
