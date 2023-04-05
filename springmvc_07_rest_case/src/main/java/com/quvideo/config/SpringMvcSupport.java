package com.quvideo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
/**
 * 设置对静态资源的访问放行
 */
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 当访问/pages/xxx时, 走/pages/目录下的文件
        /**
         * 该配置的含义是: 如果收到一个/books/pages/* 这样的请求, 则去访问/books/pages目录下的文件
         */
        registry.addResourceHandler("/books/pages/**").addResourceLocations("/books/pages/");
        registry.addResourceHandler("/books/js/**").addResourceLocations("/books/js/");
        registry.addResourceHandler("/books/css/**").addResourceLocations("/books/css/");
        registry.addResourceHandler("/books/plugins/**").addResourceLocations("/books/plugins/");
    }
}
