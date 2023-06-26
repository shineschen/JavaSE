package com.learn.d6_regex;

import java.util.Scanner;

/**
 * 正则规则
 */

public class RegexDemo1 {
    public static void main(String[] args) {
    //以下正则只能校验单个字符
        // 只能是 a b c
        System.out.println("a".matches("[abc]"));//true
        System.out.println("z".matches("[abc]"));//false

        // 不能出现 a b c
        System.out.println("a".matches("[^abc]"));//false
        System.out.println("z".matches("[^abc]"));//true
        //  \\d 数字
        System.out.println("a".matches("\\d"));//false
        System.out.println("3".matches("\\d"));//true
        System.out.println("333".matches("\\d"));//false
        //  \\D不能是数字
        System.out.println("3".matches("\\D")); // false
        //  \\只能是英文字母，数字，下划线
        System.out.println("z".matches("\\w"));//true
        System.out.println("2".matches("\\w"));//true
        System.out.println("21".matches("\\w"));//false
        System.out.println("你".matches("\\w"));//false
        // 大写 \\W 不能是英文字母数字下划线
        System.out.println("你".matches("\\W"));//true
        //校验密码 数字，字母 下划线  至少六位
        System.out.println("456_456".matches("\\w{6,}"));
        System.out.println("45你123".matches("\\w{6,}"));
        //校验密码 必须是数字和字符 必须是4位
        System.out.println("12_F".matches("[a-zA-Z0-9]{4}"));
        System.out.println("F15z".matches("[a-zA-z0-9]{4}"));
        System.out.println("F15_".matches("[\\w&&[^_]]{4}"));


    }





}
