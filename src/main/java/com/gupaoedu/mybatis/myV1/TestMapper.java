package com.gupaoedu.mybatis.myV1;

import com.gupaoedu.mybatis.beans.Test;

public interface TestMapper {
    Test selectByPrimaryKey(Integer userId);
}
