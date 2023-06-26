package com.learn.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 自定义数组排序规则
 */
public class ArraysDemo1 {
    public static void main(String[] args) {
        //Arrays的sort方法对于默认有值的数组是升序排序
        double[] score = {11.4,12.46,100,98.0,85,66,59.5};
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));

        //降序排序（自定义比较器对象，只能支持引用类型的排序）
        Integer[] ages = {34,12,55,18,6};
        /**
         * sort(参数一，参数二)
         * 参数一： 被排序的数组，必须是引用类型的参数
         * 参数二：匿名内部类对象，代表了一个比较器对象
         */
        Arrays.sort(ages, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //指定比较规则  只要左边数据大于右边数据 返回正整数，左边数据小于右边数据，返回负整数，左边数据等于右边数据返回0
//                if (o1>o2){
//                    return 1;
//                }else if (o1<o2){
//                    return -1;
//                }
//                return 0;
//                return o1 - o2;   升序
                return o2 - o1;    //降序
            }
        });
        System.out.println(Arrays.toString(ages));


        String[] names = {"123","3421","66"};
        Arrays.sort(names, (o1, o2) -> o1.length()-o2.length());
        System.out.println(Arrays.toString(names));

        char[] zm = {'a','v','c','b'};
        Arrays.sort(zm);
        System.out.println(zm);

        short[] shorts = {32767, -32768,-32766,31515};
        Arrays.sort(shorts);
        System.out.println(Arrays.toString(shorts));

        System.out.println("----------------");
        Student[] student = new Student[3];
        student[0] = new Student("小明",23,175.5);
        student[1] = new Student("小李",18,185);
        student[2] = new Student("小王",20,165.5);
        System.out.println(Arrays.toString(student));

        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

//                return o1.getAge()-o2.getAge(); //按年龄排序
                return Double.compare(o1.getHeight(),o2.getHeight());   //浮点型必须这样调
            }
        });
        System.out.println(Arrays.toString(student));

    }

}
