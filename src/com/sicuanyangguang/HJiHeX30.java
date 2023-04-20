package com.sicuanyangguang;

import java.util.ArrayList;

import java.util.Collections;

/*
* Collections 的常用API， 首先就是 只是针对于单列集合来说的 ，并且工具类是直接类名.
*
* addAll()  批量添加元素
* shuffle ()   打乱list集合的顺序
*
*
* */
public class HJiHeX30 {
    public static void main(String[] args) {
        // 创建一个集合
        ArrayList<String> a=new ArrayList<>();
        // 调用方法,批量添加元素
        Collections.addAll(a,"hi","dh","dfe");
        // 打印集合
        System.out.println(a);
        // 利用shuffle 把顺序打乱
        Collections.shuffle(a);
        System.out.println(a);
    }
}
