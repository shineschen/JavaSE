package com.learn.d2_polymorphc_test;

public class KeyBorad implements USB{

    private String name;

    public KeyBorad(String name) {
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
        System.out.println(name+"成功连接了电脑~");
    }

    @Override
    public void unConnect() {
        System.out.println(name+"成功断开连接~");
    }

    // 独有功能
    public void keyDown(){
        System.out.println(name+"敲击了：你好，世界");
    }
}
