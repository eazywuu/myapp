package xyz.eazywu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import xyz.eazywu.entity.ExpressionEntity;

import java.util.List;

public interface ExpressionMapper extends BaseMapper<ExpressionEntity> {
    /**
     * TODO 生成表达式
     * @return 表达式列表
     */
    @Select("select * from tab_expression")
    public List<ExpressionEntity> getExpression();
}
