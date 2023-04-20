package com;
/*
*没有继承就没有多态
*
* 比如说： Student s=new Student();
*   Person a=new Student();
* 可以赋值给父类，这个就是多态。
* 看一下应用场景。
* 就是说我要写让学生，老师，管理员，辅导员都要注册的一个方法，那么没有学这个多态之前，方法就要写4个对不对
* 现在我直接就写一个方法，如  public void register(Person a)
* 让学生，老师，管理员，辅导员都继承这个Person就行了，这就是多态。
*
* 1.多态的前提 有继承和实现关系   2.有父类引用指向子类对象  3.有方法重写
*
* */
public class HDuoTai
{
    public static void main(String[] args)
    {
        Student2 s=new Student2();
        s.setAge(23);
        s.setName("黄朝飞");
        Teacher1 t=new Teacher1();
        t.setAge(22);
        t.setName("张乐平");
        Manager1 m=new Manager1();
        m.setAge(20);
        m.setName("杨银光");
        HDuoTai.register(s);
        HDuoTai.register(t);
        HDuoTai.register(m);
    }
    public static void register(Person1 p)
    {
        p.show();
    }
}

class Person1
{
    private String name;
    private int age;

    public Person1() {
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show()
    {
        System.out.println(name+", "+age);
    }
}

class Student2 extends Person1
{
    @Override
    public void show()
    {
        System.out.println("学生"+","+getName()+","+getAge());
    }
}
class Teacher1 extends Person1
{
    @Override
    public void show() {
        System.out.println("老师"+getName()+","+getAge());
    }
}
class Manager1 extends Person1
{
    @Override
    public void show() {
        System.out.println("管理员"+getName()+","+getAge());
    }
}
