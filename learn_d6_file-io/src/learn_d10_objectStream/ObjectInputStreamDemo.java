package learn_d10_objectStream;

import com.sun.xml.internal.ws.util.NoCloseInputStream;

import java.io.FileInputStream;

import java.io.ObjectInputStream;


/**
 * 对象字符输入流 ：反序列化对象
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        try(
                ObjectInputStream ois  = new ObjectInputStream(new FileInputStream("learn_d6_file-io\\src\\testOut.txt"));
                )
        {
            Object u1 =  ois.readObject();
            System.out.println(u1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
