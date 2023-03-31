package com.quvideo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.quvideo.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    /**
     * 第三方Bean的依赖注入
     * 1. 基本数据类型: 采用类的成员变量方式注入, 读取配置时,同理采用 @Value 注解方式
     */
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUserName;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    /**
     * 第三方Bean的依赖注入
     * 2. 对象类型: 采用方法形参进入自动装配, 只需要将需要注入的对象定义为方法参数即可
     */

    @Bean("druidDataSource")
    public DataSource dataSource(BookDao bookDao) {
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(jdbcDriver);
        ds.setUrl(jdbcUrl);
        ds.setUsername(jdbcUserName);
        ds.setPassword(jdbcPassword);
        return ds;
    }
}
