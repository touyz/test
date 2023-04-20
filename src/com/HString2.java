package com;

import java.util.Scanner;

/*
* 已知正确的用户名和密码，总共有三次机会，登录之后，给出提示,日常生活中的程序也是这个逻辑，很简单，但是也很重要。
*
* */
public class HString2
{
    public static void main(String[] args)
    {
        String user="杨银光";
        String mima="1234r4";
        Scanner sc=new Scanner(System.in);
        for(int a=0;a<3;a++)
        {
            System.out.println("请输入你的用户名");
            String der=sc.next();
            System.out.println("请输入你的密码");
            String der1=sc.next();
            if(user.equals(der) && mima.equals(der1))
            {
                System.out.println("登录成功");
                break;
            }
            else
            {
                if(a==2)
                {
                    System.out.println("账号被锁定");
                }
                else
                {
                    System.out.println("账号或者密码错误，请重新输入,你还剩"+(2-a)+"次机会");
                }

            }
        }
    }
}
