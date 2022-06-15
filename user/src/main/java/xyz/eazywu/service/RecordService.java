package xyz.eazywu.service;

import xyz.eazywu.entity.RecordEntity;

import java.util.List;

public interface RecordService {
    /**
     * TODO 通过用户id获取做题记录
     * @param uid 用户id
     * @return 做题记录列表
     */
    List<RecordEntity> findByUid(Long uid);

    /**
     * TODO 获取做题数前10名记录
     * @return 前10记录列表
     */
    List<RecordEntity> getTop();

}
