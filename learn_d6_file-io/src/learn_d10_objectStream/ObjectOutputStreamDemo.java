package learn_d10_objectStream;

import java.io.*;

/**
 * 对象字节输出流 ，序列化对象
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        //创建一个java对象
        User u = new User("张三",20,"123456");

        //创建对象字节输出流，包装原始字节输出流
        try (
                ObjectOutput dos =  new ObjectOutputStream(new FileOutputStream("learn_d6_file-io\\src\\testOut.txt"));
                )
        {
            //序列化对象到文件中去
            dos.writeObject(u);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
