package com.quvideo;

import com.quvideo.config.SpringConfig;
import com.quvideo.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        System.out.println(bookDao);
        System.out.println(bookDao.getClass()); // 代理对象: class jdk.proxy2.$Proxy18
        bookDao.save();
        bookDao.update();
    }
}