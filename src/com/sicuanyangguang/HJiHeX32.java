package com.sicuanyangguang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
* 班里有N个学生，要求 : 70% 的概率抽到男生，30%的概率抽到女生
*
*
* */
public class HJiHeX32 {
    public static void main(String[] args) {
        // 先创建一个ArrayList集合
        ArrayList<Integer> list=new ArrayList<>();
        // 添加概率元素
        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);
        // 打乱集合
        Collections.shuffle(list);
        // 用Random来进行点名
        Random r=new Random();
        int i = r.nextInt(list.size());
        Integer s = list.get(i);
        System.out.println(s);
        // 创建两个集合对象，一个集合存男生，一个集合存女生
        ArrayList<String> boyList=new ArrayList<>();
        ArrayList<String> girlList=new ArrayList<>();
        Collections.addAll(boyList,"男1","男2","男3","男4","男5","男6","男7");
        Collections.addAll(girlList,"女1","女2","女3");
        //现在就可以开始进行比较了
        if(s==1)
        {
            // 男生
            int i1 = r.nextInt(list.size());
            String s1 = boyList.get(i1);
            System.out.println(s1);
        }
        else
        {
            // 女生
            int i1 = r.nextInt(list.size());
            String s1 = girlList.get(i1);
            System.out.println(s1);
        }
    }
}
