package com.xqj.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.xqj.service")
@MapperScan("com.xqj.mapper")
@EnableTransactionManagement
@Import({JdbcConfig.class, MybatisConfig.class})

public class SpringConfig {
}
