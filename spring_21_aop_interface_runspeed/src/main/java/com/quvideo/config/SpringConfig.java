package com.quvideo.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.quvideo")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {

}
