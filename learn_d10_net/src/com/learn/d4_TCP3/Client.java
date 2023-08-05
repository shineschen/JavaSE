package com.learn.d4_TCP3;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 即时通信  群聊
 * 面向连接 可靠通信
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 创建Socket对象，并同时请求与服务器程序的连接
        Socket socket = new Socket("127.0.0.1", 8888);

        //创建一个独立的线程，负责随时从socket中接收服务端发送过来的消息
        new ClentReaderThread(socket).start();

        // 从socket通信管道中得到一个字节输出流，用来发数据给服务端程序
        OutputStream os = socket.getOutputStream();

        //把低级的输出流包装成数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        //开始写数据出去
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请说：");
            String msg = sc.next();
            if ("exit".equals(msg)) {
                System.out.println("退出！");
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(msg);
            dos.flush();

        }
//        dos.close();
//        socket.close();

    }
}
