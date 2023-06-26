package com.learn.d4_time;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeDemo_Instant {
    public static void main(String[] args) {

        // 得到一个instant时间戳对象（国际标准）
        Instant instant = Instant.now();
        System.out.println(instant);

        // 得到系统此刻的时间戳
        Instant instant1 = Instant.now();
        System.out.println(instant1.atZone(ZoneId.systemDefault()));

        Instant instant2 = Instant.now();
        System.out.println(instant2.atZone(ZoneId.systemDefault()));

        // 返回Date对象
        Date date = Date.from(instant);
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        System.out.println(sdf.format(date));


    }
}
