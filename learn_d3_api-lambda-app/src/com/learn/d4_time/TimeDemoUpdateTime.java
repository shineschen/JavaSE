package com.learn.d4_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;

public class TimeDemoUpdateTime {
    public static void main(String[] args) {

        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);   //当前时间
        System.out.println(nowTime.minusHours(1));//一小时前
        System.out.println(nowTime.minusMinutes(1));//一分钟前
        System.out.println(nowTime.minusSeconds(1));//一秒钟前
        System.out.println(nowTime.minusNanos(1));//一纳秒前

        System.out.println(nowTime.plusHours(1));//一小时后
        System.out.println(nowTime.plusMinutes(1));//一分钟后
        System.out.println(nowTime.plusSeconds(1));//一秒钟后
        System.out.println(nowTime.plusNanos(1));//一纳秒后

        System.out.println("-----------------------");
        LocalDate myDate = LocalDate.of(2018,9,5);
        System.out.println(myDate);
        LocalTime myTime = LocalTime.of(23,59,59);
        System.out.println(myTime);
        LocalDateTime myDateTime = LocalDateTime.of(2099,9,21,23,59,59,999);
        System.out.println(myDateTime);


        System.out.println("----------------");
        LocalDate myDate1 = LocalDate.of(2018,9,6);
        LocalDate nowDate = LocalDate.now();

        System.out.println("今天是2018-9-6吗？" + nowDate.equals(myDate1));
        System.out.println(myDate1+"是在"+nowDate+"之前？"+myDate1.isBefore(nowDate));
        System.out.println(myDate1+"是在"+nowDate+"之后？"+myDate1.isAfter(nowDate));

        System.out.println("-----------------");

        LocalDate birDate = LocalDate.of(1994,6,13);
        LocalDate nowDay = LocalDate.now();
        MonthDay birMd = MonthDay.of(birDate.getMonthValue(),birDate.getDayOfMonth());
        MonthDay nowDay1 = MonthDay.from(nowDay);
        System.out.println("今天是生日吗？"+birMd.equals(nowDay1));


    }
}
