package com.sicuanyangguang;

import java.util.HashSet;
import java.util.Set;

/*
* set  系列的集合  无序   不重复   无索引  ，所以不能用for循环进行遍历
* set集合的实现类 ： HashSet
* LinkedHashSet
* TreeSet
*
* HashSet 是由哈希表存储的数据，有数组，链表和红黑树组成
* 哈希值 是哈希表的灵魂所在。哈希值是算出来的对象的整数。
*
* 如果没有重写hashcode 方法，不同对象计算出的哈希值是不同的
* 但是如果重写了 hashcode 方法，不同的属性值相同，计算出的哈希值就是一样的。
*
* */
public class HJiHeX11 {
    public static void main(String[] args) {
        // 创建一个Set集合的对象
        Set<String> s=new HashSet<>();
        // 添加元素
        boolean der1 = s.add("张三");// 因为当前元素是第一次添加，所以是返回true
        boolean der2 = s.add("张三");// 因为是第二次添加重复的元素，所以返回false
        System.out.println(der1);
        System.out.println(der2);
        System.out.println(s);
    }
}
