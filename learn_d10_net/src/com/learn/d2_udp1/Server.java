package com.learn.d2_udp1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * udp 实现多发多收，服务端
 */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("**********");
        // 创建服务端socket对象
        DatagramSocket socket = new DatagramSocket(9999);
        //创建服务端数据包对象用于接收数据

        byte[] bytes = new byte[1024*64];

        while (true){
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length);

            socket.receive(packet);
            int len = packet.getLength();
            String rs = new String(bytes,0,len);
            System.out.println("客户端->" + packet.getSocketAddress() + "说：" + rs);

        }


    }
}
