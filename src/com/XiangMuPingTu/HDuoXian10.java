package com.XiangMuPingTu;
/*
*
* 细节一: synchronized 这个同步代码块是不能放在循环的外面的
* 细节二: 这个锁的对象一定是要唯一的。不然的话，就会有重复的了   一般情况下可以当前类.class 来表示
* 同步方法: 直接把synchronized写到方法的上面
* 但是有两个特点: 同步方法是锁主方法里面的所有的代码  2 锁对象不能自己指定，是java已经规定好了的
* 非静态就是this  静态就是 当前类.class
*
* */
public class HDuoXian10 {
    public static void main(String[] args) {
        // 创建参数的对象
         MyRuannable mr=new MyRuannable();
         // 创建线程的对象
        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);
        Thread t3=new Thread(mr);
        //创建对象的名字
        t1.setName("天马");
        t2.setName("玉佛");
        t3.setName("升空");
        // 最后再启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
class MyRunnable implements Runnable{
    // 定义一个变量
    int ticket=0;

    @Override
    public void run() {
        // 写循环
        while (true){

                if (method()) break;
            }
        }
        // 写同步代码块(放到同步方法种就行了)
        // 判断共享数据是否到了末尾
    // control alt m 直接变成方法

    private synchronized boolean method() {
        if(ticket==100){
            return true;
        }
        else {
            ticket++;
            System.out.println(Thread.currentThread().getName()+"正在卖"+ticket+"票");
        }
        return false;
    }
}
