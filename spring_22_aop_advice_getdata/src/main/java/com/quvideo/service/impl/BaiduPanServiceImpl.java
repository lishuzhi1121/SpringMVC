package com.quvideo.service.impl;

import com.quvideo.dao.BaiduPanDao;
import com.quvideo.service.BaiduPanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaiduPanServiceImpl implements BaiduPanService {
    @Autowired
    private BaiduPanDao baiduPanDao;

    @Override
    public boolean openURL(String url, String password) {
        return baiduPanDao.openURL(url, password);
    }
}
