package com.learn_collection.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * collection 集合体系的特点
 * collection :有序  可重复  有索引
 * Hashset : 无序  不可重复  无索引
 */

public class CollectionDemo1 {
    public static void main(String[] args) {

        Collection list = new ArrayList();
        list.add("java");
        list.add("java");
        list.add("Mybatis");
        list.add(23);
        list.add(23);
        list.add(false);
        list.add(false);
        System.out.println(list);
        Collection list1 = new HashSet();
        list1.add("java");
        list1.add("java");
        list1.add("Mybatis");
        list1.add(23);
        list1.add(23);
        list1.add(false);
        list1.add(false);
        System.out.println(list1);
        System.out.println("--------------");
        Collection<String> list2 = new ArrayList<>();
        list2.add("java");

        // 集合和泛型不支持基本数据类型，只能支持引用数据类型
        Collection<Integer> list3 = new ArrayList<>();
        list3.add(23);
        Collection<Double> list4 = new ArrayList<>();
        list4.add(23.0);


    }
}
