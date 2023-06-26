package com.learn.d2_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat 简单日期格式化类的应用
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {

        // 日期对象
        Date d = new Date();

        // 格式化日期对象(指定最终格式化的形式)
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        System.out.println(simpleDateFormat.format(d));

        Long time = System.currentTimeMillis();
        time += (60*60)*1000;
        System.out.println(simpleDateFormat.format(time));




    }
}
