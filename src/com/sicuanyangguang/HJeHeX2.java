package com.sicuanyangguang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 迭代器的遍历  ，迭代器在Java中的类是Iterator ，迭代器是集合专用的遍历方式
*
* Iterator 中常用的方法   hasNext   next
*
* Iterator<String> it =list.iterator();//获取一个迭代器的对像
* boolean a=it.hasNext();// 判断当前对象中是否有元素
* String str =it.next();// 获取当前的元素并且移动指针
* System.out.println(str);
*
* */
public class HJeHeX2
{
    public static void main(String[] args)
    {
        // 创建集合并且添加元素
        Collection<String> coll=new ArrayList<>();
        coll.add("杨银光");
        coll.add("杨银");
        coll.add("杨");
        // 获取迭代器的对象
        Iterator<String> der = coll.iterator();
        //利用循环获取
        while(der.hasNext())
        {
            String ders = der.next();
            System.out.println(ders);  // 这个就是迭代器的遍历
        }
    }
}
/*
* 迭代器的小细节  迭代器遍历完之后，指针是不会复位的 ，所以你如果想要再次遍历的话，就只能在获取一个 迭代器的对象
* 迭代器循环的时候，只能使用一次next方法
* 迭代器遍历的时候，不能用集合的方法进行增加或删除，就是说再这个循环体当中
*
* */