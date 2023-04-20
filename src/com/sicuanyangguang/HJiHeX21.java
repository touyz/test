package com.sicuanyangguang;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/*
* 利用Lambda的方式遍历Map集合  ，这种方式其实是最简单的遍历方法。
*
*
* */
public class HJiHeX21 {
    public static void main(String[] args) {
        // 创建Map 对象的集合
        Map<String,String> m=new HashMap<>();
        // 添加元素
        m.put("dd","der");
        m.put("r","rf");
        m.put("sdf","dvdr");
        // 利用Lambda的方法进行遍历
        m.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+","+value);
            }
        });
        System.out.println("------------------------");
        m.forEach((String s, String s2) -> {
                System.out.println(s+","+s2);
            }
        );
    }
}
