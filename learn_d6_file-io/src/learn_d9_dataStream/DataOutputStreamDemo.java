package learn_d9_dataStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 数据输出流
 */
public class DataOutputStreamDemo {
    public static void main(String[] args) {
        // 创建数据输出流，包装低级字节输出流
        try(
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("learn_d6_file-io/src/test.txt"));
                )
        {
            dos.writeInt(97);
            dos.writeDouble(99.5);
            dos.writeBoolean(true);
            dos.writeUTF("数据字节输出流");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
