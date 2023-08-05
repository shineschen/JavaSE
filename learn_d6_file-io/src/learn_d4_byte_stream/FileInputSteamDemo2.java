package learn_d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *  使用文件字节输入流一次读取完文件的全部字节 ，解决读取中文乱码问题
 */
public class FileInputSteamDemo2 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("learn_d6_file-io\\src\\learn_d4_byte_stream\\learn.txt");

        File f =  new File("learn_d6_file-io\\src\\learn_d4_byte_stream\\learn.txt");
        byte[] buffer = new byte[(int)f.length()];
        int len = is.read(buffer);

        String rs = new String(buffer);
        System.out.println(len);
        System.out.println(rs);
        is.close();




    }
}
