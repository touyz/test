package com.sicuanyangguang;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame
{
    // 准备牌 ，静态代码块，随着类的加载而加载，并且指挥执行一次
    // 创建一个牌盒，也就是集合
    static ArrayList<String> list=new ArrayList<>();
    static
    {
        String[] color={"♦","♣","♥","♠"}; // 放花色的数组
        String[] number={"3","4","5","6","7","8","9","10","J","Q","k","A","2"}; // 放数字的数组

        // 进行数组的循环遍历
        for (String s : color)
        {
            // s 依次表示每种huase
            for (String s1 : number)
            {
                // s1,依次表示每种数字
                list.add(s+s1);  // 直接就放到集合里面进行遍历输出
            }
        }
        list.add("大王");
        list.add("小王");
    }
    public PokerGame()
    {
        // 洗牌
        Collections.shuffle(list);
        // 发牌, 准备四个集合，3个人的牌加上底牌
        ArrayList<String> landlord=new ArrayList<>();
        ArrayList<String> player1=new ArrayList<>();
        ArrayList<String> player2=new ArrayList<>();
        ArrayList<String> player3=new ArrayList<>();
        // 遍历牌盒，得到每一张牌
        for (int i = 0; i < list.size(); i++)
        {
            // i 就是索引
            String poker = list.get(i);
            if(i<=2)
            {
                landlord.add(poker);
                continue;
            }
            // 给三个玩家轮流发牌
            if(i%3==0)
            {
                player1.add(poker);
            }
            else if(i%3==1)
            {
                player2.add(poker);
            }
            else if(i%3==2)
            {
                player3.add(poker);
            }
        }
        // 看牌
        lookPoker("底牌",landlord);
        lookPoker("杨向南",player1);
        lookPoker("梁子阳",player2);
        lookPoker("楚浮光",player3);
    }
    // 第一个参数是玩家的名字，第二个参数是牌的集合
    public void lookPoker(String name,ArrayList<String> list)
    {
        System.out.print(name+": ");
        for (String s : list)
        {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
