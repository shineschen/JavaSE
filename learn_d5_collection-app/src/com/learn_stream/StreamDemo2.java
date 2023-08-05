package com.learn_stream;
/**
 * stream流常见的中间方法
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {

        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores,88.5,100.0,59.5,65.5,72.5,9.5,25.0,60.0);
        List<Double> scores1 = new ArrayList<>();
        for (Double score : scores) {
            if (score>=60){
                scores1.add(score);
            }
        }
        Collections.sort(scores1);
        System.out.println(scores1);
        System.out.println("-----------------");

        // 使用Stream流 找出大于等于60的数据，升序后输出
        Stream<Double> stream = scores.stream();
        List<Double> list =  stream.filter(s -> s>=60).sorted().collect(Collectors.toList());
        System.out.println(list);

        // 找出年龄大于等于23，且年龄小于等于30的学生，按照年龄降序输出
        List<Student> students = new ArrayList<>();
        students.add(new Student("蜘蛛精",26,172.5));
        students.add(new Student("蜘蛛精",26,172.5));
        students.add(new Student("紫霞",23,167.5));
        students.add(new Student("白晶晶",25,169.4));
        students.add(new Student("牛魔王",35,182.5));
        students.add(new Student("牛夫人",32,162.8));

        for (Student student : students) {
            if (student.getAge()>=23 &&student.getAge()<=30){
                System.out.println(student);
            }
        }

        System.out.println("------------------");
        Stream<Student> stream1 = students.stream();
        stream1.filter(student -> student.getAge()>=23 && student.getAge()<=30).sorted(((o1, o2) -> o2.getAge()- o1.getAge()))
                        .forEach(student -> System.out.println(student));

        // 取出身高最高的前三名学生，并输出
        List<Double> heights = new ArrayList<>();
        for (Student student : students) {
            heights.add(student.getHeight());
        }

        Collections.sort(heights, (o1, o2) -> Double.compare(o2,o1));
        System.out.println(heights.get(0));
        System.out.println(heights.get(1));
        System.out.println(heights.get(2));

        System.out.println("-------------");
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(),o1.getHeight()))
                .limit(3).forEach(System.out::println);

        // 取出身高最矮的俩个人
        students.stream().sorted(((o1, o2) -> Double.compare(o1.getHeight(),o2.getHeight()))).limit(2).forEach(System.out::println);

        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(),o1.getHeight()))
                .skip(students.size()-2).forEach(System.out::println);

        // 找出身高超过168的学生，去除重复，在输出
        Set<Student> set = new HashSet<>();
        for (Student student : students) {
            if (student.getHeight()>168.0){
                set.add(student);
            }
        }
        System.out.println(set);
        for (Student student : set) {
            System.out.println(student.getName());
        }

        System.out.println("*********************************");
        students.stream().filter(s -> s.getHeight()>168).map(s ->s.getName()).distinct()
                .forEach(System.out::println);


        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Stream<String> stream2 = Stream.of("张三", "李四");
        Stream<String> stream3 = Stream.of("张三1", "李四2","王五");
        Stream<String> allStream = Stream.concat(stream2, stream3);
        allStream.forEach(System.out::println);

    }
}
