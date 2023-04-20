package com.sicuanyangguang;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
*
* 通过键值对遍历Map集合
*
* */
public class HJiHeX20 {
    public static void main(String[] args) {
        // 创建Map集合的对象
        Map<String,String> m=new HashMap<>();
        // 添加元素
        m.put("der","derb");
        m.put("sb","gp");
        m.put("mmp","mduo");
        // 用第键值对的方式进行遍历
        // 这个跟第一种方式的遍历是不一样的。
        Set<Map.Entry<String, String>> der = m.entrySet();
        // 遍历der这个集合
        for (Map.Entry<String, String> derb : der) {
            String key = derb.getKey();
            String value = derb.getValue();
            System.out.println(key+","+value);
        }
    }
}
