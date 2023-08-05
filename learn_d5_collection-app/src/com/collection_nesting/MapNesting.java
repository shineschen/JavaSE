package com.collection_nesting;
/**
 * 集合嵌套
 */

import java.util.*;


public class MapNesting {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        List<String> city1 = new ArrayList<>();
        Collections.addAll(city1,"南京市","扬州市","苏州市");
        map.put("江苏省",city1);
        System.out.println(map);

        List<String> city2 = new ArrayList<>();
        Collections.addAll(city2,"武汉市","孝感市","十堰市");
        map.put("湖北省",city2);
        System.out.println(map);


        List<String> list =  map.get("湖北省");
        System.out.println(list);

    }
}
