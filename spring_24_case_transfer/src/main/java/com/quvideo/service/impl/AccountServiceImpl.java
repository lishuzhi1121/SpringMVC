package com.quvideo.service.impl;

import com.quvideo.dao.AccountDao;
import com.quvideo.domain.Account;
import com.quvideo.service.AccountLogService;
import com.quvideo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private AccountLogService accountLogService;

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public void delete(Integer id) {
        accountDao.delete(id);
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    @Override
    public Account findByName(String name) {
        return accountDao.findByName(name);
    }

    @Override
    public void transfer(String out, String in, Double money) throws IOException {
        try {
            accountDao.outMoney(out, money);
//            int i = 1 / 0;
//            if (true) throw new IOException();
            accountDao.inMoney(in, money);
        } finally {
            accountLogService.log(out, in, money);
        }
    }
}
