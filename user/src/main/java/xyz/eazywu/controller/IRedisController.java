package xyz.eazywu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.eazywu.common.R;
import xyz.eazywu.service.IRedisService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/app/rank")
public class IRedisController {
    @Resource
    private IRedisService redisService;

    @GetMapping("/get/{key}")
    public R getValue(@PathVariable("key") String key) {
        return R.ok().put("value", redisService.getValue(key));
    }
}
