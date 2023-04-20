package com.sicuanyangguang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
* 集合的进阶  单列集合  和双列集合
*
* 单列集合 collection中分为 set  和 list   而 list 又分为arraylist linkedlist   vector
* set 又分为 hashset treeset hashset 又有linkedhashset
* list 系列的集合是有序，可重复，有索引的
*set 系列的集合刚好是反的，无序，不重复，无索引的
*
* public boolean add(a,b)  把指定的对象添加到当前的集合中
*
* public void clear() 清空当前集合的所有的元素
* public boolean remove(a,b) 把指定的对象在当前元素中删除
* public boolean contains(Object a) 判断当前的集合是否包含指定的对象
* public boolean isEmpty() 判断当前的集合是否为空
* public int size() 返回集合中元素个数/集合的长度
* 注意： collection 是一个接口
*
*
* */
public class HJeHeX
{
    public static void main(String[] args)
    {
        Collection<String> coll=new ArrayList<>();//创建集合，用的是collection来创建的
        Guang g=new Guang("yy");
        Guang g1=new Guang("d");
        Guang g2=new Guang("dd");
        coll.add("d");
        coll.add("光");
        coll.add("光");
        coll.add("光");
        System.out.println(coll);
        /*
        * 注意了： 添加元素的时候，如果往list系列中添加的话，方法永远是返回true的，因为这个系列是可以重复的
        * 如果要往set系列中添加元素的话，就是看你添加的元素是否是重复的，如果是重复的话，返回false，添加失败
        * 如果不是重复的话，返回true ，添加成功
        *
        *
        * */
        //coll.clear();
        //System.out.println(coll);
        coll.remove("光");
        System.out.println(coll);
        /*
        * 如果删除的元素不存在，就会返回失败。
        * */

        boolean result=coll.contains("光");
        System.out.println(result);
        /*
        * 是用equals方法进行判断的，如果说你要判断自定义的类的话，就需要重写equals方法。
        * */
       boolean result2=coll.isEmpty();
        System.out.println(result2);
        int size=coll.size();
        System.out.println(size);
    }
}

class Guang
{
    private String name;

    public Guang() {
    }

    public Guang(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guang)) return false;
        Guang guang = (Guang) o;
        return Objects.equals(getName(), guang.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}