package com.learn.d2_udp;

import jdk.nashorn.internal.ir.BaseNode;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * udp 实现一发一收，服务端
 */
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("----服务中---");
        // 创建服务socket对象
        DatagramSocket socket = new DatagramSocket(6666);

        //创建服务数据包对象
        while (true) {
            byte[] bytes = new byte[1024*64];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
            socket.receive(packet);
            int len = packet.getLength();
            String rs = new String(packet.getData(),0,len);
            System.out.println("ip:" + packet.getSocketAddress() + rs);
        }


    }

}