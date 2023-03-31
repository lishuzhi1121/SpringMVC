package com.quvideo.dao.impl;

import com.quvideo.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Repository 该注解和 @Component 注解意义一致,只是spring为了便于业务理解提供的名称定义区分, 类似的有:
 * @Controller - 表现层
 * @Service    - 业务层
 * @Repository - 数据层
 */
//@Component("bookDao")
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    /**
     * 使用 @Value 注解注入基本数据类型, 如果需要读取配置文件, 则:
     * 1. 在配置类(SpringConfig)中使用 @PropertySource("application.properties") 注解指定配置文件
     * 2. 使用 ${} 引用配置文件属性值
     */
    @Value("${book.id}")
    private int id;
    @Value("${book.title}")
    private String title;

//    public void setId(int id) {
//        this.id = id;
//    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    @Override
    public void save() {
        System.out.println("Book Dao save..."+id+", "+title);
    }
}
