package com.XiangMuPingTu;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/*
*  体验Stream 流的作用：
* 需求： 按照下面的要求完成集合的创建和遍历
* 创建一个集合，存储多个字符串元素
* 分为中间方法和终结方法，中间方法调用了之后还可以调用其他的方法，但是终结方法调用了之后，没有办法调用其他的方法
*
* 单列集合调用Stream使用的是 Collection 中默认的方法，双列集合无法直接调用Stream
* 数组调用  Arrays 工具类中的方法
* 其他的就是调用Stream接口中的静态方法
*
* */
public class HStream {
    public static void main(String[] args) {
        // 单列集合获取Stream
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"a","b","c");
        // 获取到一条流水线，并把集合放到流水线上
        list.stream().forEach(s-> System.out.println(s));
        // 数组获取Stream
        String[] a={"c","d"};
        Arrays.stream(a).forEach(s-> System.out.println(s));
        // 其他的数据获取Stream
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
    }
}
