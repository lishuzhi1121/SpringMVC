package com.quvideo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 1. @ResponseBody注解表示将方法的返回值作为响应结果
 */

@Controller
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(String name) {
        System.out.println("Controller save: "+name);
        return "{'module': 'UserController', 'parameter': "+"'"+name+"'"+"}";
    }

}
