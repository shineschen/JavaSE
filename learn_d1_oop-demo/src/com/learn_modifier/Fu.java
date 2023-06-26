package com.learn_modifier;


public class Fu {


    /**
     * 定义私有方法  只能本类中访问
     */
    private void privateMethod() {
        System.out.println("==private==");
    }

    /**
     * 缺省修饰成员方法 ：只能本类 + 同包下其他类访问 (包访问权限）
     */
    void method() {
        System.out.println("==缺省==");
    }

    /**
     * protected 修饰方法   本类 + 同包其他类 + 其他包的子类
     */

    protected void protectedMethod() {
        System.out.println("==protected==");
    }

    /**
     * public修饰   本类 + 同包其他类 + 其他包的子类 + 其他包的无关类中
     */
    public void publicMethod() {
        System.out.println("==public==");
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.privateMethod();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}

