package com.sicuanyangguang;
/*
*
*
* */
public class HJiHeX9
{

}
abstract class Animals1
{
    private int age;
    private String name;

    public Animals1() {
    }

    public Animals1(int age, String name) {
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
    public abstract void eating();   // 定义吃东西的抽象方法

}

class Cat extends Animals1
{
    // 继承抽象类，重写抽象方法。
    public void eating()   // 重写定义吃东西的方法
    {
        System.out.println("动物再吃东西");
    }
}