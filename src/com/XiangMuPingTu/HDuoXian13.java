package com.XiangMuPingTu;

import java.util.concurrent.locks.Lock;

/*
* 需求: 完成生产者和消费者等待唤醒机制的代码
* 实现线程轮流交替执行的效果
*
* */
public class HDuoXian13
{
    public static void main(String[] args)
    {
        // 首先要完成这个需求的话，需要进行创建3个类，生产者类，消费者类，再来个放东西的桌子类
        // 创建线程的对象
        Cook c1=new Cook();
        Food f1=new Food();
        // 给线程设置名字
        c1.setName("童子");
        f1.setName("以为");
        // 开启线程
        c1.start();
        f1.start();
    }
}

class Cook extends Thread
{
    @Override
    public void run()
    {
        /*
        * 1 写一个循环
        * 2 写一个同步代码块
        * 3 判断共享数据是否到了末尾 ，可以先写到了末尾的情况，因为这样写会更加的简单
        * 4 判断共享数据是否到了末尾，写没有到了末尾的情况，执行题目的核心逻辑
        *
        * */
        while (true)
        {
            synchronized (Desk.obj)
            {
                if(Desk.count==0)
                {
                    break;
                }
                else
                {
                    // 先去判断桌子上是否有东西，如果有就开吃，如果没有就等待
                    // 如果有就可以开吃，然后吃完了之后，就可以唤醒厨师继续做，把吃的总数-1，最后
                    // 修改桌子的状态，如果是0，就没有吃的，如果是1，就是有吃的
                    if(Desk.foodFlag==0)
                    {
                        try {
                            Desk.obj.wait();// 让当前线程和锁进行绑定
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Desk.obj.notify();

                    }
                    else
                    {
                        Desk.count--;

                        System.out.println("黄朝飞大胖纸正在开吃，还能再吃"+Desk.count+"碗");

                        Desk.obj.notify();

                        Desk.foodFlag=0;
                    }
                }
            }
        }
    }
}

class Food extends Thread{
    @Override
    public void run() {
        while (true)
        {
            synchronized (Desk.obj)
            {
                if(Desk.count==0)
                {
                    break;
                }
                else
                {
                    // 先去判断桌子上是否有东西，如果有就开吃，如果没有就等待
                    // 如果有就可以开吃，然后吃完了之后，就可以唤醒厨师继续做，把吃的总数-1，最后
                    // 修改桌子的状态，如果是0，就没有吃的，如果是1，就是有吃的
                    if(Desk.foodFlag==1)
                    {
                        try {
                            Desk.obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    else
                    {
                        System.out.println("厨师做了一碗面条");
                        Desk.foodFlag=1;
                        Desk.obj.notify();
                    }
                }
            }
        }
    }
}

class Desk extends Thread{
    // 作用就是用来控制生产者和消费者的一个执行
    // 这个变量就是表示桌子上面是否有东西，如果是0就是没有，如果不是0就表示有

    public static int foodFlag=0;
    // 定义一个变量，用来表示东西的个数,表示做多可以吃10个
    public static int count=10;
     // 写一个锁的对象
    public static Object obj=new Object();

}


















