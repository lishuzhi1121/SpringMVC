package com.quvideo;

import com.quvideo.config.SpringConfig;
import com.quvideo.dao.AccountDao;
import com.quvideo.domain.Account;
import com.quvideo.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

//        // 方式一: 使用XML配置构建Mybatis
//        // 1. 创建 SqlSessionFactoryBuilder 对象
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        // 2. 加载 SqlMapConfig.xml 配置文件
//        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//        // 3. 获取 SqlSessionFactory 对象
//        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
//        // 4. 获取 SqlSession 对象
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        // 5. 执行 SqlSession 对象查询
//        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
//        Account account = accountDao.findById(2);
//        System.out.println(account);
//
//        // 6. 关闭连接, 释放资源
//        sqlSession.close();

        // 方式二: 使用spring整合Mybatis
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        List<Account> accounts = accountService.findAll();
        System.out.println(accounts);

    }
}