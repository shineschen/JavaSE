package com.learn_collection.collection_exception;

import java.util.Arrays;

/**
 * 可变参数
 */
public class ParamDemo {
    public static void main(String[] args) {
        // 特点
        test(); // 不传数据
        test(10); //传一个数据
        test(10,20,30); //多个数据
        test(new int[]{1,2,3,4}); //传一个数组给可变参数

    }
    // 注意事项： 一个形参列表中，只能有一个可变参数
    //           可变参数只能在形参的后面
    public static void test(int...nus){
        // 可变参数在方法内部，本质就是一个数组
        System.out.println(nus.length);
        System.out.println(Arrays.toString(nus));
        System.out.println();

    }
}
