package com.example.config.autoconfig;

import com.example.config.ConditionalMyOnClass;
import com.example.config.EnableMyConfigrationProperties;
import com.example.config.MyAutoConfiguration;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.sql.Driver;

/**
 * DataSourceConfig.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.06.29
 */
@MyAutoConfiguration
@ConditionalMyOnClass("org.springframework.jdbc.core.JdbcOperations")
@EnableMyConfigrationProperties(MyDataSourceProperties.class)
public class DataSourceConfig {

    @Bean
    @ConditionalMyOnClass("com.zaxxer.hikari.HikariDataSource")
    @ConditionalOnMissingBean
    DataSource hikariDataSource(MyDataSourceProperties myDataSourceProperties) throws ClassNotFoundException {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(myDataSourceProperties.getDriverClassName());
        dataSource.setJdbcUrl(myDataSourceProperties.getUrl());
        dataSource.setUsername(myDataSourceProperties.getUsername());
        dataSource.setPassword(myDataSourceProperties.getPassword());

        return dataSource;
    }

    @Bean
    @ConditionalOnMissingBean
    DataSource dataSource(MyDataSourceProperties myDataSourceProperties) throws ClassNotFoundException {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass((Class<? extends Driver>) Class.forName(myDataSourceProperties.getDriverClassName()));
        dataSource.setUrl(myDataSourceProperties.getUrl());
        dataSource.setUsername(myDataSourceProperties.getUsername());
        dataSource.setPassword(myDataSourceProperties.getPassword());

        return dataSource;
    }


}
