package com.learn.d1_IP;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *  InetAddress类
 */
public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        // 获取本机IP地址对象
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());

        // 获取指定域名的ip地址对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        //判断是否连通
        System.out.println(ip2.isReachable(6000));

    }
}
