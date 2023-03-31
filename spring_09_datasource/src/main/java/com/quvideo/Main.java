package com.quvideo;

import com.quvideo.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);

        DataSource pooledDataSource = (DataSource) ctx.getBean("pooledDataSource");
        System.out.println(pooledDataSource);

        // 加载配置文件的bean
        DataSource propertyDataSource = (DataSource) ctx.getBean("propertyDataSource");
        System.out.println(propertyDataSource);

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}