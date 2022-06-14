package xyz.eazywu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.eazywu.common.R;
import xyz.eazywu.service.ExpressionService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/app/expression")
public class ExpressionController {
    @Resource
    private ExpressionService expressionService;

    @GetMapping("/get")
    public R getExpression() {
        return R.ok("获取表达式成功!").put("expression",expressionService.getExpression());
    }
}
