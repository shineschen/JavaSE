package com.learn.d1_polymorphic;

public class Tortoise extends Animal{
    @Override
    public void run() {
        System.out.println("乌龟跑的慢~");
    }

    public void layEggs(){
        System.out.println("乌龟在下单~");
    }
}
