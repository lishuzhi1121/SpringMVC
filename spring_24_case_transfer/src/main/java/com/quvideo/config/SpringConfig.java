package com.quvideo.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.quvideo")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
/**
 * 3. 开启注解式事务驱动
 */
@EnableTransactionManagement
public class SpringConfig {

}
