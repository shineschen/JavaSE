package com.learn_collection.d7_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set系列集合的特点
 */
public class SetDemo {
    public static void main(String[] args) {
        //创建一个set集合的对象
        Set<Integer> set = new HashSet<>();   // 无序 不重复  无索引
        Set<Integer> set1 = new LinkedHashSet<>();   // 有序 不重复  无索引
        Set<Integer> set2 = new TreeSet<>();   // 排序（默认升序排序） 不重复  无索引

        set.add(11);
        set.add(22);
        set.add(33);
        set.add(33);
        set.add(5);
        set.add(5);
        System.out.println(set);

        set1.add(11);
        set1.add(11);
        set1.add(22);
        set1.add(33);
        set1.add(33);
        System.out.println(set1);

        set2.add(33);
        set2.add(33);
        set2.add(22);
        set2.add(11);
        System.out.println(set2);
    }
}
