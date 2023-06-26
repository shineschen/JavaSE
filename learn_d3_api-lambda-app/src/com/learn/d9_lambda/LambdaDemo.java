package com.learn.d9_lambda;

/**
 * lambda标准格式 简化匿名内部类的代码形式
 * 注意 ： lambda表达式只能简化函数式接口的匿名内部类的写法形式
 * 函数式接口： 首先必须是接口，其次接口中有且仅有一个抽象方法的形式
 */
public class LambdaDemo {
    public static void main(String[] args) {
        Animal a  = new Animal() {
            @Override
            public void run() {
                System.out.println("人跑的很慢~");
            }
        };
        a.run();

//        Animal a1 = () -> {
//            System.out.println("人跑的很慢~");
//        };
//        a1.run();
    }




}


abstract class  Animal{
    public abstract void run();
}
