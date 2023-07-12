package com.learn_collection.d4_exception;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2_2 {
    public static void main(String[] args) {

        try {
            test1();
        } catch (Exception e) {
            System.out.println("当前操作有问题");
            e.printStackTrace();
        }

    }
    public static void test1() throws Exception, Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2021-03-31 11:59");
        System.out.println(d);
        test2();

    }

    public static void test2() throws Exception {
        // 读取文件
        InputStream is = new FileInputStream("D:/meinv.png");
    }

}
