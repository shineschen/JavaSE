package com.learn_collection.d8_collections;

import com.learn_collection.d7_collection_set.Artificer;

import java.util.*;

/**
 * collections 集合工具类
 */

public class CollectionsDemo {
    public static void main(String[] args) {

        //public static <T> boolean addAll(Collection <? super T> c,T...element) 为集合批量添加数据
        List<String> names = new ArrayList<>();
        names.add("1");
        names.add("3");
        names.add("2");
        names.add("7");
        names.add("6");

        Collections.addAll(names,"6","7","8");

        System.out.println(names);

        Set<Integer> ages = new HashSet<>();
        ages.add(2);
        ages.add(1);
        ages.add(4);

        Collections.addAll(ages,6,9,8);
        System.out.println(ages);



        //public static void shuffle(List<？> list) : 打乱list集合中的元素顺序  注意：set集合不需要打乱顺序
        Collections.shuffle(names);
        System.out.println(names);



        //public static <T> void sort(List<T> list) 对集合中的元素进行升序排列
        Collections.sort(names);
        System.out.println(names);

        List<Artificer> artificers = new ArrayList<>();
        artificers.add(new Artificer("小优",22,175.6));
        artificers.add(new Artificer("小藏",21,167.6));
        artificers.add(new Artificer("小王",25,179.4));

//        Collections.sort(artificers);
        System.out.println(artificers);


        //public static <T> void sort(List<T> list , Comparator<? super T> c) 对集合中的元素进行升序排列

        Collections.sort(artificers, new Comparator<Artificer>() {
            @Override
            public int compare(Artificer o1, Artificer o2) {
                return Double.compare(o1.getHeight() ,o2.getHeight());
            }
        });

        System.out.println(artificers);











    }
}
