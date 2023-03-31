package com.quvideo.service.impl;

import com.quvideo.dao.BookDao;
import com.quvideo.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("Book Service save...");
        bookDao.save();
    }
}
