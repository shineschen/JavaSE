package com.learn_modifier.d9_interface;

public interface InterfaceDemo {
    // 等于 public static final String USER_NAME = "null"
    String USER_NAME = null;  //  因为接口提现规范思想，默认公开 所以代码层面public static final可以省略不写




    // 抽象方法  因为接口提现规范思想，默认公开 所以代码层面public abstract 可以省略不写
    void run();   //public abstract void run();

    void eat();  //public abstract void eat();




}
