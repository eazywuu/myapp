package xyz.eazywu.service.impl;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import xyz.eazywu.service.IRedisService;
import xyz.eazywu.utils.RedisUtil;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class RedisServiceImpl implements IRedisService {
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    private Long seconds = RedisUtil.Seconds;

    @Override
    public void setMap(String key, Map<String, Object> value) {
        redisTemplate.boundValueOps(key).set(value,seconds,TimeUnit.SECONDS);
    }

    @Override
    public void setObject(String key, Object value) {
        redisTemplate.boundValueOps(key).set(value,seconds,TimeUnit.SECONDS);
    }

    @Override
    public void setString(String key, String value) {
        stringRedisTemplate.boundValueOps(key).set(value,seconds,TimeUnit.SECONDS);
    }

    @Override
    public String getValue(String key) {
        return stringRedisTemplate.boundValueOps(key).get();
    }
}
