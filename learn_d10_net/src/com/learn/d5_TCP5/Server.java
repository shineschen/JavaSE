package com.learn.d5_TCP5;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP 服务端
 */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("----服务端启动成功----");
        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {
            //使用ServerSocket对象，调用accept方法，等待客户端的连接
            Socket socket = serverSocket.accept();


            System.out.println("新用户上线" + socket.getRemoteSocketAddress());

            //把这个客户端对应的socket通信管道交给一个独立线程处理
            new ServerReaderThread(socket).start();
        }

    }
}
