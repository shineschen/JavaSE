package com.learn_collection.d6_collection_list;

import java.util.ArrayList;
import java.util.List;

/**
 * list集合特点以及特有方法
 */

public class ListDemo {
    public static void main(String[] args) {
        // 创建一个Arraylist对象(有序，可重复，有索引)
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println(list);//[a, b, b, c]

        //public void add(int index , E element): 在某个索引位置处插入元素
        list.add(0,"x");
        System.out.println(list);//[x, a, b, b, c]
        //public E remove(int index): 根据索引删除元素，返回被删除元素
        String a = list.remove(1);
        System.out.println(a);//a
        System.out.println(list);//[x, b, b, c]
        //public E get(int index): 返回集合中指定位置的元素
        System.out.println(list.get(0));//x
        //public E set(int index, E element): 修改指定位置的元素，修改成功后返回原来的数据
        System.out.println(list.set(0,"h"));//x
        System.out.println(list);  //[h, b, b, c]


    }
}
