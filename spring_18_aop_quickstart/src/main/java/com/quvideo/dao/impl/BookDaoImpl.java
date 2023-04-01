package com.quvideo.dao.impl;

import com.quvideo.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("Book Dao save...");
    }

    @Override
    public void update() {
        System.out.println("Book Dao update...");
    }

    @Override
    public void delete(Integer id) {
        System.out.println("Book Dao delete..."+id);
    }

    @Override
    public void select(String name) {
        System.out.println("Book Dao select..."+name);
    }
}
