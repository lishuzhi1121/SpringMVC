package com.quvideo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.quvideo.dao", "com.quvideo.service"})
/**
 * 指定配置文件, 如有多个可以使用 @PropertySource({"application1.properties", "application2.properties"}),
 * 但不支持使用通配符的形式!!!
 */
@PropertySource("application.properties")
public class SpringConfig {
    
}
