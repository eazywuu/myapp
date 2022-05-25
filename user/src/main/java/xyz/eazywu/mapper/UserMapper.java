package xyz.eazywu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import xyz.eazywu.entity.User;

public interface UserMapper extends BaseMapper<User> {

    @Select("select do_total from tab_user where id=#{id}")
    Long getTotal(Long id);

}
