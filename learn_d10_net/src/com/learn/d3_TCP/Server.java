package com.learn.d3_TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP通信  服务端 一发一收
 *
 */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("------服务端-----");

        //创建serverSocket对象 ，同时为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(9999);
        // 等待客户端传输
        Socket socket = serverSocket.accept();

        InputStream ip = socket.getInputStream();
        DataInputStream dip = new DataInputStream(ip);
        while (true) {
            String re = null;
            try {
                re = dip.readUTF();
            } catch (IOException e) {
                socket.close();
                dip.close();
                break;
            }

            System.out.println(socket.getRemoteSocketAddress() + "\t" +re);
        }

    }
}
