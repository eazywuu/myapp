package xyz.eazywu.service;

import org.apache.ibatis.annotations.Select;
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
     * TODO 获取今日答题记录
     * @param uid 用户id
     * @return 今日答题记录
     */
    String getTodayRecord(Integer uid);

    /**
     * TODO 获取今日答题排名
     * @param uid 用户id
     * @return 今日答题排名
     */
    String getTodayRank(Integer uid);

    /**
     * TODO 获取总答题记录
     * @param uid 用户id
     * @return 总答题记录
     */
    String getTotalRecord(Integer uid);

    /**
     * TODO 获取总答题排名
     * @param uid 用户id
     * @return 总答题排名
     */
    String getTotalRank(Integer uid);
}
