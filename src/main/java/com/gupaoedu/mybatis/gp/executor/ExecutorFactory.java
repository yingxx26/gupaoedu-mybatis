package com.gupaoedu.mybatis.gp.executor;

import com.gupaoedu.mybatis.gp.config.GpConfiguration;

/**
 * Created by James on 2017-07-01.
 * From 咕泡学院出品
 * 老师咨询 QQ 2904270631
 */
public class ExecutorFactory {

    private static final String SIMPLE = "simple";


    public static SimpleExecutor DEFAULT(GpConfiguration configuration) {
        return get(SIMPLE, configuration);
    }

    public static SimpleExecutor get(String key, GpConfiguration configuration) {
        if (SIMPLE.equalsIgnoreCase(key)) {
            return new SimpleExecutor(configuration);
        }
        throw new RuntimeException("no executor found");
    }

    public enum ExecutorType {
        SIMPLE
    }
}
