package xyz.eazywu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.eazywu.common.R;
import xyz.eazywu.entity.RecordEntity;
import xyz.eazywu.service.RecordService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/app/record")
public class RecordController {
    @Resource
    private RecordService recordService;

    @GetMapping("/findByUid/{uid}")
    public R findByUid(@PathVariable("uid") Long uid) {
        List<RecordEntity> records = recordService.findByUid(uid);
        if (records == null) {
            return R.error();
        }
        return R.ok("查找成功!").put("records",records);
    }

    @GetMapping("/getTop")
    public R getTop() {
        return R.ok("查找成功!").put("top",recordService.getTop());
    }

}
