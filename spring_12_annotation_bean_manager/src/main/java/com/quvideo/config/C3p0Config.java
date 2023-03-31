package com.quvideo.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

public class C3p0Config {

    @Bean("pooledDataSource")
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        try {
            ds.setDriverClass("com.mysql.jdbc.Driver");
            ds.setJdbcUrl("jdbc:mysql://localhost:3306/db_test");
            ds.setUser("tester");
            ds.setPassword("test@123");
        } catch (PropertyVetoException e) {
            throw new RuntimeException(e);
        }

        return ds;
    }
}
