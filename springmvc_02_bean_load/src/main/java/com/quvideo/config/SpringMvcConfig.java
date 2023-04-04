package com.quvideo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 3. 创建SpringMVC的配置, 加载controller对应的Bean
 */
@Configuration
@ComponentScan("com.quvideo.controller")
public class SpringMvcConfig {
}
