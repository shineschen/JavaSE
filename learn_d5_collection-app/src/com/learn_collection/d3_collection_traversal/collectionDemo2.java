package com.learn_collection.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;

public class collectionDemo2 {
    public static void main(String[] args) {

        Collection<String> lists = new ArrayList<>();
        lists.add("小张");
        lists.add("小王");
        lists.add("小李");
        lists.add("小陈");
        lists.add("小刘");

        System.out.println(lists);

        for (String name:lists){
            System.out.println(name);
        }

        String[] names = {"a","b","c","d"};
        for (String name:names){
            System.out.println(name);
        }



    }
}
