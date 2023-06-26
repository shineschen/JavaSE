package com.learn.d4_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeDemoLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(localDateTime.getYear());//年
        System.out.println(localDateTime.getMonthValue());//月
        System.out.println(localDateTime.getDayOfMonth());//日
        System.out.println(localDateTime.getHour());//时
        System.out.println(localDateTime.getMinute());//分
        System.out.println(localDateTime.getSecond());//秒
        System.out.println(localDateTime.getNano());//纳秒

        //当年的第几天
        System.out.println(localDateTime.getDayOfYear());
        //星期
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfWeek().getValue());
        //月份
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonth().getValue());

        // 转换为日期对象
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);

        //转换为时间对象
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

    }
}
