package com.XiangMuPingTu;

import java.io.IOException;
import java.net.*;

/*
* 端口号： 就是由两个字节表示的整数  取值范围是 0 -65535
*
* 其中0-1023之家的端口号用于一些知名的网络服务或者应用 我们自己使用1024以上的端口号就可以了
*
*  一个端口号只能被一个应用程序使用
*
*  协议: 什么是协议： 计算机网络中，连接和通信的规则被称为网络通信协议
*
*  UDP协议： 是面向无连接通信协议  速度快，有大小限制一次最多发送64k，数据不安全，容易丢失数据（比如说在线视频）
*
*  TCP协议：　是面向链接的通信协议，速度慢，没有大小限制，数据安全。（比如下载软件，发送邮件．．．）
* 　
* 　
*
* */
public class HWL05 {
    public static void main(String[] args) throws IOException {
        // UDP协议的代码，发送数据 1 创建对象
        // 创建对象的时候，会绑定端口，以后我们就是通过这个端口往外发送
        DatagramSocket ds=new DatagramSocket();
        // 打包数据
        String str="你好啊";

        byte[] bytes=str.getBytes();

        InetAddress address=InetAddress.getByName("127.0.0.1");

        int port=10086;
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);
        // 3 发送数据
        ds.send(dp);
        // 释放资源
        ds.close();
        /*
        * 现在你会发现，在控制台上打印输出不出来，因为这个就是UDP协议的特点，
        * 能接受就接受，如果不能接受，就拉倒
        *
        *
        * */
    }
}

// UDP用来接受数据
class Der{
    public static void main(String[] args) throws IOException {
        // 1 创建DatagramSocket对象()
        DatagramSocket ds=new DatagramSocket(10806);
        // 2 接受数据包
        byte[] bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);
        // 3 解析数据包
        byte[] data = dp.getData();

        int len=dp.getLength();

        InetAddress address=dp.getAddress();

        int port = dp.getPort();

        System.out.println("接受到数据"+ new String(data,0,len));

        System.out.println("该数据是从"+address+"这台电脑中的"+port+"这个端口发出的");

        // 释放资源
        ds.close();
    }
}





















