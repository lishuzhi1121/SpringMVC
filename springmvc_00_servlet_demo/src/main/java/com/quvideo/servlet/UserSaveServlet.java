package com.quvideo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 1. pom文件中引入servlet-api, 要用jakarta.servlet-api的包, javax的包会报错
 * 2. 可以不需要WEB-INF里的web.xml文件
 * 3. 必须在pom文件中引入tomcat-servlet-api包, 才可以使用@WebServlet注解
 * 4. 重写servlet的doGet等方法时,不要调用super
 */

@WebServlet("/user/save")
public class UserSaveServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp); // 不要调用super!!!
        // 1. 获取请求参数
        String name = req.getParameter("name");
        System.out.println("Servlet save name: "+name);

        // 2. 构造响应
        resp.setContentType("text/json;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.write("{'module': 'UserSaveServlet', 'parameter': "+"'"+name+"'"+"}");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
