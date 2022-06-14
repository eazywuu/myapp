package xyz.eazywu.service;

import java.util.Map;

public interface IRedisService {

    /**
     * TODO 添加元素
     * @param key String类型
     * @param value Map类型
     */
    void setMap(String key, Map<String, Object> value);
    /**
     * TODO 添加元素
     * @param key String类型
     * @param value Object类型
     */
    void setObject(String key, Object value);
    /**
     * TODO 添加元素
     * @param key String类型
     * @param value String类型
     */
    void setString(String key, String value);

    /**
     * TODO 获取元素
     * @param key String类型
     * @return String类型
     */
    String getValue(String key);
}
