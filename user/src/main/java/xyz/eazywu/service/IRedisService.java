package xyz.eazywu.service;

import java.util.Map;

public interface IRedisService {

    // 加入元素
    void setMap(String key, Map<String, Object> value);
    void setObject(String key, Object value);
    void setString(String key, String value);

    // 获取元素
    String getValue(String key);
}
