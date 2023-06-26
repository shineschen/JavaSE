package com.learn.d2_polymorphc_test;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //独有功能
    public void start(){
        System.out.println(name+"开机了~");
    }

    /**
     * 提供安装usb设备的入口
     */
    public void installUSB(USB usb){
        // 多态 usb == 鼠标 / 键盘
        usb.connect();

        // 独有功能： 先判断再强转
        if (usb instanceof KeyBorad){
            KeyBorad k = (KeyBorad) usb;
            k.keyDown();
        } else if (usb instanceof  Mouse) {
            Mouse m = (Mouse) usb;
            m.click();
        }
        usb.unConnect();
    }
}
