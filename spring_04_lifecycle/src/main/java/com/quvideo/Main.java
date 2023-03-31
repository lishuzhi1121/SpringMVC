package com.quvideo;

import com.quvideo.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /**
         * 1. 选中一个类, 按住command点击进入该类, 然后使用 command+7 可以查看该类的所有方法和属性
         * 2. 选中一个类, 使用 control+h 可以查看该类的继承关系
         */
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 设置一个JVM关闭的钩子, 当Java虚拟机关闭时通知容器关闭
        ctx.registerShutdownHook();
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        bookDao.save();
        // 1. 使用close方法关闭容器, 让bean的destroy方法执行
//        ctx.close();
    }
}