package com;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/*
* 需求：定义一个方法，把int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，输出
*
* int[] arr={1,2,3};   执行之后是[1,2,3];
* */
public class HString4
{

}
/*
* 实现字符串的反转，键盘录入abc 输出cba
*
*
* */
class der1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String st=sc.next();

    }
    public static String fanzhuan(String a)
    {
        for (int i = a.length()-1; i >= 0; i--)
        {
            char der=a.charAt(i);
            System.out.println(der);
        }
        return " ";
    }
}