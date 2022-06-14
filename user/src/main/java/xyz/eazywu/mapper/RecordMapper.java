package xyz.eazywu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import xyz.eazywu.entity.RecordEntity;
import xyz.eazywu.entity.UserEntity;

import java.util.List;

public interface RecordMapper extends BaseMapper<UserEntity> {

    /**
     * TODO 通过用户id查询做题记录
     * @param uid 用户id
     * @return 做题记录列表
     */
    @Select("select * from tab_record where uid = #{uid}")
    List<RecordEntity> findByUid(Long uid);

    /**
     * TODO 获取前10名做题记录
     * @return 做题记录列表
     */
    @Select("select * from tab_record order by do_number desc limit 0,10")
    List<RecordEntity> getTop();
}
