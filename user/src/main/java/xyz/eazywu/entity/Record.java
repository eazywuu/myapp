package xyz.eazywu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tab_record")
public class Record {
    private Long id;
    private Long uid;
    private Date doDate; // 练习时间
    private Integer doNumber; // 练习分数
    private Integer rank; // 练习排名
}
