package com;

import java.util.Scanner;

/*
* 金额转换：
*
* */
public class HString5
{
    public static void main(String[] args)
    {
        //1.键盘录入一个金额
        Scanner sc=new Scanner(System.in);
        int i=0;
        while (true) {
            System.out.println("请输入你的金额");
             i=sc.nextInt();
            if(i>=0 && i<=9999999)
            {
                System.out.println("金额有效");
                break;
            }
            else
            {
                System.out.println("金额无效");
            }
        }
        //定义一个方法把数子写成大写的方法

    }
}
