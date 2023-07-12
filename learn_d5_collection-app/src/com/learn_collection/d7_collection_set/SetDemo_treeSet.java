package com.learn_collection.d7_collection_set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo_treeSet {
    public static void main(String[] args) {  //默认由小到大升序排序
        Set<Integer> set = new TreeSet<>();
        set.add(7);
        set.add(5);
        set.add(5);
        set.add(8);
        set.add(6);
//        System.out.println(set);

        // 比较器对象
//        Set<Artificer> artificers = new TreeSet<>(new Comparator<Artificer>() {
//            @Override
//            public int compare(Artificer o1, Artificer o2) {
//                return Double.compare(o1.getHeight(),o2.getHeight());
//            }
//        });
        // 简化代码
        Set<Artificer> artificers = new TreeSet<>(( o1, o2)-> Double.compare(o1.getHeight(),o2.getHeight()));
        artificers.add(new Artificer("小优",22,5.0));
        artificers.add(new Artificer("小悠",28,4.8));
        artificers.add(new Artificer("小红",25,4.7));

        System.out.println(artificers);


    }
}
