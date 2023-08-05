package com.learn.d2_udp1;

import com.learn.d1_IP.InetAddressTest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * udp 实现多发多收，客户端
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 创建客户端socket对象
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        //创建数据包对象
        while (true){
            long t = System.currentTimeMillis();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒 Ea");
            String rs = sdf.format(t);
            System.out.println("请说：");
            String msg = sc.next();
            if (msg.equals("exit")){
                System.out.println("bye~");
                socket.close();
            }
            msg += "\n" + rs;
            byte[] bytes = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),9999);
            socket.send(packet);
            System.out.println("--------------------");


        }


    }
}