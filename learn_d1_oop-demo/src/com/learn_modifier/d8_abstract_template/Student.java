package com.learn_modifier.d8_abstract_template;

public abstract class Student {
    public final void write(){
        System.out.println("标题");
        System.out.println("前言：");
        System.out.println(writeMain());
        System.out.println("2022-02-12");
    }

    public abstract String writeMain();
}
