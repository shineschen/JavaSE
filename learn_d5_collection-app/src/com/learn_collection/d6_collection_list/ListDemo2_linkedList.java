package com.learn_collection.d6_collection_list;

import java.util.LinkedList;

/**
 * LinkedList集合使用
 */
public class ListDemo2_linkedList {
    public static void main(String[] args) {
        // 创建一个队列 (先进先出)
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addLast("1");
        linkedList.addLast("2");
        linkedList.addLast("3");
        linkedList.addLast("4");

        System.out.println(linkedList);

        System.out.println(linkedList.pop());   // 等于 removeFirst();
        System.out.println(linkedList);

        System.out.println("-----------");


        // 创建一个栈 （先进后出）
        LinkedList<String> stack = new LinkedList<>();
        // 压/进栈
        stack.push("1");
        stack.push("2");
        stack.addFirst("3");
        stack.addFirst("4");
        System.out.println(stack); //[4, 3, 2, 1]

        // 弹/出栈
        System.out.println(stack.removeFirst()); //4
        System.out.println(stack.pop()); //3
        System.out.println(stack);   //[2, 1]


    }
}
