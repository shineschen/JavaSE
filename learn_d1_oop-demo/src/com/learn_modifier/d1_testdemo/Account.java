package com.learn_modifier.d1_testdemo;

public class Account {
    private String userName;
    private String passWord;
    private double money;
    private String cardId;
    private double quotaMoney;

    public static int AccountsNum;

    public Account(){

    }

    public Account(String userName, String passWord, double money, String cardId, double quotaMoney) {
        this.userName = userName;
        this.passWord = passWord;
        this.money = money;
        this.cardId = cardId;
        this.quotaMoney = quotaMoney;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
