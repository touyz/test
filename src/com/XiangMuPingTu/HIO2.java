package com.XiangMuPingTu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* IO流的体系
* 演示 字节输出流 FileOutputStream
* 实现需求 : 写出一段文字到本地文件中，（暂时用不到中文）
* 实现步骤： 创建对象   写出数据    释放资源
*
* */
public class HIO2 {
    public static void main(String[] args) throws IOException {
        // 创建对象。
        FileOutputStream fos=new FileOutputStream("D:\\天空之城\\得意的笑.txt");
        // 写出数据
        fos.write(51132);// 这个整数其实是对应的ASCII码表的对应的字符。
        // 释放资源,释放资源是每一次用完流都要进行的操作。如果不进行这个操作，
        // 本地就无法打开你的本地文件。
        fos.close();
    }
}
