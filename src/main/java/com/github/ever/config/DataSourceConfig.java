package com.github.ever.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * 需测试是否能自动重连
 * Created by ever on 2017/8/27.
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "localDataSource")
    @Qualifier("localDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.local")
    @Primary
    public DataSource localDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "remoteDataSource")
    @Qualifier("remoteDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.remote")
    public DataSource remoteDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "localDsTM")
    @Qualifier("localTm")
    public DataSourceTransactionManager transactionManagerLocalDatasource() {
        DataSourceTransactionManager dsTM = new DataSourceTransactionManager(localDataSource());
        dsTM.setDefaultTimeout(30);
        return dsTM;
    }

    @Bean(name = "remoteDsTM")
    @Qualifier("remoteTm")
    public DataSourceTransactionManager transactionManagerRemoteDatasource() {
        DataSourceTransactionManager dsTM = new DataSourceTransactionManager(remoteDataSource());
        dsTM.setDefaultTimeout(30);
        return dsTM;
    }
}
