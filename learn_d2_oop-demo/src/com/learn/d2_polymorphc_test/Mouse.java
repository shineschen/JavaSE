package com.learn.d2_polymorphc_test;

public class Mouse implements USB{

    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name+"连接了~");
    }

    @Override
    public void unConnect() {
        System.out.println(name+"断开连接~");
    }

    /**
     * 独有方法
     */
    public void click(){
        System.out.println(name+"按下了左键");
    }
}
