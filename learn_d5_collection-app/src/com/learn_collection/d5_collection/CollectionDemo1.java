package com.learn_collection.d5_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();  //多态

        //public boolean add (E o): 添加元素 ，成功返回true
        System.out.println(c.add("str"));
        //public void clear(): 清空集合中的所有元素
        c.clear();
        System.out.println(c);
        //public boolean isEmpty(): 判断集合是否为空，是则返回true
        System.out.println(c.isEmpty());
        //public int size() : 返回集合的大小
        System.out.println(c.size());
        //public boolean contains(Object obj): 判断集合中是否包含某个元素
        System.out.println(c.contains("A"));
        //public boolean remove(E o): 删除某个元素。如果有多个重复元素，默认删除第一个元素
        System.out.println(c.remove("java"));
        //public Object[] toArray(): 把集合装换成数组
        Object[] strArr =  c.toArray();
        System.out.println(Arrays.toString(strArr));
        //转换成String数组
        String[] arr = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------");
        // 把一个集合中的数据全部倒入到另一个集合中去
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("java3");
        c2.add("java4");
        c1.addAll(c2);   // 把C2集合的全部数据 倒入到c1集合中去
        System.out.println(c1);
        System.out.println(c2);
    }
}
