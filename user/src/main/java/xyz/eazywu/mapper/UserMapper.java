package xyz.eazywu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import xyz.eazywu.entity.UserEntity;

public interface UserMapper extends BaseMapper<UserEntity> {

    /**
     * TODO 通过用户id查询做题总数
     * @param id 用户id
     * @return 做题总数
     */
    @Select("select do_total from tab_user where id=#{id}")
    Long getTotal(Long id);

}
