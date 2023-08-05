package com.learn.d4_TCP3;


import java.io.*;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(){

    }

    public ServerReaderThread(Socket socket){
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
                    //把这个消息分发给全部客户端进行接收
                    sendMsgToAll(msg);
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

    private void sendMsgToAll(String msg) throws Exception {
        //发送给全部在线的socket管道接收
        for (Socket onlineSocket : Server.onlineSockets) {
            OutputStream os = onlineSocket.getOutputStream();
            DataOutputStream ds = new DataOutputStream(os);
            ds.writeUTF(msg);
            ds.flush();
        }

    }
}
