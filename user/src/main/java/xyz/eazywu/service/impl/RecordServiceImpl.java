package xyz.eazywu.service.impl;

import org.springframework.stereotype.Service;
import xyz.eazywu.entity.RecordEntity;
import xyz.eazywu.mapper.RecordMapper;
import xyz.eazywu.service.RecordService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Resource
    private RecordMapper recordMapper;

    @Override
    public List<RecordEntity> findByUid(Long id) {
        return recordMapper.findByUid(id);
    }

    @Override
    public List<RecordEntity> getTop() {
        return recordMapper.getTop();
    }
}
