package xyz.eazywu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import xyz.eazywu.entity.UserEntity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface UserMapper extends BaseMapper<UserEntity> {

    /**
     * TODO 获取今日答题记录
     * @param uid 用户id
     * @return 今日答题记录
     */
    @Select("SELECT sum(do_number) FROM tab_record r WHERE r.uid = #{uid} AND TO_DAYS(do_date) = TO_DAYS(NOW())")
    String getTodayRecord(Integer uid);

    /**
     * TODO 获取今日答题排名
     * @param uid 用户id
     * @return 今日答题排名
     */
    @Select("SELECT min(rank) FROM tab_record r WHERE r.uid = #{uid} AND TO_DAYS(do_date) = TO_DAYS(NOW())")
    String getTodayRank(Integer uid);

    /**
     * TODO 获取总答题记录
     * @param uid 用户id
     * @return 总答题记录
     */
    @Select("select do_total from tab_user where id=#{uid}")
    String getTotalRecord(Integer uid);

    /**
     * TODO 获取总答题排名
     * @param uid 用户id
     * @return 总答题排名
     */
    @Select("SELECT rowNum\n" +
            "FROM (\n" +
            "\t(SELECT @r:= @r + 1 AS rowNum,a.* \n" +
            "\tFROM (\n" +
            "\t\tSELECT *\n" +
            "\t\tFROM tab_user\n" +
            "\t\tORDER BY do_total DESC\n" +
            "\t) a,( SELECT @r:= 0 ) b) c\n" +
            ")\n" +
            "WHERE id = #{uid}")
    String getTotalRank(Integer uid);
}
