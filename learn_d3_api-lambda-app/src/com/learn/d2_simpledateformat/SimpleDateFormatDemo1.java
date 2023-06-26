package com.learn.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  使用simpleDateFormat解析字符串时间成为日期对象
 */
public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        // 2023年6月12日11：11：11 往后2天14小时49分06秒后的时间
        String date = "2023年06月12日 11:11:11";

        // 把字符串时间解析成日期对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d =  simpleDateFormat.parse(date);

        // 时间往后推算
        long time = d.getTime() + (2L*24*60*60 + 14*60*60+49*60+6)*1000;
        System.out.println(simpleDateFormat.format(time));

    }
}
