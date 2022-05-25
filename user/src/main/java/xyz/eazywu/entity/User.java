package xyz.eazywu.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tab_user")
public class User {
    private Long id;
    private String userName;
    private String userPwd;
    private String displayName;
    private Long doTotal;
}
