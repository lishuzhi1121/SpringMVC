package com.quvideo.dao.impl;

import com.quvideo.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {


    @Override
    public String findName(int id, String email) {
        System.out.println("id: "+ id + " ---- " + "email: " + email);
//        if (true) throw new NullPointerException();
        return "Sands";
    }
}
