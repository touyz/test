package com.XiangMuPingTu;

import java.io.File;
import java.io.IOException;

/*
* file的常见成员方法（创建和删除）
* boolean createNewFile() 创建一个新的文件夹
*  boolean mkdir() 创建一个单极文件夹
*  boolean mkdirs() 创建一个多级的文件夹
*  boolean delete() 删除文件和空的文件夹  并且是不走回收站的，删除了就没有了
*
* */
public class HFile3 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\雨霖铃\\杨银光是大帅哥.txt");
        boolean flag = f1.createNewFile();// 当然，文件如果是存在的就返回false
        System.out.println(flag);
        // 如果父级路径是不存在的话，那么会有异常IOException
        // createNewFile方法创建的一定是文件，如果创建的时候没有后缀名，那么就是一个没有后缀 的文件
        System.out.println("-----------------------");
        File f2=new File("D:\\史莱克");
        boolean mkdir = f2.mkdir();
        System.out.println(mkdir);
        // 注意首先路径一定是要唯一的，如果不是唯一的话，就无法创建了。
        System.out.println("--------------------------");
        File f3=new File("D:\\雨霖铃\\aaa\\bbbb//妈妈");
        boolean mkdirs = f3.mkdirs();
        System.out.println(mkdirs);
        // 这个创建的是多级的文件夹。但是也可以创建单级的文件夹。
        System.out.println("--------------------------");
        // 所以以后直接使用mkdirs就行了，不需要使用创建单级的。
        System.out.println("************************");
        File f4=new File("D:\\史莱克");
        boolean b = f4.delete();
        System.out.println(b);
        // 如果删除的是文件直接删除，空文件夹同上，如果删除的是有内容的文件夹，则删除失败

    }
}
