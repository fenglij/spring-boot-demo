package com.xpower.iot.test;

import com.xpower.iot.demo.common.redis.RedisUtil;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class RedisTest extends BaseTest {
    private static final Logger logger = LoggerFactory.getLogger(RedisTest.class);

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void RedisTest() throws Exception{
        redisUtil.set("hello", "world");
    }
}
