package com.learn.d3_TCP;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * TCP 通信  客户端实现 1发 1收
 * 面向连接 可靠通信
 */
public class Client {
    public static void main(String[] args) throws Exception {
       // 创建socket对象,指向服务端地址与端口
        Socket socket = new Socket("192.168.0.7",9999);

        // 从socket对象获得字节输出流
        OutputStream os = socket.getOutputStream();
        //包装成数据输出流
        DataOutputStream dop = new DataOutputStream(os);

        //开始写出数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String s = sc.next();
            if (s.equals("exit")){
                socket.close();
                dop.close();
                break;
            }
            dop.writeUTF(s);
        }

    }
}
