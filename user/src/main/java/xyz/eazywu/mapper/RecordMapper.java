package xyz.eazywu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import xyz.eazywu.entity.Record;
import xyz.eazywu.entity.User;

import java.util.List;

public interface RecordMapper extends BaseMapper<User> {

    @Select("select * from tab_record where uid = #{uid}")
    List<Record> findByUid(Long uid);



}
