package xyz.eazywu.service.impl;

import org.springframework.stereotype.Service;
import xyz.eazywu.entity.ExpressionEntity;
import xyz.eazywu.mapper.ExpressionMapper;
import xyz.eazywu.service.ExpressionService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ExpressionServiceImpl implements ExpressionService {
    @Resource
    private ExpressionMapper expressionMapper;

    @Override
    public List<ExpressionEntity> getExpression() {
        return expressionMapper.getExpression();
    }
}
