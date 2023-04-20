package com.XiangMuPingTu;

import java.util.Scanner;

public class ChengJi02
{
    public static void main(String[] args)
    {
        while (true)
        {
            Scanner der=new Scanner(System.in);
            System.out.println("请输入你的分数,我会帮你来判断你的成绩等级");
            int derb=der.nextInt();
            switch (derb/10)
            {
                case 10:
                case 9:
                    System.out.println("你的成绩等级是A");break;
                case 8:
                    System.out.println("你的成绩等级是B");break;
                case 7:
                    System.out.println("你的成绩等级是C");break;
                case 6:
                    System.out.println("你的成绩等级是D");break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("你的成绩不及格");
                default:
                    System.out.println("你输入错误");
            }
        }
    }
}
