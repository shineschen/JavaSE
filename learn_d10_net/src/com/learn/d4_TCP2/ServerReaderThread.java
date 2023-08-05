package com.learn.d4_TCP2;


import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;

    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                String s = dis.readUTF();
                System.out.println(s);
            }

        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
            try {
                socket.close();
            } catch (Exception ex) {
                e.printStackTrace();
            }

        }

    }
}
