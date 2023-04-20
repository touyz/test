/*
package com;

import java.util.Objects;
import java.util.Scanner;

*/
/*
* 为某个酒店编写程序：酒店管理系统，模拟订房，退房，打印所有房间状态等功能
* 酒店使用一个二维数组来模拟，"Room[][] room"
* 该系统的用户是酒店前台
* 酒店的每一个房间应该是一个Java对象 ：room
* 每一个房间room应该有：房间编号，房间类型属性，房间是否空闲
*
* 系统可以对外提供的功能
* 可以预定房间  用户输入房间编号，订房
* 可以退房，用户输入房间编号，退房
* 可以查看所有房间的状态，用户输入某个指令就可以看到所有房间的状态
* *//*

//一个酒店有很多层，并且每一层都有很多的房间，所以这就是一个二维数组。
public class JiuDianGuanLin {
    public static void main(String[] args) {
        //new一个酒店的对象
        Hotel der=new Hotel();
       // der.Dayin();//打印房间的状态
        while(true) {
            System.out.println("欢迎使用本酒店的管理系统，祝您愉快");
            System.out.println("******[1]查看房间******");
            System.out.println("******[2]预定房间******");
            System.out.println("******[3]退出房间******");
            System.out.println("******[0]结束系统******");
            java.util.Scanner sb = new java.util.Scanner(System.in);
            System.out.println("请选择");
            int sb1 = sb.nextInt();
            if (sb1 == 1) {
                der.Dayin();
            } else if (sb1 == 2) {
                System.out.println("请输入订1房的编号");
                int derb = sb.nextInt();
                der.Oder(derb);
            } else if (sb1 == 3) {
                System.out.println("请输入退房的编号");
                int derbs = sb.nextInt();
                der.Oder(derbs);
            } else if (sb1 == 0) {
                System.out.println("退出本系统");
                return;

            } else {
                System.out.println("输入错误，请重新选择");
            }
        }
    }
}


//定义一个房间类。
class Room
{
    private int number;//房间号  102 101 203 204 ....
    private String type;//房间的类型  普通间，总统套房  ，双人间  ，单人间
    private boolean status;//房间的状态，看是否是空闲的  true  表示空闲，可以预定  false 表示被占用，无法预定

    public Room() {//无参构造
    }

    public Room(int number, String type, boolean status) {//有参构造
        this.number = number;
        this.type = type;
        this.status = status;
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
    //重写equals 方法和 toString方法，这个和上面的无参和有参构造，加上set,get方法是一样的必须要求重写

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return getNumber() == room.getNumber() && getStatus() == room.getStatus() && Objects.equals(getType(), room.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getType(), getStatus());
    }

    @Override
    public String toString() {
        return "["+number+","+type+","+(status ? "空闲":"占用")+"]";
    }
}


//酒店中有二维数组，二维数组模拟大厦
class Hotel
{
    private String name;
    private Room[][] rooms;//二维数组，模拟房间

    public Hotel() {//无参构造方法
        rooms=new Room[3][10];//房间有3层，10间。动态初始化
        for(int a=0;a<rooms.length;a++)
        {
            for(int b=0;b<rooms[a].length;b++)
            {
                if(a==0)
                {
                    rooms[a][b]=new Room((a+1)*100+b+1,"单人间",true);
                }
                if(a==1)
                {
                    rooms[a][b]=new Room((a+1)*100+b+1,"双人间",true);
                }
                if(a==2)
                {
                    rooms[a][b]=new Room((a+1)*100+b+1,"总统套房",true);
                }
            }
        }
    }

    public  void Dayin()//遍历二维数组
    {
        for(int a=0;a<rooms.length;a++)
        {
            for(int b=0;b<rooms[a].length;b++)
            {
                System.out.print(rooms[a][b]);
            }
            System.out.println();
        }
    }

    public void Oder(int fangjianhao)//订房的方法,调用此方法就需要传递一个房间的编号。是前台小姐姐输入的。
    {
        //订房就是将true 变成 false
        Room room=rooms[fangjianhao/100-1][fangjianhao%100-1];//通过房间编号演算出下标
        room.setStatus(false);//订房，变成false
        System.out.println("该房间预定成功");
    }
    public void Exit(int fangjianhaos)
    {
        Room room=rooms[fangjianhaos/100-1][fangjianhaos%100-1];
        room.setStatus(true);//退房，变成true
        System.out.println("该房间退房成功");
    }
}
*/
