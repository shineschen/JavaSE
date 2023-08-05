package learn_d6_bufered_stream;

import jdk.nashorn.internal.objects.annotations.Where;

import java.io.*;

/**
 * 字符缓冲输入流
 */
public class BufferedStreamDemo1 {
    public static void main(String[] args) {

        try (
                Reader rd = new FileReader("learn_d6_file-io\\src\\learn_d5_char_stream\\test.txt");
                BufferedReader brd = new BufferedReader(rd);
                Writer wt = new FileWriter("learn_d6_file-io\\src\\learn_d5_char_stream\\test.txt",true);
                BufferedWriter bwt = new BufferedWriter(wt);
                )
        {
//            char[] chars = new char[3];
//            int len;
//            while ((len = brd.read(chars))!=-1){
//                System.out.print(new String(chars,0,len));
//            }
            String line;
            while ((line = brd.readLine()) != null){
                System.out.println(line);
            }
            bwt.newLine();
            bwt.write("骐骥一跃不能十步弩");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
