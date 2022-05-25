package xyz.eazywu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.eazywu.service.IRedisService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/app/rank")
public class IRedisController {
    @Resource
    private IRedisService redisService;

    @GetMapping("/getValue/{key}")
    public String getValue(@PathVariable String key) {
        return redisService.getValue(key);
    }
}
