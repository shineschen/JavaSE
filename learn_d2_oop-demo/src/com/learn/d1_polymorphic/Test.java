package com.learn.d1_polymorphic;

public class Test {
    public static void main(String[] args) {
        // 多态  父类类型 对象名称 = new 子类构造器（）；
//        Dog d = new Dog();
        Animal a = new Dog();    // 自动类型转换
        go(a);

//        a.lookDoor();   // 多态下不能访问子类独有功能

//        Tortoise t = new Tortoise();
        Animal t = new Tortoise();
        go(t);

    // 强类型转换
        Animal a2 = new Tortoise();
        a2.run();
        Tortoise t1 = (Tortoise) a2;
        t1.layEggs();
    }

    public static void go(Animal animal){
        System.out.println("start ...");
        animal.run();
        System.out.println("end....");

    }
}
