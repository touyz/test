package com.sicuanyangguang;
/*
* 内部类就是在一个类的里面再定义一个类
*内部类可以随意访问外部类  但是外部类要访问内部类就需要创建对象。
* 使用内部类的条件是 内部类是外部类的一部分，这样就可以使用内部类
*
* 内部类分为 4种，成员内部类  静态内部类  局部内部类   匿名内部类
* 前面3种 了解一下 ， 但是最后一种需要重点掌握 ，以后会经常用到
*  匿名内部类 的格式
* new  类名或者接口名（）
* {
*   重写方法；
* }
*
* 匿名内部类 是隐藏了名字的内部类，可以写在成员位置，也可以写在局部位置
* 使用场景  当方法的参数是一个接口或者类时
* 以接口为例，可以传递这个接口的实现类对象，如果实现类只是使用一次，就可以用匿名内部类简化代码
*
* */
public class HNeiBuLei
{
    public static void main(String[] args)
    {
        new Swimming()
        {

            @Override
            public void Swimming() {
                System.out.println("hhh");
            }
        };
    }
}