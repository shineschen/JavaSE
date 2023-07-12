package com.learn_collection.d6_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");

        
        //for 循环
        for (int i = 0; i < names.size(); i++) {
            String s = names.get(i);
            System.out.println(s);
        }

        //迭代器
        Iterator<String> it =  names.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //增强for
        for (String name : names) {
            System.out.println(name);
        }

        //lambda表达式
        names.forEach(System.out::println);

    }
}
