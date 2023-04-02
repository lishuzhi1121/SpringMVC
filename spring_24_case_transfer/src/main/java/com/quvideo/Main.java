package com.quvideo;

import com.quvideo.config.SpringConfig;
import com.quvideo.domain.Account;
import com.quvideo.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        List<Account> accounts = accountService.findAll();
        System.out.println(accounts);
    }
}