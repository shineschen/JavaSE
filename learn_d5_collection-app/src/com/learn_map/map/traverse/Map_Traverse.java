package com.learn_map.map.traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * map集合的遍历方式 ： 键找值
 */
public class Map_Traverse {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        map.put("小优",162.5);
        map.put("小优",175.8);
        map.put("小悠",161.1);
        map.put("小柔",159.5);
        map.put("小张",181.5);

        System.out.println(map);

        // 键找值方式遍历
        Set<String> keys =  map.keySet();
        System.out.println(keys);
        for (String key : keys) {
            Double value = map.get(key);
            System.out.println(value);
        }





    }
}
