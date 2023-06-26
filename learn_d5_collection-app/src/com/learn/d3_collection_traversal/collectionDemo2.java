package com.learn.d3_collection_traversal;

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

        for (String ele:lists){
            System.out.println(ele);
        }



    }
}
