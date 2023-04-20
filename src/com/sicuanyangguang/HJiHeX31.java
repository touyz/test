package com.sicuanyangguang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
* 需求： 自动点名器： 班里有N个学生，实现随机点名
*
*
* */
public class HJiHeX31 {
    public static void main(String[] args) {
        // 创建一个单列集合， ArrayList
        ArrayList<String> s=new ArrayList<>();
        // 实现批量添加元素，也就是学生的一个姓名
        Collections.addAll(s,"杨银光","张全西","黄忠海","黄朝飞");
        // 利用shuffle 打乱顺序，达到随机点名的情况  ,这个是第一种随机点名的方法，后面我还会再写一种
        /*Collections.shuffle(s);
        String s1 = s.get(0);
        System.out.println(s1);*/
        System.out.println("------------------------");
        Random r=new Random();
        int i = r.nextInt(s.size());// 直接获取了一个索引
        String s2 = s.get(i);
        System.out.println(s2);
    }
}


