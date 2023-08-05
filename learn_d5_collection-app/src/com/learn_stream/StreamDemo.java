package com.learn_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stream流
 */
public class StreamDemo {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        Collections.addAll(names,"泰式SPA","至尊SPA","中式推拿","舒经活络","面部SPA");
        System.out.println(names);

        List<String> list = new ArrayList<>();
        for (String name : names) {
            if (name.contains("SPA")){
                list.add(name);
            }
        }
        System.out.println(list);

        // 使用stream流
        List<String> list1 =  names.stream().filter(s -> s.endsWith("SPA")).filter(a -> a.length()==5)
                .collect(Collectors.toList());

        System.out.println(list1);
    }
}
