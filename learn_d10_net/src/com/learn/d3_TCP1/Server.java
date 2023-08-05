package com.learn.d3_TCP1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP通信  服务端 多发多收
 *
 */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("------服务端-----");

        //创建serverSocket对象 ，同时为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(8888);

        //使用serverSocket对象，调用accept(),等待客户端的连接请求
        Socket socket = serverSocket.accept();

        //从socket通信管道中得到一个字节输入流
        InputStream is = socket.getInputStream();

        //包装成数据输入流
        DataInputStream ds = new DataInputStream(is);

        //使用数据输入流读取客户端发送过来的数据
        while (true) {
            try {
                String rs = ds.readUTF();
                System.out.println(rs);
            } catch (Exception e) {
                System.out.println(socket.getRemoteSocketAddress() + "离线了！");
                socket.close();
                ds.close();
                break;
            }

            //获取客户端IP地址
            System.out.println(socket.getRemoteSocketAddress());
        }




    }
}
