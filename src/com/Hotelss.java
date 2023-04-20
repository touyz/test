package com;

public class Hotelss
{
    private Room[][] room;//动态定义

    public Hotelss()
    {
        room=new Room[3][10];//现在还没有房间，只是动态初始化。
        for (int i = 0; i < room.length; i++)
        {
            for (int j = 0; j < room[i].length; j++)
            {
                if(i==0)
                {
                    room[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", true);
                }
                else if(i==1)
                {
                    room[i][j] = new Room((i + 1) * 100 + j + 1, "双人间", true);
                }
                else if(i==2)
                {
                    room[i][j] = new Room((i + 1) * 100 + j + 1, "总统套房", true);
                }
            }
        }
    }
    public  void print()
    {
        for (int i = 0; i < room.length; i++)
        {
            for(int j=0;j<room[i].length;j++)
            {
                Room rooms=room[i][j];
                System.out.print(rooms);
            }
            System.out.println();
        }
    }
    public void order(int number)//订房单方法，就是将status的true变成false
    {
        Room ro=room[number/100-1][number%100-1];
        ro.setStatus(false);
    }
    public void remove(int number)//退房的方法
    {
        Room ro=room[number/100-1][number%100-1];
        ro.setStatus(true);
    }
}
