package com.quvideo;

import com.quvideo.dao.BookDao;
import com.quvideo.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 1. 获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. 获取Bean

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        System.out.println(bookDao1);
        bookDao.save();

//        BookService bookService = (BookService) ctx.getBean("bookService2");
//        bookService.save();

    }
}
