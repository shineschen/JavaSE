package learn_d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 文件字节输入流，每次读取一个字符
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {

        // 创建文件字节输入流管道，与源文件接通
        InputStream is =  new FileInputStream(("learn_d6_file-io\\src\\learn_d4_byte_stream\\learn.txt"));

        // 读取文件字节
        // 每次读取一个字节返回，如果没有数据了 ，返回 -1 ；
//        int b1 =  is.read();
//        System.out.println((char) b1);   // 第一个字节   a
//
//        int b2 = is.read();
//        System.out.println((char) b2);   // 第二个字节   b
//
//        int b3 = is.read();
//        System.out.println(b3);    // -1

        // 使用循环读取文件字节
        int b; // 用于记住读取的字节
        while ((b = is.read()) != -1){
            System.out.print((char) b);
        }

        //读取数据的性能较差
        //读取汉字输出会乱码！无法避免！
        //流使用完毕后，必须关闭！释放系统资源！
        is.close();

    }
}
