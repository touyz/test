package com.XiangMuPingTu;

import java.io.File;
import java.io.IOException;

/*
*综合小练习 一： 创建一个文件夹
*
*
*
* */
public class HFile5 {
    public static void main(String[] args) throws IOException {
        File f1=new File("D:\\天空之城\\得意的笑.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);

    }
}
