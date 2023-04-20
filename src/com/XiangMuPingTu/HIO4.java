package com.XiangMuPingTu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
*
*
*
*
* */
public class HIO4 {
    public static void main(String[] args) throws IOException {
        // 换行写  再次写出一个换行符就行了。\r\n 这是  windows ，但是在Java中随意写一个就行了。
        // 续写
        FileOutputStream fos=new FileOutputStream("D:\\天空之城\\得意的笑.txt");
        String st="yangyinguangzuishuai";
        String st1="6666";
        byte[] arr = st.getBytes();
        byte[] arr1=st1.getBytes();
        System.out.println(Arrays.toString(arr));
        fos.write(arr);
        // 释放资源
        fos.close();
    }
}
