package com.learn_map.map;
/**
 * test案例
 * 80个人    4个项目
 * 统计各项目选择人数 以及选择人数最多的项目
 */

import java.util.*;

public class Map_Demo {

    public static void main(String[] args) {
        // 准备80条数据
        String[] data = {"A","B","C","D"};
        Random r = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            list.add(data[r.nextInt(data.length)]);
        }

        Map<String,Integer> map = new HashMap<>();
        // 统计每个相同元素出现的次数
        for (String s : list) {
            if (map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else {
                map.put(s,1);
            }

        }
        System.out.println(map);
        List<Integer> res = new ArrayList<>();
        res.addAll(map.values());
        Collections.sort(res);
        System.out.println(res);
        int max = res.get(res.size()-1);
        System.out.println("max选择人数：" + max);
        System.out.println("max项目：" + getKey(map,max));



    }

    public static Object getKey(Map<String,Integer> map, Integer v) {

        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext()) {

            String key = it.next();

            if (map.get(key).equals(v)){
                return key;
            }
        }
        return null;

        }



    }