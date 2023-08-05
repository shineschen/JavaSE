package com.learn.d4_TCP3;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * TCP通信  服务端 多发多收
 */
public class Server {
    public static List<Socket> onlineSockets = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        System.out.println("------服务端-----");

        //创建serverSocket对象 ，同时为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true){
            //使用serverSocket对象，调用accept(),等待客户端的连接请求
            Socket socket = serverSocket.accept();
            onlineSockets.add(socket);

            System.out.println(socket.getRemoteSocketAddress() + "上线了");

            // 把这个客户端对应的socket通信管道，交给一个独立的线程负责处理
            new ServerReaderThread(socket).start();

        }




    }


}

