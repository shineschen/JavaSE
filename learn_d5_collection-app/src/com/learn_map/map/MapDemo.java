package com.learn_map.map;

import com.sun.xml.internal.ws.api.policy.SourceModel;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Map集合的特点
 */
public class MapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>(); // 按照键 ，无序 ，不重复 ，无索引
        map.put("iphone", 3);
        map.put("sanXin", 1);
        map.put("Mui", 3);
        map.put("iphone", 6);    // 若是有重复的键添加，则会以最后一次的键为准，而其他的键会被覆盖
        map.put(null,null);

        System.out.println(map);

        Map<String, Integer> map1 = new LinkedHashMap<>();   // 有序，不重复 ，无索引
        map1.put("iphone", 3);
        map1.put("sanXin", 1);
        map1.put("Mui", 5);
        map1.put("iphone", 6);  // 若是有重复的键添加，则会以最后一次的键为准，而其他的键会被覆盖

        System.out.println(map1);

        Map<Integer, String> map2 = new TreeMap<>();  // 可排序，不重复 ，无索引
        map2.put(3, "java");
        map2.put(6, "PHP");
        map2.put(2, "python");
        map2.put(5, "go");
        map2.put(3, "Java");   // 若是有重复的键添加，则会以最后一次的键为准，而其他的键会被覆盖

        System.out.println(map2);


    }
}
