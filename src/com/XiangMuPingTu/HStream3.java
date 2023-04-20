package com.XiangMuPingTu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
* 数据过滤
*  定义一个集合，并添加一些整数： 1，2，3，4，5，6，7，8，9，10
* 过滤奇数，只留下偶数
* 并将结果保留起来
*
*
*
* */
public class HStream3 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        List<Integer> collect = list.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

    }
}
