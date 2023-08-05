package com.learn.d2_udp;
/**
 * UDP 客户端 一发一收
 */

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;

/**
 * udp 实现一发一收，客户端
 * 无连接 不可靠通信
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 创建客户端socket对象
        DatagramSocket socket = new DatagramSocket();

        // 创建客户端数据包对象
        long t = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh点mm分ss秒 Ea");
        String time = "\t" + sdf.format(t) + "\n不积跬步无以至千里";
        byte[] bytes = time.getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length,InetAddress.getLocalHost(),6666);

        // 发送消息
        socket.send(packet);
        System.out.println("发送成功！");
        socket.close();
    }
}