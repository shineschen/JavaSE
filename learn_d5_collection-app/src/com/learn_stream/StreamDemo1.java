package com.learn_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 获取stream流
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        // 获取list集合的Stream流
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张小白", "张小黑", "周小明", "赵刚", "张强");
        Stream<String> stream = names.stream();


        // 获取Set集合的Stream流
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "张小白", "张小黑", "周小明", "赵刚", "张强");
        Stream<String> stream1 = set.stream();
        stream1.filter(s -> s.contains("小")).forEach(s -> System.out.println(s));

        // 获取Map集合的Stream流
        Map<String, Double> map = new HashMap<>();
        map.put("古力娜扎", 176.6);
        map.put("迪丽热巴", 168.7);
        map.put("马尔扎哈", 180.6);
        map.put("卡尔扎巴", 199.6);

        Set<String> key = map.keySet();
        Stream<String> ks = key.stream();

        Collection<Double> values = map.values();
        Stream<Double> vs = values.stream();

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Stream<Map.Entry<String, Double>> kvs = entries.stream();
        kvs.filter(e -> e.getKey().contains("巴"))
                .forEach(e -> System.out.println(e.getKey() + "->" + e.getValue()));

        // 获取数组的Stream流
        String[] name = {"张小山","泰式SPA","王小山","至尊SPA"};

        Stream<String> s1 = Arrays.stream(name);
        Stream<String> s2 = Stream.of(name);
        List<String> name1 =  s1.filter(s -> s.endsWith("SPA")).collect(Collectors.toList());
        System.out.println(name1);
    }

}
