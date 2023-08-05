package com.learn.d4_TCP2;


import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP 通信  多客户端实现 多发 多收
 * 面向连接 可靠通信
 */
public class Client {
    // 创建socket对象
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("192.168.0.7",9898);

        OutputStream os = socket.getOutputStream();

        DataOutputStream dos = new DataOutputStream(os);
        Scanner sc =new Scanner(System.in);

        while (true){
            System.out.println("please enter ：");
            String msg = sc.next();
            if (msg.equals("exit")){
                System.out.println("bye~");
                dos.close();
                socket.close();
                break;
            }
            dos.writeUTF(msg);
        }


    }




}
