package com.oa.springConfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;



@Configuration
@EnableTransactionManagement
public class DruidDataSourceConfigurer {

    @Bean
    public DataSource dataSource(Environment environment) {
    	return DruidDataSourceBuilder.create().build(environment, "spring.datasource.druid.");
    }
}
 
