package com.quvideo;

import com.quvideo.config.SpringConfig;
import com.quvideo.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        BookDao bookDao = ctx.getBean(BookDao.class);
//        System.out.println(bookDao);
//        bookDao.save();
//
//        BookDao bookDao1 = ctx.getBean(BookDao.class);
//        System.out.println(bookDao1);
//        bookDao1.save();

        // 管理第三方bean
        DataSource druidDataSource = (DataSource) ctx.getBean("druidDataSource");
//        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(druidDataSource);

        DataSource pooledDataSource = (DataSource) ctx.getBean("pooledDataSource");
        System.out.println(pooledDataSource);


        ctx.close();
    }
}