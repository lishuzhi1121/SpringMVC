package com.quvideo.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {

    /**
     * <properties resource="jdbc.properties"/>
     *     <typeAliases>
     *         <package name="com.quvideo.domain"/>
     *     </typeAliases>
     *     <environments default="mysql">
     *         <environment id="mysql">
     *             <transactionManager type="JDBC"/>
     *             <dataSource type="POOLED">
     *                 <property name="driver" value="${jdbc.driver}"/>
     *                 <property name="url" value="${jdbc.url}"/>
     *                 <property name="username" value="${jdbc.username}"/>
     *                 <property name="password" value="${jdbc.password}"/>
     *             </dataSource>
     *         </environment>
     *     </environments>
     *     <mappers>
     *         <package name="com.quvideo.dao"/>
     *     </mappers>
     */

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("com.quvide.domain");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.quvideo.dao");
        return msc;
    }

}
