package com.quvideo;

import com.quvideo.config.SpringConfig;
import com.quvideo.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
//        bookDao.save();
        bookDao.delete();
//        bookDao.update();
        bookDao.select();

    }
}