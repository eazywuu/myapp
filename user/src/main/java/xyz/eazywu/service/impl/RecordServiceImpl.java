package xyz.eazywu.service.impl;

import org.springframework.stereotype.Service;
import xyz.eazywu.entity.Record;
import xyz.eazywu.mapper.RecordMapper;
import xyz.eazywu.service.RecordService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Resource
    private RecordMapper recordMapper;

    @Override
    public List<Record> findByUid(Long id) {
        return recordMapper.findByUid(id);
    }

    @Override
    public List<Record> getTop() {
        return null;
    }
}
