package com.learn_modifier.d3_final;

public class Test {
    public static void main(String[] args) {

        // final 的语法
        

    }


}

    // final修饰类 ，类不能被继承
//    class Animal {
//
//    }
//
//    final class wolf extends Animal{
//
//    }
//
//    class tt extends wolf{
//
//    }

    // final修饰方法，方法不能被重写

class  People{
    public  void  eat(){
        System.out.println("eat");
    }


}

class Student extends People{
    @Override
    public void eat() {
        super.eat();
    }
}
