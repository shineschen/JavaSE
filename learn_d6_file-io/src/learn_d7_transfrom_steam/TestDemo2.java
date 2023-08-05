package learn_d7_transfrom_steam;


import java.io.*;

/**
 * 文件字符输出转换流 指定字符集
 */
public class TestDemo2 {
    public static void main(String[] args) {
        try(
                OutputStream op = new FileOutputStream("learn_d6_file-io\\src\\learn1.txt",true);
                Writer osw = new OutputStreamWriter(op,"GBK");
                BufferedWriter bw = new BufferedWriter(osw)
        )
        {
            // 开始写入
            String data = "悠然到家实业有限公司abc";
            bw.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
