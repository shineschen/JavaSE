package com.learn.d10_bigDecimalDemo;

import java.math.BigDecimal;

/**
 * 针对double类型数据 运算精度丢失的解决方法
 */
public class BigDecimalDemo {
    public static void main(String[] args) {

        double a = 0.1;
        double b = 0.2;
        double c = a+b;
        System.out.println(c);

        // 包装浮点型数据成为大数据对象  BigDecimal

        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(b1);    // add 加法运算

        System.out.println(c1);

        BigDecimal c2 = a1.subtract(b1);    // subtract 减法运算
        System.out.println(c2);

        BigDecimal c3 = a1.multiply(b1);   // multiply 乘法运算
        System.out.println(c3);

        BigDecimal c4 = a1.divide(b1);    // divide 除法运算
        System.out.println(c4);






    }
}
