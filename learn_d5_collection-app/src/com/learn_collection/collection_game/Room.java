package com.learn_collection.collection_game;

import sun.security.provider.ConfigFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {

    private static List<Card> newCards = new ArrayList<>();
    public Room(){

        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[]colors = {"♥","♠","♣","♦"};


        int size = 0;
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                Card card = new Card(number,color,size);
                newCards.add(card);
            }
        }
        newCards.add(new Card("","小",++size));
        newCards.add(new Card("","大",++size));
        System.out.println("新：" + newCards);
    }

    public static void start(){
        Collections.shuffle(newCards);
        System.out.println(newCards);

        List<Card> user1 = new ArrayList<>();
        List<Card> user2 = new ArrayList<>();
        List<Card> user3 = new ArrayList<>();

        for (int i = 0; i < newCards.size()-3; i++) {
            if (i%3 == 0){
                user1.add(newCards.get(i));
            }else if (i % 3 == 1){
                user2.add(newCards.get(i));
            }else if (i%3 == 2){
                user3.add(newCards.get(i));
            }

        }
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        Collections.sort(user1, Comparator.comparingInt(Card::getSize));
        Collections.sort(user2, Comparator.comparingInt(Card::getSize));
        Collections.sort(user3, Comparator.comparingInt(Card::getSize));

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }





}
