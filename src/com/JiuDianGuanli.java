/*

package com;

import java.util.ArrayList;
import java.util.Scanner;

public class JiuDianGuanli
{
    public static void main(String[] args)
    {
        ArrayList<Hotels> hotels=new ArrayList<>();//创建一个集合
        while(true) {
            System.out.println("1是选择订房");
            System.out.println("2是选择退房");
            System.out.println("3是选择查看房间");
            System.out.println("4是退出本酒店管理系统");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的选择");
            int der = sc.nextInt();
            if (der == 1) {
                Hotels.addRoom(hotels);
            } else if (der == 2) {
                Hotels.removeRoom(hotels);
            } else if (der == 3) {
                Hotels.getRoom(hotels);
            } else if (der == 4) {
                System.out.println("退出本酒店管理系统");
                return;
            } else {
                System.out.println("选择错误，请重新选择");
            }
        }
    }
}
*/

