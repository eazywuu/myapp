package xyz.eazywu.controller;

import org.springframework.web.bind.annotation.*;
import xyz.eazywu.common.R;
import xyz.eazywu.entity.User;
import xyz.eazywu.service.UserService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/app/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/login/{username}/{password}")
    public R login(@PathVariable("username") String username,
                   @PathVariable("password") String password) {
        User user = userService.login(username, password);
        if (user == null) {
            return R.error();
        }
        return R.ok("登录成功!").put("displayname", user.getDisplayName());
    }

    @PostMapping("/register")
    public R register(@RequestBody User user) {
        int i = userService.register(user);
        if (i == 0) {
            return R.error();
        }
        return R.ok("注册成功!");
    }

    @PostMapping("/update")
    public R update(@RequestBody User user) {
        int i = userService.update(user);
        if (i == 0) {
            return R.error();
        }
        return R.ok("修改成功!");
    }

    @GetMapping("/getTotal/{id}")
    public R getTotal(@PathVariable("id") Long id) {
        Long total = userService.getTotal(id);
        return R.ok().put("total",total);
    }
}