package xyz.eazywu.service;

import xyz.eazywu.entity.UserEntity;

public interface UserService {

    /**
     * TODO 登录
     * @param username 用户名
     * @param password 密码
     * @return 用户实体
     */
    UserEntity login(String username, String password);

    /**
     * TODO 注册
     * @param user 用户实体
     * @return 操作的实体id
     */
    Integer register(UserEntity user);

    /**
     * TODO 修改信息
     * @param user 用户实体
     * @return 操作的实体id
     */
    Integer update(UserEntity user);

    /**
     * TODO 获取用户做题总数
     * @param id 用户id
     * @return 做题总数
     */
    Long getTotal(Long id);
}
