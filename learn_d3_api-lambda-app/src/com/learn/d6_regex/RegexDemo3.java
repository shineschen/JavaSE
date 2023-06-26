package com.learn.d6_regex;

/**
 * 正则分割替换
 */
public class RegexDemo3 {
    public static void main(String[] args) {
        String name = "悠然到家dada45643商户";
        String[] arrs =  name.split("\\w+");
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }

        // 替换
        String names =  name.replaceAll("\\w+","  ");
        System.out.println(names);
    }
}
