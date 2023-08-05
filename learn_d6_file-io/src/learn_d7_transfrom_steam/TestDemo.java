package learn_d7_transfrom_steam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * 字符输入流读取文件乱码问题
 */
public class TestDemo {
    public static void main(String[] args) {

        try(
                Reader fr = new FileReader("learn_d6_file-io\\src\\learn.txt");
                BufferedReader bfr = new BufferedReader(fr);
                ) {

            String line;
            while ((line=bfr.readLine()) != null){
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
