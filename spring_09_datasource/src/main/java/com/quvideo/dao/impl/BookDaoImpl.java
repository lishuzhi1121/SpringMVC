package com.quvideo.dao.impl;

import com.quvideo.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("Book Dao save..."+name);
    }
}
