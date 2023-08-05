package learn_d6_bufered_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 读取文本文件并对内容排序
 */
public class BufferedTest {
    public static void main(String[] args) {
        try(
                // 创建缓冲字符输入流对象用于读取文件数据
                BufferedReader brd = new BufferedReader(new FileReader("learn_d6_file-io\\src\\learn_d5_char_stream\\test.txt"));
                // 创建缓冲字符输出流对象写入新文件
                BufferedWriter bwr = new BufferedWriter(new FileWriter("learn_d6_file-io\\src\\learn_d5_char_stream\\newTest.txt",true))
                )
        {
            // 创建Array集合存储每一行字符数据用于排序
            List<String> data = new ArrayList<>();

            // 循环读取每一行数据
            String line;
            while ((line = brd.readLine()) != null){
                data.add(line);
            }
            Collections.sort(data);

            //遍历集合写入新文件

            for (String s : data) {
                bwr.write(s);
                bwr.newLine();
            }
            System.out.println("写入完成！");




        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
