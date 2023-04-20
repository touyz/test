package com.sicuanyangguang;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* Map的遍历方式  1 键找值
* 2 键值对
* 3 Lambda 表达式
*
*
*
* */
public class HJiHeX19 {
    public static void main(String[] args) {
        // 先创建Map对象
        Map<String,String> m=new HashMap<>();
        // 添加元素
        m.put("张全西","黄朝飞");
        m.put("张全","黄朝");
        m.put("张","黄");
        // 进行第一种键找值的方法进行遍历
        Set<String> a = m.keySet();
        for (String s : a) {
            //System.out.println(s);
            String s1 = m.get(s);
            System.out.println(s+","+s1);
        }
        Iterator<String> a1 = a.iterator();
        while(a1.hasNext())
        {
            String c = a1.next();
            //System.out.println(c);
            String der = m.get(c);
            System.out.println(c+","+der);
        }
    }
}
