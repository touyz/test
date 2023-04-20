package com.sicuanyangguang;
/*
*object  是Java中的顶级父类  一共有11 个成员方法
* toString equals clone
*
* toString 方法 的主要作用是： 调用toString方法的作用是什么？
* 父类中的方法如果不能满足 ，就可以重写toString 方法
* toString 方法的结论，再重写的方法中，把对象的属性进行拼接
* 克隆对象
*
*
* */
public class HAPI3
{
    public static void main(String[] args)
    {
        Object ob=new Object();
        String st=ob.toString();
        System.out.println(st);

    }
}
/*
* stringBuilder  提高字符串的效率。
*
* */