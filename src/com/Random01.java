package com;

import java.util.Random;
import java.util.Scanner;

public class Random01
{
    public static void main(String[] args)
    {
        Random r=new Random();
        int i = r.nextInt(100)+1;
        Scanner der=new Scanner(System.in);
        while (true)
        {
            System.out.println("请输入1-100之间的的整数");
            int i1 = der.nextInt();
            if(i1>i)
            {
                System.out.println("数字大了");
            }
            else if(i1<i)
            {
                System.out.println("数字小了");
            }
            else
            {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
