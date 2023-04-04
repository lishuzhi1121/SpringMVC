package com.quvideo.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
/**
 * 在项目开发中, 一般Spring只加载Spring的Bean, 而不加载SpringMVC的Bean,
 * 同理, SpringMVC也不加载Spring的Bean,
 * 所以在Spring的配置中, 包扫描时就得把SpringMVC的Bean给排除
 */
//@ComponentScan("com.quvideo")
/**
 * 1. 第一种方式: 指定包扫描时采用更精确的包路径, 比较常用!!!
 */
@ComponentScan({"com.quvideo.service","com.quvideo.domain"})
/**
 * 2. 第二种方式: 采用过滤规则
 * @type: 用于指定过滤规则的类型, 可以根据注解,正则,自定义等方式过滤
 * @classes: 用于指定要过滤的具体类别
 */
//@ComponentScan(value = "com.quvideo",
//        excludeFilters = @ComponentScan.Filter(
//                type = FilterType.ANNOTATION,
//                classes = Controller.class
//        )
//)
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {

}
