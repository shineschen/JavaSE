package com.learn_collection.d7_collection_set;

import java.util.Objects;

public class Artificer implements Comparable<Artificer>{
    private String name;
    private int age;
    private double height;

    @Override
    public int compareTo(Artificer o) {
        return (int) (this.height-o.height);
    }

    public Artificer() {
    }

    public Artificer(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 重写

    //只要俩个对象内容一样就返回true
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artificer artificer = (Artificer) o;
        return age == artificer.age && Double.compare(artificer.height, height) == 0 && Objects.equals(name, artificer.name);
    }

    //只要俩个对象内容一样，返回的hash值是一样的
    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }

    @Override
    public String toString() {
        return "Artificer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
