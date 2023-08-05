package learn_d4_byte_stream;


import java.io.*;

/**
 * 使用文件字节流完成文件复制
 */
public class CopyTest {
    public static void main(String[] args) throws Exception {

//        //创建文件字节输入流并关联源文件
//        InputStream is = new FileInputStream("C:\\Users\\inter\\Desktop\\微信图片_20230722112622.jpg");
//        //得到源文件字节大小
//        File file= new File("C:\\Users\\inter\\Desktop\\微信图片_20230722112622.jpg");
//        int len = (int) file.length();
//        //创建一个字节数组储存源文件所有字节
//        byte[] bytes = new byte[len];
//
//        int lens =  is.read(bytes);
//        System.out.println(lens);
////        System.out.println(new String(bytes));
//        // 写入操作  先创建一个文件字节输出流
//        OutputStream os = new FileOutputStream("D:\\新建文件夹\\touxiang.png");
//        os.write(bytes);
//        os.close();
//        is.close();

        FileCopy("learn_d6_file-io\\src\\learn_d4_byte_stream\\learn.txt", "D:\\Code\\JavaSE\\learn_d6_file-io\\src\\learn_d4_byte_stream\\learn1.txt");


    }


    public static void FileCopy(String sFile, String eFile) {
        InputStream is = null;
        OutputStream os = null;
        // 创建文件字节输入流链接源文件
        try {
            is = new FileInputStream(sFile);
            // 创建文件字节输出流管道
            os = new FileOutputStream(eFile);
            // 得到源文件字节数大小
            int len = (int) new File(sFile).length();
            // 创建byte桶
            byte[] butter = new byte[len];

            while (is.read(butter) != -1) {
                os.write(butter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void FileCopy1(String sFile, String eFile) {

        // 创建文件字节输入流链接源文件
        try (
                InputStream is = new FileInputStream(sFile);
                // 创建文件字节输出流管道
                OutputStream os = new FileOutputStream(eFile);
        ) {
            // 得到源文件字节数大小
            int len = (int) new File(sFile).length();
            // 创建byte桶
            byte[] butter = new byte[len];

            while (is.read(butter) != -1) {
                os.write(butter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
