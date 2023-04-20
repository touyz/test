package com.XiangMuPingTu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
*   FileOutputStream 写数据的3种方式
*  write(int b)  一次写一种数据
*  write(byte[] b) 一次写一个字节数组的数据
*  write(byte[] b,int off,int len) 一次写一个字节数组的部分数据
*   参数一： 数组   参数二： 起始索引 0  参数三： 个数
*
*
*
* */
public class HIO3 {
    public static void main(String[] args) throws IOException {
        // 创建对象
        FileOutputStream fos=new FileOutputStream("D:\\天空之城\\得意的笑.txt");
        // 写出数据
        /*fos.write(97);
        byte[] bytes={100,99,98,97};
        fos.write(bytes);*/
        byte[] bytes={100,99,98,97};
        fos.write(bytes,1,3);

        // 释放资源
        fos.close();
    }
}
