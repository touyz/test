/*
package com;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotels
{
    private int number;
    private String type;
    private boolean status;

    public Hotels(int number, String type, boolean status) {
        this.number = number;
        this.type = type;
        this.status = status;
    }

    public Hotels() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public static void addRoom(ArrayList<Hotels> hotels)//预定房间的一个方法
    {
       Hotels room=new Hotels();//先是写了一个新的房间对象
        Scanner s=new Scanner(System.in);//定
        System.out.println("请输入你添加房间号");
        int num=s.nextInt();
        room.setNumber(num);
        System.out.println("请输入你要添加房间的类型");
        String st=s.next();
        room.setType(st);
        System.out.println("请输入添加房间的状态");
        boolean bo=s.hasNext();
        room.setStatus(bo);//现在这个对象都已经有内容了，而且内容是自己输入的
        hotels.add(room);
    }
    public static void removeRoom(ArrayList<Hotels> hotels)//退出房间的一个方法
    {
        Hotels ho=new Hotels();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要退出的一个房间");
        int f=sc.nextInt();
        ho.setNumber(f);
        int der=onlys(hotels,f);
        {
            if(der>=0)
            {
                hotels.remove(f);
                System.out.println("删除成功");
            }
            else
            {
                System.out.println("不存在");
            }
        }

    }
    public static void getRoom(ArrayList<Hotels> hotels)//查看房间
    {
        if(hotels.size()==0)
        {
            System.out.println("该房间未添加，请添加后再来查询");
            return;
        }
        System.out.println("房间序号\t\t房间类型\t\t房间的状态");
        for(int a=0;a<hotels.size();a++)
        {
            Hotels ho=hotels.get(a);
            System.out.println(ho.getNumber()+"\t\t"+ho.getType()+"\t\t"+ho.getStatus());
        }
    }
    public static int onlys(ArrayList<Hotels> hotels,int rooms)//说白了就是说查找Id的唯一性，找索引找下标的
    {
        for(int a=0;a<hotels.size();a++)
        {
            Hotels kunling=hotels.get(a);
            int der=kunling.getNumber();
            if(der==rooms)
            {
                return a;
            }
        }
        return -1;
    }
    public static boolean onlyss(ArrayList<Hotels> hotels,int rooms)
    {
        for (int a=0;a<hotels.size();a++)
        {
            Hotels ho2=hotels.get(a);//把对象在集合里面找
            int ho3=ho2.getNumber();//房间号在Id里面找
            if(ho3==rooms)
            {
                return true;
            }
        }
        return false;
    }
}
*/
