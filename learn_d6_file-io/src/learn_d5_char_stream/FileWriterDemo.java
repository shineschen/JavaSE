package learn_d5_char_stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件字符输出流
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        // 创建文件字符输出流管道与目标文件接通
        try (FileWriter fw = new FileWriter("learn_d6_file-io\\src\\learn_d5_char_stream\\test.txt"))
        {
            fw.write('a');
            fw.write(97);
//            fw.write('啊');
            fw.write("一二三四五");
            fw.write("一二三四五",0,3);
            char[] chars = {'黑','白','蓝'};
            fw.write(chars);
            fw.write(chars,0,2);
            fw.flush();  // 刷新流
            fw.write("刷新了哦");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
