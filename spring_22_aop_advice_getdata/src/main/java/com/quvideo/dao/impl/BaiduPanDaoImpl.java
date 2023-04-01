package com.quvideo.dao.impl;

import com.quvideo.dao.BaiduPanDao;
import org.springframework.stereotype.Repository;

@Repository
public class BaiduPanDaoImpl implements BaiduPanDao {
    @Override
    public boolean openURL(String url, String password) {
        System.out.println("url: "+url+", "+"password: "+password+"("+password.length()+")");
        return password.equals("root");
    }
}
