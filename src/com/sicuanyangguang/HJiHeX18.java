package com.sicuanyangguang;

import java.util.HashMap;
import java.util.Map;

/*
 * 双列集合的特点： 双列集合一次需要存一对数据，分别是键和值
 * 键不能重复，值可以重复
 * 键和值是一一对应的，每一个键只能找自己对应的值
 * 键+值这个整体，称为键值对  或者键值对对象  ，在Java中叫做Entry对象。
 * 双列集合的顶层是Map  ,所有的双列集合都可以使用。下面是双列集合的常见的方法
 *  put()   添加元素
 * remove() 根据键删除键值对元素
 *
 * clear （） 移除所有的键值对元素
 * containsKey() 判断集合是否包含指定的键
 *containsValue() 判断集合是否包含指定的值
 * isEmpty() 判断集合是否为空
 * size() 集合的长度。
 *
 *
 * */
public class HJiHeX18 {
    public static void main(String[] args) {
        //先创建Map的集合
        Map<String, String> m = new HashMap<>();
        // 添加元素
        // put方法的细节  : 在添加数据的时候，如果键不存在，会直接吧对象添加到集合当中 ,返回null.
        // 但是键是存在的，会把原有的键值对象覆盖，并且把原有的返回。
        m.put("杨思思","杨银光");
        m.put("黄晓明","杨颖");
        //System.out.println(m);
       // String put = m.put("杨思思", "杨银光光");
       // System.out.println(put);
        String i = m.remove("杨思思");
        //System.out.println(i);
        m.clear();// 直接清空集合
        System.out.println(m);

    }
}
