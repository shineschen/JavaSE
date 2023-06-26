package com.learn.d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();

        // 添加元素，成功返回true
        list.add("Java");
        list.add("HTML");
        list.add("HTML");
        list.add("Mysql");
        list.add("Java");
        list.add("测试");
        System.out.println(list);

        // 清空集合的元素
//        list.clear();
//        System.out.println(list);

        // 判断集合是否为空 是则返回true 反之false
        System.out.println(list.isEmpty());

        // 获取集合的大小
        System.out.println(list.size());

        // 判断集合中是否包含某一个元素
        System.out.println(list.contains("java"));
        System.out.println(list.contains("Java"));

        // 删除某个元素；如果又多个重复元素默认删除前面的第一个
        list.remove("HTML");
        System.out.println(list);

        // 把集合转换成数组
        Object[] arrs = list.toArray();
        System.out.println(Arrays.toString(arrs));

        System.out.println("=======================");
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("小王");
        c2.add("小刘");

        //addAll 把c2集合的元素全部CV到c1的结合中去
        c1.addAll(c2);
        System.out.println(c1);

    }
}
