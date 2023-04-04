package com.quvideo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * RESTful快速开发方式
 */

/**
 * 1. 将 @Controller 注解和 @ResponseBody 注解合二为一成 @RestController 注解
 */
@RestController
/**
 * 2. 将请求路径统一采用前缀映射
 */
@RequestMapping("/books")
public class BookController {

//    @RequestMapping(value = "/users", method = RequestMethod.POST)
//    @RequestMapping(method = RequestMethod.POST)
    /**
     * 3. 将路径映射请求方式参数改为直接注解形式
     */
    @PostMapping
    public String save() {
        System.out.println("book save...");
        return "{\"module\": \"Book Save\"}";
    }

    /**
     * 使用 @PathVariable 注解接收路径变量参数
     */
//    @RequestMapping(value = "/{id}/{name}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}/{name}")
    public String delete(@PathVariable Integer id, @PathVariable String name) {
        System.out.println("book delete..."+id+", "+name);
        return "{\"module\": \"Book Delete\", \"id\": "+id+", \"name\": "+"\""+name+"\""+"}";
    }

//    @RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public String update() {
        System.out.println("book update...");
        return "{\"module\": \"Book Update\"}";
    }

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String findAll() {
        System.out.println("book findAll...");
        return "{\"module\": \"Book FindAll\"}";
    }

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String findById(@PathVariable Integer id) {
        System.out.println("book findById..."+id);
        return "{\"module\": \"Book FindById\", \"id\": "+id+"}";
    }

//    @RequestMapping(value = "/{id}/{name}", method = RequestMethod.GET)
    @GetMapping("/{id}/{name}")
    public String findByIdAndName(@PathVariable Integer id, @PathVariable String name) {
        System.out.println("book delete..."+id+", "+name);
        return "{\"module\": \"Book FindByIdAndName\", \"id\": "+id+", \"name\": "+"\""+name+"\""+"}";
    }
}
