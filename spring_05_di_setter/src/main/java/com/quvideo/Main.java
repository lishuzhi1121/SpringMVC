package com.quvideo;

import com.quvideo.dao.BookDao;
import com.quvideo.dao.UserDao;
import com.quvideo.service.BookService;
import com.quvideo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);

        UserDao userDao = (UserDao) ctx.getBean("userDao");
        System.out.println(userDao);

        BookService bookService = (BookService) ctx.getBean("bookService");
        System.out.println(bookService);
        bookService.save();

        UserService userService = (UserService) ctx.getBean("userService");
        System.out.println(userService);
        userService.add();

    }
}