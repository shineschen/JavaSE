package learn_d1_file;

import java.io.File;

/**
 * File 创建对象，代表具体文件的方案
 */

public class FileDemo {
    public static void main(String[] args) {
        // 创建一个File对象,代表某个具体的文件
        File file = new File("C:\\Users\\inter\\Desktop\\my_password.txt");
        File file1 = new File("C:"+ File.separator+"Users" + File.separator + "Desktop"+ File.separator + "my_password.txt");
        File file2 = new File("C:/Users/inter/Desktop/my_password.txt");
        System.out.println(file2.length());   // 文件大小

        new File("C:/Users/inter/Desktop/aaa.txt");  // File对象可以指代一个不存在的对象

        System.out.println(file.exists());  //


        File f4 =  new File("JavaSE\\learn.txt");
        System.out.println(f4.length());
    }

}
