package xyz.eazywu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import xyz.eazywu.entity.User;
import xyz.eazywu.mapper.UserMapper;
import xyz.eazywu.service.UserService;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.eq("user_name",username).eq("user_pwd",password);
        return userMapper.selectOne(qw);
    }

    @Override
    public int register(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int update(User user) {
        return userMapper.updateById(user);
    }

    @Override
    public Long getTotal(Long id) {
        return userMapper.getTotal(id);
    }
}
