package com.learn_collection.d4_exception;

/**
 * 自定义异常，以及异常的作用
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
//        try {
//            saveAge(151);
//            System.out.println("底层执行成功~");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("底层出现问题~");
//        }

        try {
            saveName("88");
            System.out.println("底层执行成功~");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层出现bug~");
        }
    }

    public static void saveAge(int age) {

        if (age >= 0 && age <= 150) {
            System.out.println("ok~");
        } else {
            throw new AgeIllegalRuntimeException("age数据非法~异常数据是" + age);
        }
    }


    public static void saveName(String name) {

        if (name.length() >= 2 && name.length() <= 5) {
            System.out.println("ok");
        } else {
            throw new NameIllegalRuntimeException("姓名数据非法~非法数据是" + name);
        }
    }
}

