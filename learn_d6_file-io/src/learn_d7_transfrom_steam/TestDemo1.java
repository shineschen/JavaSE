package learn_d7_transfrom_steam;

import java.io.*;

/**
 * 文件字符输入转换流解决乱码问题
 */
public class TestDemo1 {
    public static void main(String[] args) {

        try(
                InputStream ip = new FileInputStream("learn_d6_file-io\\src\\learn.txt");
                Reader isr = new InputStreamReader(ip,"GBK");
                BufferedReader br = new BufferedReader(isr);
                ) {

            String line;
            while ((line=br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
