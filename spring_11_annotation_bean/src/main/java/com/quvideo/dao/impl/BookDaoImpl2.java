package com.quvideo.dao.impl;

import com.quvideo.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @Repository 该注解和 @Component 注解意义一致,只是spring为了便于业务理解提供的名称定义区分, 类似的有:
 * @Controller - 表现层
 * @Service    - 业务层
 * @Repository - 数据层
 */
//@Component("bookDao")
//@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    private int id;
    private String title;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void save() {
        System.out.println("Book Dao save22222..."+id+", "+title);
    }
}
