package com.learn_modifier.d7_abstract_test;

public class Test {
    public static void main(String[] args) {
        // 抽象类的使用
        GoldCard goldCard = new GoldCard();
        goldCard.setUserName("张三");
        goldCard.setMoney(100);
        goldCard.pay(100);

        OrdinaryCard ordinaryCard = new OrdinaryCard();
        ordinaryCard.setUserName("李四");
        ordinaryCard.setMoney(100);
        ordinaryCard.pay(100);



    }
}
