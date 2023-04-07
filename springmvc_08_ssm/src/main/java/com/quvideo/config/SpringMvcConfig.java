package com.quvideo.config;

import com.quvideo.controller.interceptor.ProjectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@ComponentScan({"com.quvideo.controller","com.quvideo.config"})
@ComponentScan({"com.quvideo.controller"})
@EnableWebMvc
/**
 * 这个配置类实现了 WebMvcConfigurer 接口之后就不再需要使用SpringMVCSupport类去实现support接口了
 */
public class SpringMvcConfig implements WebMvcConfigurer {
    @Autowired
    private ProjectInterceptor projectInterceptor;

    /**
     * 对静态资源访问放行
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/books/pages/**").addResourceLocations("/books/pages/");
        registry.addResourceHandler("/books/js/**").addResourceLocations("/books/js/");
        registry.addResourceHandler("/books/css/**").addResourceLocations("/books/css/");
        registry.addResourceHandler("/books/plugins/**").addResourceLocations("/books/plugins/");
    }

    /**
     * 添加拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books", "/books/*");
    }

}
