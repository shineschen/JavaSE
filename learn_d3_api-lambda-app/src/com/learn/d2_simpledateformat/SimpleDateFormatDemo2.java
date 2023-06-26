package com.learn.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {

        // 开始时间和结束时间
        String startTime = "2023-06-12 00:00:00";
        String endTime = "2023-06-12 00:10:00";

        // 用户操作时间
        String u1 = "2023-06-12 00:03:47";
        String u2 = "2023-06-12 00:10:11";

        // 解析时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = simpleDateFormat.parse(startTime);
        Date d2 = simpleDateFormat.parse(endTime);
        Date d3 = simpleDateFormat.parse(u1);
        Date d4 = simpleDateFormat.parse(u2);

        /**
         * after 判断是否在该时间之后
         * before 判断是否在该时间之前
         */
        if (d3.after(d1) && d3.before(d2)){
            System.out.println("成功！");
        }else {
            System.out.println("失败！");
        }

        if (d4.after(d1) && d4.before(d2)){
            System.out.println("成功！");
        }else {
            System.out.println("失败！");
        }


    }
}
