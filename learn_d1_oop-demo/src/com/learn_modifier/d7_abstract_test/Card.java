package com.learn_modifier.d7_abstract_test;

public abstract class Card {
    private String userName;
    private double money;

    /**
     * 定义一个支付方法，表示卡片可以支付
     */
    public abstract void pay(double money);

    public Card(){

    }

    public Card(String userName, double money) {
        this.userName = userName;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
