package learn_d1_file;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * File提供的判断文件类型，获取文件信息功能
 */
public class FileDemo1 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\inter\\Desktop\\my_password.txt");
        File f2 = new File("JavaSE\\JavaSE\\learn.txt");

        //public boolean exists(); 判断当前文件对象，对应的文件路径是否存在，存在返回true
        System.out.println(f1.exists());    // true
        System.out.println(f2.exists());    // false

        //public boolean isFile() 判断当前文件对象代指的是否是文件，是返回true
        System.out.println(f1.isFile());
        System.out.println(f2.isFile());

        //public boolean isDirectory() 判断当前文件对象代指的是否是文件夹，是返回true
        System.out.println(f1.isDirectory());

        //public String getName() : 获取文件的名称，包含后缀
        System.out.println(f1.getName());

        //public long length() : 获取文件的大小，返回字节个数
        System.out.println(f1.length());

        //public long lastModified() : 获取文件的最后修改时间
        long time = f1.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(time));

        //public String getPath: 获取创建的文件对象时，使用的路径
        System.out.println(f1.getPath());
        System.out.println(f2.getPath());

        //public String getAbsoluteFile() 获取绝对路径
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f2.getAbsoluteFile());
    }
}
