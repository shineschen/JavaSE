package com.learn.d9_api_System;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("run~");

//        System.exit(0);   // 停掉jvm
        System.out.println("exit~");

        //计算机认为时间有起源：返回1970-1-1 00:00：00 走到此刻的毫秒值：时间毫秒值
        long time = System.currentTimeMillis();
        System.out.println(time);

        long startTime = System.currentTimeMillis();
        // 进行时间计算 : 性能分析
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println((endTime-startTime)/1000.0+"s");


        int[] arr= {10,20,30,40,50,60,70};
        int[] arr1 = new int[6];
        /**
         * public static native void arraycopy(Object src,  int  srcPos,
         *                                         Object dest, int destPos,
         *                                         int length);
         */
        System.arraycopy(arr,3,arr1,2,3);

        System.out.println(Arrays.toString(arr1));


    }
}
