package com.sicuanyangguang;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

/*
* LikedHashSet 的底层原理： 有序，不重复，无索引
*
* TreeSet  的特点： 可排序  不重复  无索引
*
*用TreeSet 存储整数并进行排序
*
* TreeSet 中 集合默认的规则
* 对于数值类型来说，是默认按照从小到大的顺序进行排序的
* 对于字符，字符串类型  按照的是ASCII 码表的数字的升序进行的排序。
*
*
*
*
* */
public class HJiHeX14 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(23);
        ts.add(24);
        ts.add(2);
        ts.add(3);
        ts.add(235);
        System.out.println(ts);//打印的结果就是从小到大排序排好了的
        Iterator<Integer> der=ts.iterator();
        while(der.hasNext())
        {
            Integer s=der.next();// 自动装箱和自动拆箱，这里的Integer 也可以写成int
            System.out.println(s);
        }
        System.out.println("--------------------");//第一种方法用的是迭代器进行的遍历
        for (Integer t : ts) {
            System.out.println(t);
        }
        System.out.println("+++++++++++++++++++++++++++++++");// 这个是第二种方法，增强for循环
        ts.forEach(new Consumer<Integer>() {  //这个使用匿名内部类进行的一个遍历，下面我将会用lamdad的方法
            //看我是怎样进行的改变吧。
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });
        System.out.println("!!!!!!!!!!!!!!!!");
        ts.forEach((Integer t)-> {
                System.out.println(t);
            }
        );
    }
}
