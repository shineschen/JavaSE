package com.learn.d5_integer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        int a = 10;
        Integer b = 11;

        Integer a1 = a;    // 基础数据赋值给引用对象类型 > 自动装箱
        int b1 = b;        // 自动拆箱

//      int age = null;
        Integer age = null;   //容错率高
        Integer age1 = 0;

        System.out.println("----------");
        // 包装类可以把基本类型的数据转换成字符串形式
        Integer i3 = 23;
        String rs = i3.toString();
        System.out.println(rs+1);   // 231

        String res = Integer.toString(i3);
        System.out.println(res+2); // 232

        System.out.println("----常用api-------");
        String number = "23";
        int age3 = Integer.parseInt(number);   //字符串转换为整数
        System.out.println(age3);
        double score = Double.parseDouble(number);
        System.out.println(score);




    }
}
