package learn_d2_recuision;

import java.io.File;

/**
 * 案例 ： 删除非空文件夹
 * File 默认不可以删除非空文件夹
 * 需要遍历文件夹，先删除里面的内容，再删除自己
 */

public class RecursionDemo5 {

    public static void deleteDir(String path) {
        File file = new File(path);
        File[] list = file.listFiles();
        for (File f : list) {
            if (f.isDirectory()) {
                deleteDir(f.getAbsolutePath());
            } else {
                f.delete();
            }
        }
        file.delete();
    }



    public static void deleteFile(File file) {
        if (file == null || file.isFile() || !file.exists()) {
            return;
        }

        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                deleteFile(f);
            } else {
                f.delete();
            }
        }

        file.delete();
    }

    public static void delDir(File dir){
        if (dir == null || !dir.exists()){
            return;
        }

        if (dir.isFile()){
            dir.delete();
            return;
        }

        File[] files = dir.listFiles();
        if (files==null){
            return;
        }

        for (File file : files) {
            if (file.isFile()){
                file.delete();
            }else {
                delDir(file);
            }
        }
        dir.delete();



    }

    public static void main(String[] args) {
//        String path = "D:\\text";
//        deleteDir(path);
        File file = new File("D:\\text");
        delDir(file);
    }

}


