package com.learn_modifier.d10_interface_implements;

/**
 * 实现类
 */
public class PingPongMan implements SportMan{

    private String name;

    public PingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+"必须跑步锻炼~");

    }

    @Override
    public void competition() {
        System.out.println(name+"必须参加比赛~");

    }
}
