package com.learn.d1_polymorphic;

public class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("dog run ~");
    }

    /**
     * 子类独有方法
     */
    public void lookDoor(){
        System.out.println("dog in lookDoor~");
    }

}
