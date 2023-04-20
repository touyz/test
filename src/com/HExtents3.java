package com;
/*
*1.父类中的构造方法是不能被子类继承的。但是可以通过super调用。
* 2.子类中所有的构造方法会默认先访问父类中的无参构造，再执行自己
*3.子类中构造方法第一行的默认值都是super(),不写也是存在的，且必须是在第一行。如果想要调用父类的有参构造，
* 就必须用super，因为默认调用的是无参构造。
*4.如果想要访问有参变量的话，就要到子类中写一个有参构造
* */
public class HExtents3
{
    public static void main(String[] args)
    {
        Student1 a=new Student1(); //如果想要访问有参变量的话，就要到子类中写一个有参构造
        Student1 b=new Student1("杨英",23);

        System.out.println(b.age+","+b.name);
    }
}

class Person
{
    String name;
    int age;

    public Person() {
        System.out.println("杨银光有点帅啊");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student1 extends Person
{
    public Student1()
    {
        //子类的构造方法中隐藏的是super()去访问父类的无参构造
        super();
        System.out.println("杨银光有两点帅");
    }
    public Student1(String name,int age)
    {
        super(name,age);
    }
}