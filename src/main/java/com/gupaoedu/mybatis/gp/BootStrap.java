package com.gupaoedu.mybatis.gp;

import com.gupaoedu.mybatis.beans.Test;
import com.gupaoedu.mybatis.gp.config.GpConfiguration;
import com.gupaoedu.mybatis.gp.executor.ExecutorFactory;
import com.gupaoedu.mybatis.gp.session.GpSqlSession;
import com.gupaoedu.mybatis.my.MySqlSession;
import com.gupaoedu.mybatis.my.TestMapper;

import java.io.IOException;

/**
 * Created by James on 2017-07-05.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class BootStrap {
    public static void main(String[] args) throws IOException {
        start();
    }

    private static void start() throws IOException {
        GpConfiguration configuration = new GpConfiguration();
        configuration.setScanPath("com.gupaoedu.mybatis.gp.config.mappers");
        configuration.build();
        GpSqlSession sqlSession = new GpSqlSession(configuration, ExecutorFactory.DEFAULT(configuration));
        TestMapper testMapper = sqlSession.getMapper(TestMapper.class);
        Test test = testMapper.selectByPrimaryKey(1);
        System.out.println(test);
    }
}
