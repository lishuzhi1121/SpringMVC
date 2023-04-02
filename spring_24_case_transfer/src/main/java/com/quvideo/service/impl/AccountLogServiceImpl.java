package com.quvideo.service.impl;

import com.quvideo.dao.AccountLogDao;
import com.quvideo.domain.AccountLog;
import com.quvideo.service.AccountLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountLogServiceImpl implements AccountLogService {
    @Autowired
    private AccountLogDao accountLogDao;
    @Override
    public void log(String out, String in, Double money) {
        accountLogDao.log("转账操作: "+"由"+out+"到"+in+", "+"金额: "+money);
    }

    @Override
    public List<AccountLog> allLogs() {
        return accountLogDao.findAllLogs();
    }


}
