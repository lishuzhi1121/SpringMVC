package com.quvideo.service.impl;

import com.quvideo.dao.BookDao;
import com.quvideo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("bookService")
@Service("bookService")
public class BookServiceImpl implements BookService {
    /**
     * 使用 @Autowired 注入对象类型,进行自动装配,它默认采用的是按类型装配,但是如果一个接口有多个实现时,按类型装配就会出现冲突,
     * 此时可以使用 @Qualifier 注解指定要装配哪一个实现, 但 @Qualifier 注解不能单独使用, 要配合 @Autowired 使用
     */
    @Autowired
//    @Qualifier("bookDao2")
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("Book Service save...");
        bookDao.save();
    }
}
