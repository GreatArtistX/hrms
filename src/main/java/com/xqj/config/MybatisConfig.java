package com.xqj.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


public class MybatisConfig {


    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(@Autowired DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        // 实体层包
        sqlSessionFactoryBean.setTypeAliasesPackage("com.xqj.entity");
        return sqlSessionFactoryBean;
    }
}
