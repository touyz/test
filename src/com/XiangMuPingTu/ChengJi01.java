package com.XiangMuPingTu;

import java.util.Scanner;

public class ChengJi01 {
    public static void main(String[] args)
    {
       while (true)
       {
           Scanner der=new Scanner(System.in);
           System.out.println("请输入你的分数,我会帮你来判断你的等级");
           int derb=der.nextInt();
           if(derb>=90)
           {
               System.out.println("你的成绩是A等级");
           }
           else if(derb>=80)
           {
               System.out.println("你的成绩是B等级");
           }
           else if(derb>=70)
           {
               System.out.println("你的成绩是C等级");
           }
           else if(derb>=60)
           {
               System.out.println("你的成绩是D等级");
           }
           else
           {
               System.out.println("你的成绩是不及格的");
           }
       }
    }
}
