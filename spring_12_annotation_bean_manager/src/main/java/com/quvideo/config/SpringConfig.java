package com.quvideo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.quvideo.dao")
@PropertySource({"jdbc.properties"})
/**
 * 在主配置文件中使用 @Import 注解导入其他多个配置类
 */
@Import({JdbcConfig.class, C3p0Config.class})
public class SpringConfig {
//    @Bean
//    public DataSource dataSource() {
//        DruidDataSource ds = new DruidDataSource();
//        ds.setDriverClassName("com.mysql.jdbc.Driver");
//        ds.setUrl("jdbc:mysql://localhost:3306/db_test");
//        ds.setUsername("tester");
//        ds.setPassword("test@123");
//        return ds;
//    }

}
