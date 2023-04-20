package com.XiangMuPingTu;
import java.util.Scanner;
public class FangF001{
    public static void main(String args[])
    {
        int num;         //定义任意整数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        num=sc.nextInt();
        if(num==0)
            System.out.print("该数是偶数！");
        else if(num%2 == 0)
            System.out.println("该数是偶数！");
        else if(true)
            System.out.println("该数是奇数！");
    }
}
