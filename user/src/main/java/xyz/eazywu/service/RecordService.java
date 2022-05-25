package xyz.eazywu.service;

import xyz.eazywu.entity.Record;

import java.util.List;

public interface RecordService {
    List<Record> findByUid(Long uid);

    List<Record> getTop();
}
