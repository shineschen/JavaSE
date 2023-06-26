package com.learn.d4_time;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeDemoDateTimeFormat {
    public static void main(String[] args) {

        // 本地此刻 日期时间对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // 解析/格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");

        //正向格式化
        System.out.println(dtf.format(ldt));

        //逆向格式化
        System.out.println(ldt.format(dtf));

        //解析字符串时间
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dataStr = "2023-12-31 00:00:00";

        //解析当前字符串时间成为本地日期时间对象
        LocalDateTime localDateTime = LocalDateTime.parse(dataStr,dtf1);
        System.out.println(localDateTime);

    }
}
