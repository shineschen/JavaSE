package com.learn.d5_api_object;

import java.lang.reflect.Type;

/**
 * object中equals方法
 */
public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",'男',21);
        Student s2 = new Student("张三",'男',21);
        System.out.println(s1.equals(s2));


        long a = 100000000000000000L;
        int b = (int) a;


    }
}
