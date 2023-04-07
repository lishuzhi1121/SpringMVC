package com.quvideo.controller.interceptor;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

public class HttpServletRequestReplacedFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ServletRequest requestWrapper = null;
        // 只处理POST和PUT请求
        if (servletRequest instanceof HttpServletRequest request) {
            String requestMethod = request.getMethod();
            if (requestMethod.equals("POST") || requestMethod.equals("PUT")) {
                requestWrapper = new ReHttpServletRequestWrapper(request);
            }
        }
        // 在chain.doFilter中传递新的request对象
        if (requestWrapper == null) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            filterChain.doFilter(requestWrapper, servletResponse);
        }
    }

}
