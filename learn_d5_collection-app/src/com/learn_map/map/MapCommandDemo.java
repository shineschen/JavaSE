package com.learn_map.map;
/**
 * Map集合的常见方法
 */

import java.util.*;

public class MapCommandDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("手表",100);
        map.put("手表",220);
        map.put("手机",220);
        map.put("java",2);
        map.put(null,null);
        System.out.println(map);//map = {null=null, 手表=220, 手机=220, java=2}

        //public int size() : 获取集合的大小
        System.out.println(map.size());   // 4

        //public void clear(); 清空集合
//        map.clear();
        System.out.println(map);  //{}

        //public boolean isEmpty(); 判断集合是否为空，是则返回true
        System.out.println(map.isEmpty());   //true

        //public V get(Object key): 根据键获取对应值
        int v1 = map.get("java");
        System.out.println(v1);//2
        System.out.println(map.get("张三"));   //null

        //public V remove(Object key) ； 根据键删除整个元素（删除键会返回键的值）
        System.out.println(map.remove("手机"));   // 220
        System.out.println(map);  //{null=null, 手表=220, java=2}

        //public boolean containsKey(Object key); 判断集合中是否包含某个键, 存在则返回true
        System.out.println(map.containsKey("手表"));  //true
        System.out.println(map.containsKey("python"));  // false

        //public boolean containsValue(Object value); 判断集合中是否包含某个值 ，包含则返回true
        System.out.println(map.containsValue(2)); // true
        System.out.println(map.containsValue(1)); // false

        //public Set(K) keySet(); 获取集合的全部键   ，返回一个set集合
        Set<String> keys = map.keySet();
        System.out.println(keys);   //[null, 手表, java]

        //public Collection<V> values(); 获取map集合的全部值  返回一个Collection集合
        Collection<Integer> values = map.values();
        System.out.println(values);  // [null, 220, 2]

        //把其他map集合中的数据倒入另一个集合中
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("java1",10);
        map1.put("java2",20);

        Map<String,Integer> map2 = new HashMap<>();
        map1.put("java3",10);
        map1.put("java2",222);

        map1.putAll(map2);
        System.out.println(map1);
        System.out.println(map2);

    }
}
