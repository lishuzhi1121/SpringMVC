package com.quvideo.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * 4. 定义一个servlet容器启动的配置类, 用于加载spring的配置
 * 注意: 该配置类务必继承自 AbstractDispatcherServletInitializer, 这样Tomcat启动时才会自动加载该类
 */
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    /**
     * 用于加载SpringMVC容器的配置
     * @return SpringMVC容器
     */
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    /**
     * 用于设置哪些请求归属于SpringMVC处理, "/"表示所有请求归SpringMVC处理
     * @return String数组
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * 用于加载Spring容器的配置
     * @return Spring容器
     */
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
