package com.learn_collection.d5_collection;

import java.util.ArrayList;
import java.util.HashSet;

// Collection
public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();  //有序  可重复  有索引

        arrayList.add("java1");
        arrayList.add("java2");
        arrayList.add("java1");
        arrayList.add("java2");
        System.out.println(arrayList);

        HashSet<String> set = new HashSet<>();   // 无序 不可重复 无索引
        set.add("java1");
        set.add("java2");
        set.add("java1");
        set.add("java2");
        set.add("java3");
        System.out.println(set);


    }
}
