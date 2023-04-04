package com.quvideo.controller;

import com.quvideo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String save() {
        System.out.println("user save...");
        return "{'module': 'User Save'}";
    }

    /**
     * 使用 @PathVariable 注解接收路径变量参数
     */
    @RequestMapping(value = "/users/{id}/{name}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id, @PathVariable String name) {
        System.out.println("user delete..."+id+", "+name);
        return "{\"module\": \"User Delete\", \"id\": "+id+", \"name\": "+"\""+name+"\""+"}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public String update() {
        System.out.println("user update...");
        return "{'module': 'User Update'}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String findAll() {
        System.out.println("user findAll...");
        return "{'module': 'User FindAll'}";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String findById(@PathVariable Integer id) {
        System.out.println("user findById..."+id);
        return "{'module': 'User FindById', 'id': "+id+"}";
    }

    @RequestMapping(value = "/users/{id}/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String findByIdAndName(@PathVariable Integer id, @PathVariable String name) {
        System.out.println("user delete..."+id+", "+name);
        return "{\"module\": \"User FindById\", \"id\": "+id+", \"name\": "+"\""+name+"\""+"}";
    }


}
