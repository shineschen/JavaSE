package com.learn.d8_sort_bingarysearch;

import java.util.Arrays;

/**
 * 选择排序的方法对数组进行排序
 */
public class Test {
    public static void main(String[] args) {

        // 定义数组
        int[] arr = {5,1,3,2};

        // 定义循环控制选择多少轮
        for (int i = 0; i < arr.length-1; i++) {
            // i = 0     j = 1  2  3
            // i = 1     j = 2  3
            // i = 2     j = 3
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
