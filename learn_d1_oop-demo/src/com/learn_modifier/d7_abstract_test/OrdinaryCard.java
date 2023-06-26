package com.learn_modifier.d7_abstract_test;

public class OrdinaryCard extends Card{
    @Override
    public void pay(double money) {
        System.out.println("您当前消费"+money);
        System.out.println("您的余额是"+getMoney());
        double rs = money*0.85;
        System.out.println("您实际支付："+rs);
        setMoney(getMoney()-rs);
        System.out.println("您的余额是："+getMoney());


    }
}
