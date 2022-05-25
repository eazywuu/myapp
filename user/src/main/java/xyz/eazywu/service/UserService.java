package xyz.eazywu.service;

import xyz.eazywu.entity.User;

public interface UserService {

    User login(String username,String password);

    int register(User user);

    int update(User user);

    Long getTotal(Long id);
}
