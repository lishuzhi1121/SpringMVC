package com.quvideo.dao.impl;

import com.quvideo.dao.BookDao;

public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println("Book Dao save...");
    }

    public void init() {
        System.out.println("init...");
    }

    public void destory() {
        System.out.println("destory...");
    }

}
