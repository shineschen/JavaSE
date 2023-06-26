package com.learn.d4_time;

import java.time.LocalDate;

/**
 * jdk8新增API
 * LocalDate  : 不包含具体时间的日期
 * LocalTime :  不包含日期的时间
 * LocalDateTime : 包含了日期及时间
 * Instant : 时间戳
 * DateTimeFormatter : 用于做时间的格式化和解析
 * Duration : 用于计算俩个‘时间’的间隔
 * Period : 用于计算俩个'日期'的间隔
 */
public class TimeDemo_LocalDate {
    public static void main(String[] args) {
        // 获取本地日期对象
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天的日期："+nowDate);

        int year = nowDate.getYear();
        System.out.println("year: "+ year);

        int month = nowDate.getMonthValue();
        System.out.println("Month: " + month);

        int day = nowDate.getDayOfMonth();
        System.out.println("day: " + day);

        // 当年的第几天
        int dayOfYear = nowDate.getDayOfYear();
        System.out.println("dayOfYear: " + dayOfYear);

        // 星期
        System.out.println(nowDate.getDayOfWeek());
        System.out.println(nowDate.getDayOfWeek().getValue());

        // 月份
        System.out.println(nowDate.getMonth());
        System.out.println(nowDate.getMonth().getValue());


        System.out.println("--------------------------");
        LocalDate bt = LocalDate.of(2023,06,13);
        System.out.println(bt);


    }
}
