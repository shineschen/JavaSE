package com.learn.d7_api_stringbuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        int[] arr1 = null;
        int[] arr = {1,5,3,7,8,9,3};
        System.out.println(printArr(arr));
        System.out.println(printArr(arr1));
    }

    /**
     * 格式化输出展示数组数据
     * @param arr 整形数组
     * @return 字符串打印内容
     */

    public static String printArr(int[] arr){
        if (arr == null){
            return null;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
//            if (i != arr.length-1){
//                sb.append(arr[i]).append(",");
//            }else {
//                sb.append(arr[i]).append("]");
//            }
//            sb.append(arr[i]).append(i==arr.length-1?"]":",");    // 如果数组内容为 {} 会留下隐患 返回 "["
            sb.append(arr[i]).append(i==arr.length-1?"":",");
        }
        sb.append("]");

        return sb.toString();




    }
}
