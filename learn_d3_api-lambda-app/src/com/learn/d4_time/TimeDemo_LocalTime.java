package com.learn.d4_time;

import java.time.LocalTime;

public class TimeDemo_LocalTime {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println("今天时间：" + lt);

        System.out.println(lt.getHour());   // 时
        System.out.println(lt.getMinute()); // 分
        System.out.println(lt.getSecond()); // 秒

        int nano = lt.getNano(); // 纳秒
        System.out.println(nano);

        // 指定时分 / 时分秒
        System.out.println(LocalTime.of(11,10));    //时分
        System.out.println(LocalTime.of(11,10,59)); //时分秒
        System.out.println(LocalTime.of(11,11,11,1000)); // 时分秒纳秒


    }
}
