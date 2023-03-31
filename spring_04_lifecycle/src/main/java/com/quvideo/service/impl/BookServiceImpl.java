package com.quvideo.service.impl;

import com.quvideo.dao.BookDao;
import com.quvideo.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;
    public void save() {
        System.out.println("Book Service save...");
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
        System.out.println("service set...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destory...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init...");
    }
}
