package com.XiangMuPingTu;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.UnknownHostException;

/*
* InetAddress 的作用：
* static InetAddress getByName(String host)  确认主机名称的ip地址，主机名称可以是机器的名称，也可以是ip地址
*
* String getHostName()  获取ip地址的主机名
*
* String getHostAddress()  返回文本998显示的ip地址的字符串
*
* */
public class HWL04 {
    public static void main(String[] args) throws UnknownHostException {
        // 1 获取InterAddress的对象,这个对象是用来表示ip的对象，说白了就是电脑的对象
        InetAddress address=InetAddress.getByName("192.168.1.100");
        System.out.println(address);
        String name=address.getHostName();
        System.out.println(name);
        //  调用方法
        String ip = address.getHostAddress();
        System.out.println(ip);
    }
}














