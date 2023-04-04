package com.quvideo.config;

import jakarta.servlet.Filter;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * 4. 定义一个servlet容器启动的配置类, 用于加载spring的配置
 * 注意: 该配置类继承自 AbstractDispatcherServletInitializer, 这样Tomcat启动时才会自动加载该类
 */

public  class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    /**
     * 设置字符过滤器, 处理POST请求接收中文参数乱码问题
     */
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter("utf-8");
        return new Filter[]{filter};
    }
}


/*
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    */
/**
     * 用于加载SpringMVC容器的配置
     * @return SpringMVC容器
     *//*

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    */
/**
     * 用于设置哪些请求归属于SpringMVC处理, "/"表示所有请求归SpringMVC处理
     * @return String数组
     *//*

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    */
/**
     * 用于加载Spring容器的配置
     * @return Spring容器
     *//*

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        // 加载Spring的配置
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringConfig.class);
        return ctx;
    }
}
*/



