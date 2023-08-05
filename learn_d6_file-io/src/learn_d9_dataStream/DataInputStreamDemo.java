package learn_d9_dataStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 数据输入流
 * 注意： 读取时需要按照写入的类型读取
 */
public class DataInputStreamDemo {
    public static void main(String[] args) {
        try (
                DataInputStream dis = new DataInputStream(new FileInputStream("learn_d6_file-io\\src\\test.txt"))
                )
        {
            int i = dis.readInt();
            System.out.println(i);
            double d = dis.readDouble();
            System.out.println(d);
            boolean b = dis.readBoolean();
            System.out.println(b);
            String s = dis.readUTF();
            System.out.println(s);


        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
