package com.gupaoedu.mybatis.myV1;

public interface Executor {
    <E> E query(String statement, Object parameter);
}
