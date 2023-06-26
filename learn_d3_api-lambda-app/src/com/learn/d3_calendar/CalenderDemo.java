package com.learn.d3_calendar;

import java.util.Calendar;
import java.util.Date;

public class CalenderDemo {
    public static void main(String[] args) {

        // 此刻系统日历对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        // 获取日历信息
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        // 修改日历的某个字段信息
        calendar.set(Calendar.HOUR,13);
        System.out.println(calendar);
        // 为某个字段增加/减少指定的值
        //  往后64天后的时间
        calendar.add(Calendar.DAY_OF_YEAR,64);
        //  往后59分
        calendar.add(Calendar.MINUTE, 59);
        // public final Date getTime();  拿到此刻日期对象
        Date date = calendar.getTime();
        System.out.println(date);
        // 此刻时间毫秒值
        long time = calendar.getTimeInMillis();
        System.out.println(time);

    }
}
