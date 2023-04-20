package com.sicuanyangguang;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
* 利用HashSet 集合去除重复的元素
* 需求： 创建一个存储学生对象的集合，存储多个学生对像。
* 使用程序实现在控制台遍历该集合
* 需求： 学生对像的成员变量值相同，我们就认为是同一个对象。
*
*
* */
public class HJiHeX13 {
    public static void main(String[] args) {
        Students1 s1=new Students1(20,"杨银光");//创建了3个学生对像。
        Students1 s2=new Students1(22,"杨");
        Students1 s3=new Students1(23,"杨银");
        HashSet<Students1> st=new HashSet<>();//创建集合，添加学生，如果去重复的话，用HashSet,如果不去重的话，用Arraylist
        st.add(s1);
        st.add(s2);
        st.add(s3);
        System.out.println(st.add(s1));
        System.out.println(st.add(s2));
        System.out.println(st.add(s3));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

class Students1
{
    private int age;
    private  String name;

    public Students1() {
    }

    public Students1(int age, String name) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students1)) return false;
        Students1 students1 = (Students1) o;
        return getAge() == students1.getAge() && Objects.equals(getName(), students1.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }

    @Override
    public String toString() {
        return "Students1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}