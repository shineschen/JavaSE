package com.learn_collection.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * Collection集合的遍历方式 ： lambda表达式
 */

public class CollectionDemo3 {
    public static void main(String[] args) {

        Collection<String> names = new ArrayList<>();
        names.add("用户a");
        names.add("用户b");
        names.add("用户c");
        names.add("用户d");

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // 简化
        names.forEach((String s) -> {
                System.out.println(s);
            });
        // 再简化
        names.forEach((String s) -> System.out.println(s));

        // 最终简化
        names.forEach(System.out::println);




    }
}
