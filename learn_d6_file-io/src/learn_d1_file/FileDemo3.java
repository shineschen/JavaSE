package learn_d1_file;

import java.io.File;

/**
 * File 提供的遍历文件夹的方法
 */
public class FileDemo3 {
    public static void main(String[] args) {

        //public String[] list() :获取当前目录下所有的一级文件名称到一个字符串数组中返回
        File file = new File("D:\\Code\\JavaSE");
        String[] names = file.list();
        for (String name : names) {
            System.out.println(name);
        }

        //public File[] listFiles() :获取当前目录下所有的一级文件对象到一个文件对象数组中返回
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getAbsoluteFile());
        }

    }
}