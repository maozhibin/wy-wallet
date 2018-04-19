package com.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.service.RedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;


import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service(version = "1.0.0")
public class RedisServiceImpl implements RedisService {

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    public void set(String key, Object value) {
        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
        vo.set(key, value);
    }
    public Object get(String key) {
        ValueOperations<String,Object> vo = redisTemplate.opsForValue();
        return vo.get(key);
    }

    @Override
    public void set(String key, Object value, Long time) {
        try {
            redisTemplate.opsForValue().set(key, value);
            redisTemplate.expire(key, time, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(String key) {
        redisTemplate.delete(key);
    }
}