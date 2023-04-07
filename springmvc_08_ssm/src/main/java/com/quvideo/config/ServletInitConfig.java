package com.quvideo.config;

import com.quvideo.controller.interceptor.HttpServletRequestReplacedFilter;
import jakarta.servlet.Filter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
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
     * 中文乱码处理
     */
    @Override
    protected Filter[] getServletFilters() {
        // 字符集过滤器
        CharacterEncodingFilter filter = new CharacterEncodingFilter("UTF-8");
        filter.setForceEncoding(true);
        // POST和PUT请求, 处理InputStream过滤器
        HttpServletRequestReplacedFilter requestReplacedFilter = new HttpServletRequestReplacedFilter();
        return new Filter[]{filter, requestReplacedFilter};
    }
}
