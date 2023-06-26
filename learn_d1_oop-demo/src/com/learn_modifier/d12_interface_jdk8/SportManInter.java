package com.learn_modifier.d12_interface_jdk8;

public interface SportManInter {
    /**
     * JDK8开始新增：默认方法
     * -- 必须default修饰，默认用 public修饰
     * -- 默认方法，接口不能创建对象，这个方法只能过继给实现类，由实现类的对象调用
     */
    public default void run(){
        System.out.println("pao ~~");
    }
    /**
     * 静态方法
     * -- 必须使用static修饰 默认用public 修饰
     * -- 接口的静态方法，必须接口名调用
     */
    public static void inAdd(){
        System.out.println("java源码会用到~");

    }

    /**
     * 私有方法  jdk1.9开始新增
     * -- 必须在接口内部才能被访问
     */
//    private void go(){
//
//    }
}



class PingPongMan implements SportManInter{
}

class Test{
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();
        SportManInter.inAdd();
        // PingPongMan.inAdd();
    }
}