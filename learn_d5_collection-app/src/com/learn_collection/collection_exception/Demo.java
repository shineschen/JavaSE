package com.learn_collection.collection_exception;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("泰式SPA");
        list.add("至尊SPA");
        list.add("中式推拿");
        list.add("面部SPA");
        list.add("固本强元");
        list.add("柔情SPA");

        System.out.println(list);  //[泰式SPA, 至尊SPA, 面部SPA, 中式推拿, 固本强元]


        // 找出集合中全部带SPA的名字，并从中删除
//         Iterator<String> it =  list.iterator();
//
//         while (it.hasNext()){
//             String name = it.next();
//             if (name.contains("SPA")){
////                 list.remove(name);    ConcurrentModificationException
//                 it.remove();        // 使用迭代器提供的remove方法
//             }
//         }
//        System.out.println(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if (name.contains("SPA")){
//                list.remove(name);
//                i--;                 // 解决ConcurrentModificationException错误
//            }
//        }
//        System.out.println(list);


//        for (String name:list){
//            if (name.contains("SPA")){
//                list.remove(name);
//            }
//        }
//        System.out.println(list);

//        list.forEach(name ->{
//            if (name.contains("SPA")){
//                list.remove(name);
//            }
//            System.out.println(list);
//        });

    }
}
