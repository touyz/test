package com;

import java.util.Random;
import java.util.Scanner;

public class HRandomYouXi //这一节课玩的是猜数字的小游戏，有点简单，范围是1-100
{
    public static void main(String[] args)
    {
        //生成一个1-100范围的数字
        Random r=new Random();//这个如果写到循环的里面的话，那么每一次都会生成随机数，你是猜不中的，就像王者荣耀的
        //猜水晶，但是王者荣耀的猜水晶是到360，强行让你猜中，那我这里也可以搞一个强行让你猜中。
        int number=r.nextInt(100)+1;
        // 猜数字，采取键盘录用的方式
        int count=0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入1-100的数字，猜对了又奖励哦");
            int figure = sc.nextInt();
            count++;
            if(count==10)
            {
                System.out.println("强行让你猜中");
                return;
            }
            if (figure > number) {
                System.out.println("猜大了");
            } else if (figure < number) {
                System.out.println("猜小了");
            } else if (figure == number) {
                System.out.println("奖励你一个小爱心");
                return;
            }
        }
    }
}
