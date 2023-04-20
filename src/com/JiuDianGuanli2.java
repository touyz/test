package com;

import java.util.Scanner;

public class JiuDianGuanli2
{
    public static void main(String[] args)
    {
        Hotelss ho=new Hotelss();
        while (true) {
            System.out.println("1是订房");
            System.out.println("2是退房");
            System.out.println("3是查看房间");
            System.out.println("4是退出本系统");
            Scanner der = new Scanner(System.in);
            System.out.println("请选择");
            int derb = der.nextInt();
            if (derb == 1) {
                System.out.println("请输入你想要预定的房间");
                int sc = der.nextInt();
                ho.order(sc);
            } else if (derb == 2) {
                System.out.println("请输入你想要退的房间");
                int sc = der.nextInt();
                ho.remove(sc);
            } else if (derb == 3) {
                ho.print();
            } else if (derb == 4) {
                System.out.println("你已成功退出本系统");
                return;
            } else {
                System.out.println("输入错误，请重新输入");
            }
        }
    }
}
