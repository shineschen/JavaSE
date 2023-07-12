package com.learn_collection.d7_collection_set;


import java.util.HashSet;
import java.util.Set;

public class SetDemo_artificer_1 {
    public static void main(String[] args) {

        Set<Artificer> artificers = new HashSet<>();
        Artificer a1 = new Artificer("小悠",21,175.00);
        Artificer a2 = new Artificer("小然",23,155.50);
        Artificer a3 = new Artificer("小然",23,155.50);

        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());

        artificers.add(a1);
        artificers.add(a2);
        artificers.add(a3);
        System.out.println(artificers);



    }
}
