package com.learn_collection.d4_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            test1();
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("时间解析异常");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件资源不存在异常");

        }

    }
    public static void test1() throws ParseException, FileNotFoundException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2021-03-31 11:59:00");
        System.out.println(d);
        test2();

    }

    public static void test2() throws FileNotFoundException {
        // 读取文件
        InputStream is = new FileInputStream("D:/meinv.png");
    }

}
