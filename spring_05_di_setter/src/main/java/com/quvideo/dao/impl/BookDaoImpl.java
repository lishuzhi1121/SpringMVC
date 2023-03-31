package com.quvideo.dao.impl;

import com.quvideo.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String bookId;
    private String name;
    private int pages;

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public void save() {
        System.out.println("Book Dao save..." + bookId + ", " + name + ", " + pages);
    }

    @Override
    public String toString() {
        return "BookDaoImpl{" +
                "bookId='" + bookId + '\'' +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
