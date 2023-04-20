package com.sicuanyangguang;

import java.util.LinkedHashMap;

/*
* LikedHashMap  有序，不重复，无索引。
*
*
*
*
* */
public class HJiHeX24 {
    public static void main(String[] args) {
        // 创建集合
        LinkedHashMap<String,Integer> l=new LinkedHashMap<>();
        // 添加元素
        l.put("zh",23);
        l.put("zha",233);
        l.put("zhss",223);
        //打印集合
        System.out.println(l);
    }
}
