package com.github.ever.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by ever on 2017/5/23.
 */
@Service
public class BgDbResource {
    public static DataSource localDbDataSource;
    public static DataSource remoteDbDataSource;

    @Resource(name = "localDataSource")
    public void setLocalDbDataSource(@Qualifier("localDataSource")DataSource dataSource) {
        BgDbResource.localDbDataSource = dataSource;
    }

//    @Resource(name = "remoteDataSource")
//    public void setRemoteDbDataSource(DataSource dataSource) {
//        BgDbResource.localDbDataSource = dataSource;
//    }
}
