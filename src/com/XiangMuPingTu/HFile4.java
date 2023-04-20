package com.XiangMuPingTu;

import java.io.File;

/*
* File[] listFiles()  获取当前路径下所有的内容
*  如果路径不存在的时候，返回null
* 如果调用者是文件时，返回null
* 如果是一个空文件夹的时候，返回一个长度为0的数组
* 如果是一个有内容的文件夹的时候，会以数组的形式返回，包括隐藏文件夹。
* 如果有权限路径，就返回null.
*
* */
public class HFile4 {
    public static void main(String[] args) {
        // 创建File对象
        File f1=new File("D:\\天空之城");
        // listFiles 获取所有的内容
        File[] files = f1.listFiles();
        for (File file : files) {
            // file 这个变量就是依次表示每一个内容
            System.out.println(file);
        }

    }
}
