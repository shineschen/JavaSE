package com.learn.d8_api_math;

/**
 * math工具类的使用
 */
public class MathDemo {
    public static void main(String[] args) {

        // 取绝对值
        System.out.println(Math.abs(10.1));
        System.out.println(Math.abs(-10.51));

        //向上取整
        System.out.println(Math.ceil(4.000000001));

        //向下取整
        System.out.println(Math.floor(3.99999999999));

        //求指数次方
        System.out.println(Math.pow(2,10));

        //四舍五入
        System.out.println(Math.round(3.4415926));
        System.out.println(Math.round(4.5));

        //随机数
        System.out.println(Math.random()+100);   // 范围 0.0 ~ 1.0

        //拓展   3-9之间的随机数
        int data = (int)(Math.random()*7) + 3;
        System.out.println(data);


    }
}
