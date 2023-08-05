package com.learn.d4_TCP4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * TCP 服务端
 */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("----服务端启动成功----");
        ServerSocket serverSocket = new ServerSocket(8080);
        // 创建线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(16 * 2, 16 * 2, 0, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(8), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());


        while (true) {
            //使用ServerSocket对象，调用accept方法，等待客户端的连接
            Socket socket = serverSocket.accept();


            System.out.println("新用户上线" + socket.getRemoteSocketAddress());

            //把这个客户端对应的socket通信管道交给一个独立线程处理

        }

    }
}
