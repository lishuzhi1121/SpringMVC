package com.quvideo.service;

import com.quvideo.domain.AccountLog;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AccountLogService {
    /**
     * 写操作日志记录接口
     * 事务相关配置:
     * propagation: 设置事务传播行为, 默认为 Propagation.REQUIRED, 重点!!!
     * 相关枚举值说明: (注意所有的设置,理解时都是作用在事务协调员上的)
     * @REQUIRED(0): 默认值, 要求加入事务, 理解为: 当事务管理员开启事务T时, 则事务协调员加入事务T, 否则事务协调员开启事务T1
     * @SUPPORTS(1): 支持事务, 理解为: 当事务管理员开启事务T时, 则事务协调员加入事务T, 否则不加入事务
     * @MANDATORY(2): 必须加入事务, 理解为: 当事务管理员开启事务T时, 则事务协调员加入事务T, 否则报错Error
     * @REQUIRES_NEW(3): 要求加入新的事务, 理解为: 不管事务管理员是否开启事务T, 事务协调员都开启新的事务T1, 比较常用!!!
     * @NOT_SUPPORTED(4): 不支持事务, 理解为: 不管事务管理员是否开启事务T, 事务协调员都不开启事务
     * @NEVER(5): 不能开启事务, 理解为: 当事务管理员开启事务T时, 则事务协调员报错Error, 否则正常
     * @NESTED(6): 设置savePoint, 一旦事务回滚, 事务将回滚到savePoint处, 交由客户决定响应提交/回滚
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void log(String out, String in, Double money);
    List<AccountLog> allLogs();
}
