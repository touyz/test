package com.sicuanyangguang;

import java.util.Objects;

/*
* 因为我重写了hashcode 值，所以不同的对象，只要属性是一样的，哈希值就是一样的
*
* 元素存入的位置（也就是索引，也叫下标）就是  int index =(数组长度-1) & 哈希值
*
* 如果计算的位置是null ，那么就直接存入。如果位置不是null,表示有元素，则调用equals 方法比较属性值。
* 如果 属性值一样，不存    如果属性值  不一样，  形成链表
* JDK8 以后，新的元素直接挂在老元素的下面，形成链表。
*
* HashSet 的底层原理  JDK8 以前 是由数组和链表构成的，但是JDK8以后，包括8 ，是由数组，链表和红黑树构成的。
*
* JDK8 以后，包括JDK8 ，当链表的长度超过8 而且数组长度大于等于64的时候，自动转换为红黑树，当然记住了是同时满足这两个
* 条件才可以。
*
* ！！！！如果集合中存储的是自定义的对象，那么必须要重写HashCode 方法和equals 方法。！！！
*
* HashSet  的三个问题  1 为什么存和取的顺序是不一样的呢？
*
*  为什么没有索引呢？ 因为HashSet 底层有数组，链表，和红黑树，所以没有办法弄索引，不纯粹。
* 为什么不重复呢？ 因为是重写了hashcode 方法和equals 方法。
*
* */
public class HJiHeX12 {
    public static void main(String[] args) {
        Students s1=new Students(20,"yy");
        Students s2=new Students(20,"yy");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

class Students
{
    private  int age;
    private String name;

    public Students() {
    }

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students)) return false;
        Students students = (Students) o;
        return getAge() == students.getAge() && Objects.equals(getName(), students.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }
}
