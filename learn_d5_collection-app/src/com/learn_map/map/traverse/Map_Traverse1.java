package com.learn_map.map.traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Traverse1 {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        map.put("小优",162.5);
        map.put("小优",175.8);
        map.put("小悠",161.1);
        map.put("小柔",159.5);
        map.put("小张",181.5);

        System.out.println(map);

        // 键值对方式遍历
        Set<Map.Entry<String,Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            double value = entry.getValue();

            System.out.println(key+"》》"+value);
        }

    }

}
