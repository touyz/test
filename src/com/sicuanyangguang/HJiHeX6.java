package com.sicuanyangguang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

/*
* list集合中的遍历方式，首先 Collection 中的那三种遍历list都能用，而且list还有之前学过的普通for循环遍历，
* 现在多了一个列表迭代器遍历 : 在遍历的过程中可以添加元素
*
* */
public class HJiHeX6 {
    public static void main(String[] args) {
        List<String> st=new ArrayList<>(); //创建集合并且添加元素
        st.add("dd");
        st.add("ss");
        st.add("aa");
        //先用迭代器的方法
        /*Iterator<String> iterator = st.iterator();
        while(iterator.hasNext())
        {
            String str=iterator.next();
            System.out.println(str);
        }
        // 再用普通的for循环
        for (int i = 0; i < st.size(); i++) {
            String a=st.get(i);
            System.out.println(a);
        }
        //再用增强for循环
        for (String s : st) {
            System.out.println(s);
        }*/
        //用Lambda 的方法
        st.forEach(s -> System.out.println(s));
        //最后用独有的列表迭代器方式，额外多了一个方法，可以在遍历的时候添加元素
        ListIterator<String> list = st.listIterator();
        while(list.hasNext())
        {
            String s = list.next();
            if("ss".equals(s))
            {
                list.add("大雷书院");
            }
            System.out.println(st);
        }
    }
}
