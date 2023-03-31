package com.quvideo.service.impl;

import com.quvideo.dao.BookDao;
//import com.quvideo.dao.impl.BookDaoImpl;
import com.quvideo.service.BookService;

public class BookServiceImpl implements BookService {
    // 1. 删除业务中使用new的方式创建的dao对象
//    private BookDao bookDao = new BookDaoImpl();
    private BookDao bookDao;
    public void save() {
        System.out.println("Book Service Save......");
        bookDao.save();
    }

    // 2. 提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
