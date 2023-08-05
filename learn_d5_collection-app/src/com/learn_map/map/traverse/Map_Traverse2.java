package com.learn_map.map.traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 *  map集合lambda表达式遍历方式
 *  JDK8开始有
 */
public class Map_Traverse2 {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        map.put("小优",162.5);
        map.put("小优",175.8);
        map.put("小悠",161.1);
        map.put("小柔",159.5);
        map.put("小张",181.5);

//        map.forEach((k,v) ->{
//            System.out.println(k+"->"+v);
//        });

        map.forEach(new BiConsumer<String,Double>() {
            @Override
            public void accept(String s, Double aDouble) {
                System.out.println(s + "->" + aDouble);
            }
        });



    }

}
