package xyz.eazywu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tab_record")
public class RecordEntity {
    private Integer id;
    /**
     * 用户id
     */
    private Integer uid;
    /**
     * 练习时间
     */
    @DateTimeFormat(pattern = "YYYY-mm-ss")
    private Date doDate;
    /**
     * 练习分数
     */
    private Integer doNumber;
    /**
     * 本次练习排名
     */
    private Integer rank;
}
