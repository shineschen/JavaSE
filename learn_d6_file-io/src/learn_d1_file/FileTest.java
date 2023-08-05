package learn_d1_file;
/** 批量添加文件
 *
 */

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) throws Exception {
        //创建文件对象

        for (int i = 1; i < 11; i++) {
            File f = new File("D:\\Code\\JavaSE\\text\\aaa\\bbb\\" + (i)+"0、text.txt");
            f.createNewFile();
        }

        //修改文件名称
        File file = new File("D:\\Code\\JavaSE\\text\\aaa\\bbb");

        File[] files = file.listFiles();
        System.out.println(Arrays.toString(files));
//        for (File file1 : files) {
//            //拿到名字，改成新名字
//            String name = file1.getName();
//            String index = name.substring(0,name.indexOf("、"));
//            String lastName = name.substring(name.indexOf("、"));
//            String newName = (Integer.valueOf(index)+8)+lastName;
//            System.out.println(newName);
//        }



    }
}
