package xyz.eazywu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import xyz.eazywu.entity.UserEntity;
import xyz.eazywu.mapper.UserMapper;
import xyz.eazywu.service.UserService;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public UserEntity login(String username, String password) {
        QueryWrapper<UserEntity> qw = new QueryWrapper<>();
        qw.eq("user_name",username).eq("user_pwd",password);
        return userMapper.selectOne(qw);
    }

    @Override
    public Integer register(UserEntity user) {
        QueryWrapper<UserEntity> qw = new QueryWrapper<>();
        qw.eq("user_name",user.getUserName());
        if(userMapper.selectOne(qw) == null) {
            return userMapper.insert(user);
        }
        return -1;
    }

    @Override
    public Integer update(UserEntity user) {
        return userMapper.updateById(user);
    }

    @Override
    public String getTodayRecord(Integer uid) {
        return userMapper.getTodayRecord(uid);
    }

    @Override
    public String getTodayRank(Integer uid) {
        return userMapper.getTodayRank(uid);
    }

    @Override
    public String getTotalRecord(Integer uid) {
        return userMapper.getTotalRecord(uid);
    }

    @Override
    public String getTotalRank(Integer uid) {
        return userMapper.getTotalRank(uid);
    }
}
