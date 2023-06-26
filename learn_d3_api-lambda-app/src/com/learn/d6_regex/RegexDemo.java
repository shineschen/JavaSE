package com.learn.d6_regex;

/**
 * 正则表达式
 */
public class RegexDemo {
    public static void main(String[] args) {
        // 校验必须全部数字 6-20位
        System.out.println(checkQQ("156"));
        System.out.println(checkQQ1("151111111"));

    }

    // 正则表达式
    public static boolean checkQQ1(String qq){
        return qq !=null && qq.matches("\\d{6,20}");
    }





    public static boolean checkQQ(String qq) {
        //判断号码长度
        if (qq == null || qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        // 判断是否全部是数字
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);
            // 判断每个字符是否都是数字
            if (ch < '0' || ch > '9') {
                return false;
            }

        }
        return true;
    }


}
