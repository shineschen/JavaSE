package com.learn.d8_sort_bingarysearch;

/**
 * 二分查找
 */
public class Test1 {
    public static void main(String[] args) {

        // 定义数组
        int[] arr = {10,14,16,18,24,33,37,67,98};
        System.out.println(binArySearch(arr, 33));
        System.out.println(binArySearch1(arr,188));
    }

    /**
     * 二分查找实现
     *@param arr 排序的数组
     *@param data 要找的数据
     * @return index索引，若元素不存在，直接返回-1
     */
    public static int binArySearch(int[] arr,int data){
        // 定义左边位置和右边位置
        int left = 0;
        int right = arr.length-1;

        // 开始循环，折半查询
        while (left <= right){
            // 取中间索引
            int middleIndex = (left+right) /2 ;
            // 判断中间位置的元素和要找的元素的大小情况
            if (data>arr[middleIndex]){
                // 往右边找,左边位置更新 = 中间索引 +1
                left = middleIndex + 1;
            }else if (data<arr[middleIndex]){
                right = middleIndex -1;
            }else {
                return middleIndex;
            }
        }
        return -1;   //代表查无此元素

    }

    public static int binArySearch1(int[] arr,int data){
        // 定义左边与右边索引
        int left = 0;
        int right = arr.length-1;
        //开始循环
        while (left<=right){
            //定义中间索引
            int middleIndex = (left+right)/2;
            // 开始判断中间索引元素与data的大小
            if (data<arr[middleIndex]){
                // 往左边找，右边索引更新
                right = middleIndex - 1;
            }else if (data>arr[middleIndex]){
                left = middleIndex + 1;
            }else {
                return middleIndex;
            }
        }
        return -1;
    }
}
