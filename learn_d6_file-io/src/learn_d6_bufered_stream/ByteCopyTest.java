package learn_d6_bufered_stream;

import java.io.*;

/**
 * 文件字节流各方式的性能问题
 */
public class ByteCopyTest {
    private static final String strFile = "E:\\yrdj.mp4";
    private static final String goalFile = "E:\\test";



    public static void copy1(){
        long strTime = System.currentTimeMillis();
        try(
                FileInputStream ip = new FileInputStream(strFile);
                FileOutputStream op = new FileOutputStream(goalFile + "1.mp4")
                )
        {
            int len;
            while ((len = ip.read())!= -1){
                op.write(len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("低级字节流按每次一个字节复制耗时：" + (endTime-strTime) / 1000.0 + "s");

    }

    /**
     * 使用低级字节流按字节数组方式复制
     */
    public static void copy2(){
        long strTime = System.currentTimeMillis();
        try(
                FileInputStream ip = new FileInputStream(strFile);
                FileOutputStream op = new FileOutputStream(goalFile + "2.mp4")
        )
        {
            byte[] bytes = new byte[1024*64];
            int len;
            while ((len = ip.read(bytes))!= -1){
                op.write(bytes,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("低级字节流按字节数组复制耗时：" + (endTime-strTime) / 1000.0 + "s");


    }

    public static void copy3(){
        long strTime = System.currentTimeMillis();
        try(
                FileInputStream ip = new FileInputStream(strFile);
                BufferedInputStream bip = new BufferedInputStream(ip);
                FileOutputStream op = new FileOutputStream(goalFile + "3.mp4");
                BufferedOutputStream bop = new BufferedOutputStream(op)
        )
        {
            int len;
            while ((len = bip.read())!= -1){
                bop.write(len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("缓冲字节流按每次一个字节复制耗时：" + (endTime-strTime) / 1000.0 + "s");

    }


    public static void copy4(){
        long strTime = System.currentTimeMillis();
        try(
                FileInputStream ip = new FileInputStream(strFile);
                BufferedInputStream bip = new BufferedInputStream(ip,1024*64);
                FileOutputStream op = new FileOutputStream(goalFile + "4.mp4");
                BufferedOutputStream bop = new BufferedOutputStream(op,1024*64)
        )
        {
            byte[] bytes = new byte[1024*64];
            int len;
            while ((len = bip.read(bytes))!= -1){
                bop.write(bytes,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("高级字节流按字节数组复制耗时：" + (endTime-strTime) / 1000.0 + "s");

    }




    public static void main(String[] args) {
//        copy1();    性能太差，弃用
        copy2();
        copy3();
        copy4();
    }



}
