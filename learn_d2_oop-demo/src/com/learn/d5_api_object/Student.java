package com.learn.d5_api_object;

import java.util.Objects;

public class Student {    // extends Object
    private String name;
    private char sex;
    private int age;

    public Student(){

    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // 判断是否是同一个对象在比较
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && Objects.equals(name, student.name);
    }



    //    @Override
//    public boolean equals(Object obj) {
//        // 判断obj是不是学生类型
//        if (obj instanceof Student ){
//            Student s2 = (Student) obj;
        // 判断俩个对象的内容是否一样
//            if (this.name.equals(s2.name) &&
//                this.sex == s2.sex && this.age == s2.age){
//                return true;
//            }
//            return this.name.equals(s2.name) &&
//                this.sex == s2.sex && this.age == s2.age;
//
//        }
//        return false;
//    }
}
