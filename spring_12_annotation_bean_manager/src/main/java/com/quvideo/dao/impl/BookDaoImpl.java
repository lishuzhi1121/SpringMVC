package com.quvideo.dao.impl;

import com.quvideo.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Repository
//@Scope("prototype")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("Book Dao save...");
    }

    @PostConstruct
    public void init() {
        System.out.println("Book Dao init...");
    }

    @PreDestroy
    public void destory() {
        System.out.println("Book Dao destory...");
    }

}
