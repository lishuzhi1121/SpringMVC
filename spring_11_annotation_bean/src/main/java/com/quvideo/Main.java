package com.quvideo;

import com.quvideo.config.SpringConfig;
import com.quvideo.service.BookService;
import com.quvideo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 使用注解开发时, 不能再使用配置文件加载容器
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 而是应该使用注解配置类加载容器
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookService bookService = ctx.getBean("bookService", BookService.class);
        System.out.println(bookService);
        bookService.save();

        UserService userService = ctx.getBean(UserService.class);
        System.out.println(userService);
        userService.add();

    }
}