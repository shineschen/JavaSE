package com.learn.d4_time;

import java.time.LocalDateTime;
import java.time.MonthDay;

public class TimeDemoPeriod {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getDayOfWeek());

        MonthDay monthDay = MonthDay.of(11,17);
        System.out.println(monthDay);

    }
}
