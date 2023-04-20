package com.sicuanyangguang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/*
* Lambda 表达式的遍历，这种方式更简单
*
* */
public class HJiHeX4
{
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("dd");
        coll.add("dd");
        coll.add("dd");
        /*利用匿名内部类的方式
        coll.forEach(new Consumer<String>() {
            @Override
            // s就是依次表示集合中的数据
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        //利用Lambda 表达式来遍历 ()-> {}
        /*coll.forEach((String s)-> {
            System.out.println(s);
            }
        );*/
        coll.forEach(s-> System.out.println(s));  // 还可以简化成这样
    }
}
