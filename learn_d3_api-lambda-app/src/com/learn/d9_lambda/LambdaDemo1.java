package com.learn.d9_lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        // 只能简化接口中只有一个抽象方法的匿名内部类形式
//        Swimming s1 = new Swimming() {
//            @Override
//            public void swimming() {
//                System.out.println("老师游泳很快~");
//            }
//        };
        Swimming s1 = () -> {
                System.out.println("老师游泳很快~");
            };
        go(s1);
        System.out.println("------------------");
//        go(new Swimming() {
//            @Override
//            public void swimming() {
//                System.out.println("学生不会游~");
//            }
//        });
        go(() -> System.out.println("学生不会游~"));
    }

    public static void go(Swimming s){
        System.out.println("开始~");
        s.swimming();
        System.out.println("结束~");

    }
}

@FunctionalInterface    // 一旦加上这个注解必须是函数式接口，里面只能有一个抽象方法
interface Swimming{
    void swimming();

}