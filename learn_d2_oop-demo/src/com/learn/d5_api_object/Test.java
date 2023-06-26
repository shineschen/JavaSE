package com.learn.d5_api_object;

/**
 *  object类中toString方法
 */
public class Test {
    public static void main(String[] args) {

        Student s = new Student("张三",'男',21);
        String s1 = s.toString();
        System.out.println(s1);
        System.out.println(s);

    }
}
