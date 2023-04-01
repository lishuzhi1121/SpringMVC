package com.quvideo;

import com.quvideo.config.SpringConfig;
import com.quvideo.dao.BookDao;
import com.quvideo.service.BaiduPanService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        String name = bookDao.findName(1121, "shuzhi.li@quvideo.com");
        System.out.println(name);

        BaiduPanService baiduPanService = ctx.getBean(BaiduPanService.class);
        boolean res = baiduPanService.openURL("https://pan.baidu.com/ExjdWskxcRjxjdT", "root  ");
        System.out.println(res);
    }
}