package xyz.eazywu.utils;

import java.util.Calendar;

public class RedisUtil {

    public static final Long Seconds = (RedisUtil.getMiol() - System.currentTimeMillis())/1000;

    /**
     * 获取特定时间的毫秒数
     */
    private static Long getMiol() {
        Calendar ca = Calendar.getInstance();
        //失效的时间
        ca.set(Calendar.HOUR_OF_DAY, 21);
        ca.set(Calendar.MINUTE, 30);
        ca.set(Calendar.SECOND, 0);
        long fl = ca.getTimeInMillis();
        return fl;
    }
}
