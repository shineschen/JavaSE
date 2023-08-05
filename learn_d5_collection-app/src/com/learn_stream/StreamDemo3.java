package com.learn_stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * stream流常见终结方法
 * 是指调用完成后，不会返回新的stream流，后续无法使用流
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("蜘蛛精",26,172.5));
        students.add(new Student("蜘蛛精",26,172.5));
        students.add(new Student("紫霞",23,167.5));
        students.add(new Student("白晶晶",25,169.4));
        students.add(new Student("牛魔王",35,182.5));
        students.add(new Student("牛夫人",32,162.8));

        // 计算出身高超过 168 的有几个人
        System.out.println(students.stream().filter(s -> s.getHeight() > 168).distinct().count());

        //找出身高最高的学生并输出
        Student s = students.stream().max(((o1, o2) -> Double.compare(o1.getHeight(),o2.getHeight()))).get();
        System.out.println(s);

        //找出身高最矮的学生并输出
        Student ss = students.stream().max(((o1, o2) -> Double.compare(o2.getHeight(),o1.getHeight()))).get();
        System.out.println(ss);


        // 找出身高超过 170的对象，并放到一个集合中返回
        // Stream流 只能收集一次
        List<Student> students1 =  students.stream().filter(s1 -> s1.getHeight()>170).collect(Collectors.toList());
        System.out.println(students1);


        // 找出身高超出170的对象，并把对象的名字和身高存入map集合
        Map<String,Double> map = students.stream().filter(a -> a.getHeight()>170)
                .distinct()  //去重复
                .collect(Collectors.toMap(a -> a.getName(), a -> a.getHeight()));
        System.out.println(map);

        Student[] arr =  students.stream().filter(a -> a.getHeight()>170).toArray(len -> new Student[len]);
        System.out.println(Arrays.toString(arr));

    }
}
