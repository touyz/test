package com;
/*
* 这一章节是java中的字符串的一个章节，黑马程序员说了，java不会字符串，开发必定凉一半
*
* 创建String类的两种方式
*
* */
public class HString
{
    public static void main(String[] args)
    {
        //第1种方法,直接赋值
        String a="eee";
        System.out.println(a);
        //第二种方式，空参获取对象
        String d=new String();
        System.out.println(d);
        //第三种，这个很重要
        char[] ch={'a','b','c','d'};
        String d1=new String(ch);
        System.out.println(d1);//就变成了“abcd”
    }
}
/*
* 对于==号来说，在基本数据类型中来说比较的是数据值，在引用数据类型中来说比较的是地址值。
*想要比较两个对象的内容的话，就要equals,必须要完全一样，equalsIgnoreCase忽略大小写（只能是英文状态下），可以用在验证码当中
*
* s1.equals(s2);
* */