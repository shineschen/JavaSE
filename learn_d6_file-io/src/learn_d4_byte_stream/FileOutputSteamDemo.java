package learn_d4_byte_stream;


import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 文件字节输出流
 */
public class FileOutputSteamDemo {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("learn_d6_file-io\\src\\learn_d4_byte_stream/test.txt",true);

        // 开始写字节数据到硬盘文件
        os.write(97);  //每次写一个字节
        os.write('b');
        byte[] bytes = "悠然到家实业有限公司".getBytes();
        os.write(bytes);
        os.write(bytes,0,12);

        //换行
        os.write("\r\n".getBytes());
        os.close();


    }
}
