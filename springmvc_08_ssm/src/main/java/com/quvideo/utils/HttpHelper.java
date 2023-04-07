package com.quvideo.utils;

import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

public class HttpHelper {
    /**
     * 通过 request.getInputStream(); 方式获取POST或PUT请求body参数
     * @param request 请求对象
     * @return 请求body参数字符串, 非POST或PUT请求返回空字符串""
     * @throws IOException 异常信息
     */
    public static String getPostOrPutReqBody(HttpServletRequest request) throws IOException {
        String requestMethod = request.getMethod();
        if (!requestMethod.equals("POST") && !requestMethod.equals("PUT")) {
            return "";
        }
        // 获取请求body长度
        int len = request.getContentLength();
        // 定义读取请求body内容的字节数组
        byte[] bytes = new byte[len];
        ServletInputStream inputStream = request.getInputStream();
        int n;
        StringBuilder stringBuilder = new StringBuilder();
        while ((n = inputStream.read(bytes)) != -1) {
            String s = new String(bytes, 0, n);
            if (s.length() > 0) {
                stringBuilder.append(s);
            }
        }
        // 关闭输入流
        inputStream.close();
        return stringBuilder.toString();
    }
}
