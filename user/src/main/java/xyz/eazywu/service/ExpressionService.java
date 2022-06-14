package xyz.eazywu.service;

import xyz.eazywu.entity.ExpressionEntity;

import java.util.List;

public interface ExpressionService {
    /**
     * TODO 生成表达式
     * @return 表达式列表
     */
    public List<ExpressionEntity> getExpression();
}
