package com.XiangMuPingTu;

import java.io.File;

/*
*   isDirectory()  判断路径名表示的File是否为文件夹
*   isFile（） 判断路径名表示的File是否为文件
*   exists() 判断路径名表示的File是否存在
*   long length()  返回文件的大小
*  getAbsolutePath（） 返回文件的绝对路径
*  String getPath（） 返回定义文件时使用的路径
*  getName() 返回文件的名称，带后缀   如果是文件名会返回文件名和后缀
*  lastModified() 返回文件的最后修改时间
*
* */
public class HFile2 {
    public static void main(String[] args) {
        // 1 对一个文件的路径进行判断
        File f1=new File("D:\\UserTest.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        File der=new File("D:\\UserTest.txt");
        long l1 = der.length();// 返回文件的大小，单位是字节 ，只能获取文件的大小
        System.out.println(l1);
        System.out.println("--------------------------");
        File f3=new File("D:\\UserTest.txt");
        File ab = f3.getAbsoluteFile();
        System.out.println(ab);
        System.out.println("+++++++++++++++++++++++");
        File f4=new File("D:\\UserTest.txt");
        String st = f4.getPath();
        System.out.println(st);
        System.out.println("-------------------------");
        File f5=new File("D:\\UserTest.txt");
        String name = f5.getName();
        System.out.println(name);
    }
}
