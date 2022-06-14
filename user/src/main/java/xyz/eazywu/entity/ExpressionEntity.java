package xyz.eazywu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tab_expression")
public class ExpressionEntity {
    private Integer id;
    /**
     * 表达式内容
     */
    private String content;
    /**
     * 表达式级别1、2、3，正相关
     */
    private Integer level;
}