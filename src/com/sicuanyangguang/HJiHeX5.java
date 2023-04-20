package com.sicuanyangguang;

import java.util.ArrayList;
import java.util.List;

/*
* list中独有的方法
* add()  这个跟之前的是不一样的，因为可以在集合中指定元素的位置
* remove() 删除指定索引的元素，返回被删除的元素
* set () 修改指定索引处的元素，返回被修改的元素
* get() 返回指定索引处的元素
*
* */
public class HJiHeX5 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("sf");
        list.add("sf");
        list.add("sf");
        list.add("sf");
        list.add("不夜侯");
        list.add("往");
        list.add(1,"杨银光"); //原来的元素会依次往后移动
        String remove = list.remove(0);
        list.remove("不夜侯");
        System.out.println(remove);
        System.out.println(list);
        //list.remove 会有两个方法，一个是删除索引上的元素，一个是直接删除元素。
        list.remove("不夜侯");
        String dd = list.set(0, "dd");
        System.out.println(dd);
    }
}
