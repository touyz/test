package com;

import java.util.Random;

/*
* 需求：文字版格斗游戏，每个游戏角色的姓名，血量都不相同，在选定人物的时候，（new）对象的时候，这些信息就该被确定下来
* */
public class HDuiXiang1
{
    public static void main(String[] args)
    {
        Role r1=new Role("杨银光",1000);
        Role r2=new Role("黄朝飞",900);
        while (true)
        {
            r1.attack(r2);
            if(r2.getBlood()==0)
            {
                System.out.println("杨银光把黄朝飞打的妈都找不到了");
                break;
            }
            r2.attack(r1);
            if(r1.getBlood()==0)
            {
                System.out.println("杨银光是不小心才会输给你黄朝飞大胖子，你嚣张个der啊");
                break;
            }
        }
    }
}


class Role
{
    private String name;
    private int  blood;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public Role() {
    }
    //定义一个方法用于攻击别人 ,思考：谁攻击谁？
    //Role r1=new  Role();
    //Role r2=new  Role();
    //r1.attack(r2);  所以就是方法的调用者去攻击这个括号里面的参数。

    public  void attack(Role role)
    {
        Random r=new Random();
        int hurt=r.nextInt(51)+100;//造成的伤害是100-150
        int remainBoolod=role.getBlood()-hurt;
        remainBoolod=remainBoolod<0?0:remainBoolod;
        //修改一下被打的人的血量
        role.setBlood(remainBoolod);
        //这个this就是表示方法的调用者。
        System.out.println(this.getName()+"飞起一脚给了"+role.getName()+"造成"+hurt+"伤害"+role.getName()+"还剩下"
       +remainBoolod+"点血");
    }
}

//在写这个小游戏之前，我觉得很有必要回顾一下三元运算符，不然全部都忘完了，都不会写了

class SanMu
{
    public static void main(String[] args)
    {
        int a=10;
        int b=2;
        //先写一个关系表达式？表达式1：表达式2
        //结果如果是真就是表达式1，如果是假的就是表达式2，并且还要用一个数来接收这个值
        int der=a>b?a:b;
        System.out.println(der);
    }
}