package com.learn.d6_regex;

import java.util.Scanner;

/**
 * 案例
 */
public class RegexDemo2 {
    public static void main(String[] args) {

        // 校验手机号码  、 邮箱  、 电话号码  、金额
        checkMoney();

    }

    // 手机号码格式校验
    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入手机号：");
            String phone = sc.next();
            if (phone.matches("1[3-9]\\d{9}")) {
                System.out.println("校验通过~");
                break;
            }
            System.out.println("格式不正确！请重试！");
        }
    }

    // 邮箱格式校验
    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入邮箱号码：");
            String email = sc.next();
            if (email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")) {
                System.out.println("校验通过~");
                break;
            }
            System.out.println("格式不正确！请重试！");
        }
    }

    public static void checkTel() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入电话号码：");
            String tell = sc.next();
            if (tell.matches("0\\d{1,6}-?\\d{5,10}")) {
                System.out.println("校验通过~");
                break;
            }
            System.out.println("格式不正确！请重试！");
        }
    }

    public static void checkMoney(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入金额：");
            String money = sc.next();
            if (money.matches("^[1-9]\\d{0,5}(\\.\\d{0,2})?$|^0(\\.\\d{0,2})?$")){
                System.out.println("校验通过~");
                break;
            }
            System.out.println("格式不正确！请重试！");

        }
    }


}
