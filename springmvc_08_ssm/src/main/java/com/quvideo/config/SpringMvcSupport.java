package com.quvideo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 对静态资源访问放行
 */
//@Configuration
//public class SpringMvcSupport extends WebMvcConfigurationSupport {
//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/books/pages/**").addResourceLocations("/books/pages/");
//        registry.addResourceHandler("/books/js/**").addResourceLocations("/books/js/");
//        registry.addResourceHandler("/books/css/**").addResourceLocations("/books/css/");
//        registry.addResourceHandler("/books/plugins/**").addResourceLocations("/books/plugins/");
//    }
//}
