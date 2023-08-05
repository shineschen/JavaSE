package com.learn.d5_TCP5;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderThread extends Thread{

    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        // 立即响应一个网页内容
        try {
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("HTTP/1.1 200 ok");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println(); //必须换行
            ps.println("<div style='color:red;font-size:120px;text-align:center'> 不积跬步无以至千里");
            ps.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
