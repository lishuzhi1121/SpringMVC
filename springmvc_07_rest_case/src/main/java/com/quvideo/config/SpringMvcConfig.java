package com.quvideo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.quvideo.controller", "com.quvideo.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
