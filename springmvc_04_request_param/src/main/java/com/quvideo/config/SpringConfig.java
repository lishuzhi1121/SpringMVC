package com.quvideo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.quvideo.service", "com.quvideo.domain"})
public class SpringConfig {
}
