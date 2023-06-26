package com.learn.d4_exception;

/**
 * 自定义异常，以及异常的作用
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
//        saveAge(100);

        saveName("78s56aasadddc4c43@45a");
    }

    public static void saveAge(int age)  {
        try {
            if (age>=0 && age<=150){
                System.out.println("ok~");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveName(String name){
        try {
            if (name.length()>2&&name.length()<5){
                System.out.println("ok");
            }
        }catch (Exception e){
            throw new NameIllegalRuntimeException("姓名数据长度异常！");
        }
    }


}
