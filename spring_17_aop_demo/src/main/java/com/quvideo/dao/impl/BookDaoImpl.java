package com.quvideo.dao.impl;

import com.quvideo.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @Repository 该注解和 @Component 注解意义一致,只是spring为了便于业务理解提供的名称定义区分, 类似的有:
 * @Controller - 表现层
 * @Service    - 业务层
 * @Repository - 数据层
 */
@Repository
public class BookDaoImpl implements BookDao {


    public void save() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println("Book Dao save...");
        }
        long endTime = System.currentTimeMillis();
        long costTime = endTime - startTime;
        System.out.println("执行万次消耗时间: "+costTime+"ms");
    }

    public void delete() {
        System.out.println("Book Dao delete...");
    }

    public void update() {
        System.out.println("Book Dao update...");
    }

    public void select() {
        System.out.println("Book Dao select...");
    }
}
