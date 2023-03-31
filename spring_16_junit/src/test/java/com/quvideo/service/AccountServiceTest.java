package com.quvideo.service;

import com.quvideo.config.SpringConfig;
import com.quvideo.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("Sands");
        account.setMoney(3000.0);
        accountService.save(account);
    }
    @Test
    public void testFindAll() {
        List<Account> accounts = accountService.findAll();
        System.out.println(accounts);
    }

    @Test
    public void testFindById() {
        Account account = accountService.findById(3);
        System.out.println(account);
    }

}
