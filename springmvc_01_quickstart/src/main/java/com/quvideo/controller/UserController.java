package com.quvideo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 2. 定义表现层controller
 * 2.1 使用 @Controller 注解定义
 */
@Controller
public class UserController {

    /**
     * 2.2. 设置当前操作的访问路径
     */
    @RequestMapping("/save")
    /**
     * 2.3 设置当前操作的返回值类型, @ResponseBody 注解表示将当前操作的返回值作为响应体直接返回
     */
    @ResponseBody
    public String save(String name) {
        System.out.println("User save: "+name);
        return "User save success: "+name;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(String name) {
        System.out.println("User delete: "+name);
        return "User delete success: "+name;
    }

}
