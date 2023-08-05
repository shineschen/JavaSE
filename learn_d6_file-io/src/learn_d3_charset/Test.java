package learn_d3_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Java对字符的编码和解码
 */
public class Test {
    public static void main(String[] args) throws Exception {

        // 1. 编码
        String data = "a我b";
        byte[] datas =  data.getBytes();   // 默认使用平台字符集（UTF-8）进行编码
        System.out.println(Arrays.toString(datas));

        // 2.按照指定字符集进行编码
        byte[] datas1 = data.getBytes("GBK");
        System.out.println(Arrays.toString(datas1));

        //解码
        String s1 = new String(datas);  // 默认使用平台字符集（utf-8）进行解码
        System.out.println(s1);

        String s2 = new String(datas1 ,"GBK");
        System.out.println(s2);
    }
}
