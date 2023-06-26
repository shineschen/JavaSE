package com.learn.d3_collection_traversal;

import javafx.print.Collation;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {

        Collection<String> lists = new ArrayList<>();
        lists.add("用户1");
        lists.add("用户2");
        lists.add("用户3");
        lists.add("用户4");
        System.out.println(lists);

        // 得到当前集合的迭代器对象
        Iterator<String> it =  lists.iterator();
//        String ele = it.next();
//        System.out.println(ele);
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println("---------------------");

        // 定义while循环
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }

        Collection<Integer> ages = new ArrayList<>();
        ages.add(18);
        ages.add(17);
        ages.add(21);
        ages.add(16);

        Iterator<Integer> i = ages.iterator();
        // 遍历
        while(i.hasNext()){
            int a = i.next();
            System.out.println(a);
        }
    }
}
