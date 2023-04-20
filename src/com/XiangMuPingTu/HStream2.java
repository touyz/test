package com.XiangMuPingTu;

import java.util.*;
import java.util.stream.Collectors;

/*
* stream流的终结方法
* forEach() 遍历
* count() 统计
* toArray() 收集流中的数据，放到数组当中
* collect() 收集流中的数据，放到集合当中
*
*
* */
public class HStream2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"a","b");
        list.stream().forEach(s-> System.out.println(s));
        System.out.println("-------------------------");
        long count = list.stream().count();
        System.out.println(count);
        System.out.println("++++++++++++++");
        String[] strings = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(strings));
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        // 收集到list当中
        List<String> collect = list.stream().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        // 收集到Set集合中
        Set<String> collect1 = list.stream().collect(Collectors.toSet());
        System.out.println(collect1);
    }
}
