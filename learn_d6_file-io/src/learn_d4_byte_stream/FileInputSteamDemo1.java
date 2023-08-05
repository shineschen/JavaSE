package learn_d4_byte_stream;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * FileInputSteam 每次读取多个字节
 */
public class FileInputSteamDemo1 {
    public static void main(String[] args) throws Exception {
        // 创建一个字节输入流对象代表字节输入流管道与源文件接通
        InputStream is = new FileInputStream("learn_d6_file-io\\src\\learn_d4_byte_stream\\learn.txt");

        // 每次读取多个字节
//        byte[] buffer = new byte[3];
//        int len = is.read(buffer);
//        System.out.println(len);
//
//        String res = new String(buffer);
//        System.out.println(res);
//
//        int len1 =  is.read(buffer);
//        System.out.println(len1);
//
//        String res1 = new String(buffer,0,len1);
//        System.out.println(res1);
//
//        int len2 = is.read(buffer);
//        System.out.println(len2);
//
//
//         // 关闭流，释放系统资源
//        is.close();
        byte[] buffer = new byte[3];
        int len; //记住每次读取了多少字节数
        while ((len = is.read(buffer)) != -1){
            String rs = new String(buffer,0,len);
            System.out.println(rs);
        }
        // 性能得到了提升
        // 这种方案也不能避免出现读取汉字乱码的问题
        is.close();


    }
}
