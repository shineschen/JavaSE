package learn_d5_char_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * 文件字符输入流  每次读取一个字符
 */
public class FileReaderDemo {
    public static void main(String[] args) {

        try (
                Reader fr = new FileReader("learn_d6_file-io\\src\\learn.txt");
        ) {
//            int len;
//            while ((len = fr.read())!= -1){
//                System.out.print((char) len);
//            }
            // 一次读取多个字符,提升性能

            File f = new File("learn_d6_file-io\\src\\learn.txt");
            char[] chars = new char[(int)f.length()];
            while (fr.read(chars) != -1){
                System.out.print(new String(chars,0,(char)f.length()));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
