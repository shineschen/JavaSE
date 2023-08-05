package com.learn.d4_TCP3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClentReaderThread extends Thread{
    private Socket socket;


    public ClentReaderThread(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream ds = new DataInputStream(is);
            while (true){
                try {
                    String msg = ds.readUTF();
                    System.out.println(msg);

                } catch (IOException e) {
                    System.out.println(socket.getRemoteSocketAddress() + "下线了！");
                    Server.onlineSockets.remove(socket);
                    ds.close();
                    socket.close();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }


