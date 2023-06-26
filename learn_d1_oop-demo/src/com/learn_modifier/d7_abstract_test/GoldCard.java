package com.learn_modifier.d7_abstract_test;

public class GoldCard extends Card{
    @Override
    public void pay(double money2) {
        System.out.println("您当前消费"+money2);
        System.out.println("您的余额是："+getMoney());
        // 优惠比例计算
        double re = money2*0.8;
        System.out.println("您实际支付："+re);
        //更新账户余额
        setMoney(getMoney()-re);
        System.out.println("支付后余额："+getMoney());
    }
}
