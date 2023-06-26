package com.learn.d2_polymorphc_test;

public class Test {
    public static void main(String[] args) {
        Computer c = new Computer("外星人");
        c.start();

        USB u = new KeyBorad("双飞燕键盘");
        c.installUSB(u);

        USB u1 = new Mouse("罗技鼠标");
        c.installUSB(u1);
    }
}
