package com.XiangMuPingTu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
* Stream流的中间方法
* filter() 过滤
* limit() 获取前面几个元素
* skip () 跳过前面几个元素
* distinct() 元素去重  依赖hasCode 和 equals方法
* concat() 合并a , b 两个流为一个流
* map()  转换流中的数据类型
*
* */
public class HStream1 {
    public static void main(String[] args) {
        // filter 过滤
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"杨1","杨大2","多3","张4","张5");
        ArrayList<String> list3=new ArrayList<>();
        Collections.addAll(list3,"dhuahuha");
        list.stream()
                .filter(s-> s.startsWith("杨"))
                .filter(s-> s.length()==2)
                .forEach(s -> System.out.println(s));
        System.out.println("-------------");
        System.out.println(list);
        System.out.println("-------------------");
        // 获取前面几个元素
        list.stream().limit(3).forEach(s-> System.out.println(s));
        System.out.println("-------------");
        // 跳过前面几个元素
        list.stream().skip(4).forEach(s-> System.out.println(s));
        System.out.println("===============");
        // distinct 去重
        list.stream().distinct().forEach(s-> System.out.println(s));
        System.out.println("000000000000000000000000000000000000000000000000000000000");
        // concat，合并
        Stream.concat(list.stream(),list3.stream()).forEach(s-> System.out.println(s));

    }
}
