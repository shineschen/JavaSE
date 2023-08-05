package learn_d1_file;
/**
 * File创建和删除文件方法
 */

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class FileDemo2 {
    public static void main(String[] args) throws Exception {
        //public boolean createNewFile() : 创建一个新文件（内容为空），成功返回true
        File f = new File("D:/code/JavaSE/learn1.txt");
        System.out.println(f.createNewFile());
        System.out.println(f.createNewFile());  // 已存在不会创建  返回false

        //public boolean mkdir(): 用于创建文件夹 ，注意：只能创建一级文件夹
        File f1 = new File("D:/code/JavaSE/text");
        System.out.println(f1.mkdir());

        //public boolean mkdirs(): 用于创建文件夹 ，注意：可以创建多级文件夹
        File f2 = new File("D:/code/JavaSE/text/aaa/bbb/ccc");
        System.out.println(f2.mkdirs());

        //public boolean delete() : 删除文件 ，或者空文件 ：注意不能删除非空文件夹
        System.out.println(f2.delete());
    }
}
