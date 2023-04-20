package com;

import java.util.Scanner;

/*
* 键盘录入一个字符串，然后遍历字符串
*
* */
public class HString3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个一句话");
        String st=sc.next();
        //遍历字符串
        for (int i = 0; i < st.length(); i++)
        {
            char d=st.charAt(i);
            System.out.println(d);
        }
    }
}
/*
* 键盘输入一个字符串，统计该字符中大写字母，小写字母，和数字出现的个数
*
* */
class der
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一句话");
        String st=sc.next();
        //定义三个变量，分别统计大写字母的个数，小写字母的个数，和数字出现的字数
        int count1=0;
        int count2=0;
        int count3=0;
        //遍历字符串
        for (int i = 0; i < st.length(); i++)
        {
            char ch=st.charAt(i);//遍历字符串中的每一个字符
            if(ch>='a' && ch<='z')
            {
                count1++;
            }
            else if(ch>='A' && ch<='Z')
            {
                count2++;
            }
            else if(ch>='0' && ch<='9')
            {
                count3++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}