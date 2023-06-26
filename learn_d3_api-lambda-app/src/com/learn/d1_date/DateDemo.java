package com.learn.d1_date;

import java.util.Date;

/**
 * Date类处理时间，获取时间信息
 */
public class DateDemo {
    public static void main(String[] args) {
        // 创建一个Date类的对象，代表系统此刻日期时间对象

        Date d = new Date();
        System.out.println(d);

        // 获取时间毫秒值
        long time = d.getTime();
        System.out.println(time);
        // long time1 = System.currentTimeMillis();
        // System.out.println(time1);
        System.out.println("====================");

        long nowTime = System.currentTimeMillis();
        nowTime += (60*60+121)*1000;

        Date date1 = new Date(nowTime);
        System.out.println(date1);

    }
}
