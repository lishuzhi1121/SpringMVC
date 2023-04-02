package com.quvideo.service;

import com.quvideo.domain.Account;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

public interface AccountService {
    void save(Account account);
    void delete(Integer id);
    void update(Account account);
    List<Account> findAll();
    Account findById(Integer id);
    Account findByName(String name);

    /**
     * 转账操作接口
     * @param out 转出方账户名
     * @param in 转入方账户名
     * @param money 转账金额
     */
    /**
     * 1. 接口开启Spring事务管理, 一般加在接口上, 而不是实现类上
     * 事务相关配置:
     *  1. readOnly: 设置是否为只读事务, 默认为false
     *  2. timeout: 设置事务超时时间, 默认为 -1 用不超时
     *  3. rollbackFor: 设置事务回滚异常类型(class), 例如: rollbackFor={IOException.class},
     *      注意: Spring事务默认只对运行时异常(RuntimeException,比如NullPointerException)和错误异常(Error系列的,比如内存溢出等)进行回滚
     *  4. rollbackForClassName: 同上, 设置事务回滚异常(String), 格式为异常名称字符串
     *  5. noRollbackFor: 设置事务不回滚异常(class)
     *  6. noRollbackForClassName: 同上
     *  7. propagation: 设置事务传播行为, 默认为 Propagation.REQUIRED, 重点!!!
     */
    @Transactional(rollbackFor = {IOException.class}, propagation = Propagation.REQUIRED)
    void transfer(String out, String in, Double money) throws IOException;
}
