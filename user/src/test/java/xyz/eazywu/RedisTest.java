package xyz.eazywu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.eazywu.service.IRedisService;
import xyz.eazywu.service.UserService;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Resource
    private IRedisService redisService;

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        System.out.println(redisService.getValue("key1"));
    }
    
}
