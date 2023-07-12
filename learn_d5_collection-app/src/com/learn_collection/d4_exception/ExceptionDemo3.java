package com.learn_collection.d4_exception;

import java.util.Scanner;

/**
 * 异常处理方式：捕获异常，尝试修复
 */

public class ExceptionDemo3 {
    public static void main(String[] args) {
        // 调用一个方法，输入合适的价格返回为止
        while (true) {
            try {
                System.out.println(getMoney());
                break;
            } catch (Exception e) {
                System.out.println("请输入合法数字！");
            }
        }
    }
    public static double getMoney(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入合适的价格：");
            double money = sc.nextDouble();
            if (money>=0){
                return money;
            }
            System.out.println("输入的价格不合适~");
        }
    }
}
