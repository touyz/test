package com;

import java.util.Random;//这个是idea自动生成导的包，不然的话，你就要像普通记事本那样写出来了

public class HRandomTest
{
    public static void main(String[] args)
    {
        //获取一个随机数
        Random r=new Random();//创建一个对象
        int number=r.nextInt(10);//表示的就是从0-9这个范围获取一个随机值，包括0，包括9
        System.out.println(number);
    }
}