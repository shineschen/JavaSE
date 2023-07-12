package com.learn_collection.collection_game;

/**
 * 卡牌类
 * num :牌值
 * color： 花色
 * size : 大小规则
 */
public class Card {
    private String number;
    private String color;
    private int size;

    public Card() {
    }

    public Card(String number, String color, int size) {
        this.number = number;
        this.color = color;
        this.size = size;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return number  + color;
    }
}
