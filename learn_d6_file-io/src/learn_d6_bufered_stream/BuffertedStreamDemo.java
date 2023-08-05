package learn_d6_bufered_stream;

import java.io.*;

/**
 * 字节缓冲流
 */
public class BuffertedStreamDemo {
    public static void main(String[] args) {
        try (
                InputStream is = new FileInputStream("learn_d6_file-io\\src\\learn_d5_char_stream\\test.txt");
                // 定义一个字节缓冲输入流包装原始字节输入流
                InputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream("learn_d6_file-io\\src\\learn_d5_char_stream\\testCopy.txt");
                // 定义一个字节缓冲输出流包装原始字节输出流
                OutputStream bos = new BufferedOutputStream(os);

        )
        {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1){
               bos.write(buffer,0,len);
            }
            System.out.println("复制完成");
        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
