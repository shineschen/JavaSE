package com.learn.d7_arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //Arrays常用API

        //toString  打印数组内容
        int[] arr = {10,2,55,23,24,100};
        String re = Arrays.toString(arr);
        System.out.println(re);

        //sort 排序API （默认对数组元素进行升序排序）
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //二分搜索（前提必须数组先排好序）
        int index = Arrays.binarySearch(arr,555);
        System.out.println(index);

        //二分搜索  未排序可能会找不到存在的元素 bug
        int[] arr1 = {111,2,33,5,78};
        int index1 = Arrays.binarySearch(arr1,78);
        System.out.println(index1);

    }
}
