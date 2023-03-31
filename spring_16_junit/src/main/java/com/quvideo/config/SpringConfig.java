package com.quvideo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.quvideo")
@Import({JdbcConfig.class, MybatisConfig.class})
public class SpringConfig {

}
