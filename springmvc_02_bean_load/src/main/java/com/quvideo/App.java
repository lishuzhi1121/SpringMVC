package com.quvideo;

import com.quvideo.config.SpringConfig;
import com.quvideo.controller.UserController;
import com.quvideo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(ctx.getBean(UserService.class));
        System.out.println(ctx.getBean(UserController.class));
    }
}
