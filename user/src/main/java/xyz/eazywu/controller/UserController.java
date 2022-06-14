package xyz.eazywu.controller;

import org.springframework.web.bind.annotation.*;
import xyz.eazywu.common.R;
import xyz.eazywu.entity.UserEntity;
import xyz.eazywu.service.UserService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/app/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    public R login(@RequestBody UserEntity user) {
        UserEntity login = userService.login(user.getUserName(), user.getUserPwd());
        if (login == null) {
            return R.error();
        }
        return R.ok("登录成功!").put("displayName", login.getDisplayName());
    }

    @PostMapping("/register")
    public R register(@RequestBody UserEntity user) {
        Integer i = userService.register(user);
        if (i == -1) {
            return R.error();
        }
        return R.ok("注册成功!").put("rowId",i);
    }

    @PostMapping("/update")
    public R update(@RequestBody UserEntity user) {
        int i = userService.update(user);
        if (i == -1) {
            return R.error();
        }
        return R.ok("修改成功!");
    }

    @GetMapping("/getTotal/{id}")
    public R getTotal(@PathVariable("id") Long id) {
        Long total = userService.getTotal(id);
        return R.ok("获取做题总数成功!").put("total",total);
    }
}