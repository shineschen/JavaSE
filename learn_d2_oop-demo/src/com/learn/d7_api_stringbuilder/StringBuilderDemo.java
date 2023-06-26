package com.learn.d7_api_stringbuilder;

/**
 * StringBuilder 操作字符串, 以及性能好的原因
 */
public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("a");
        stringBuilder.append(1.001);
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder();
        sb.append('1').append("123").append("321");
        System.out.println(sb);


        // 反转
        StringBuilder sb1 = new StringBuilder("01230");
        System.out.println(sb1.reverse());

        // 注意需转换为string类型
        String s3 = sb1.toString();

        check(s3);

    }

    public static void check(String s){

    }
}
