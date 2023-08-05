package learn_d8_printStream;


import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;


/**
 * 打印流
 */
public class PrintDemo {
    public static void main(String[] args) {
        // 创建打印流管道
        try (
                PrintStream ps = new PrintStream(new FileOutputStream("learn_d6_file-io\\src\\learn1.txt",true));   // 如果要追加数据，需包装成低级流

                ){
            ps.println(97);
            ps.println('a');
            ps.println("哈哈");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
