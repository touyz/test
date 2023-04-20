package com.XiangMuPingTu;
/*
* 并发和并行
* 并发： 在同一时刻，有多个指令在单个cpu上交替的执行
*
* 并行 ： 在同一时刻，有多个指令在多个cpu上同时执行
* 多线程的实现方式
*
*
* */
public class HDuoXian2 {
    public static void main(String[] args) {
        // 多线程的第一种启动方式
        // 1 自己定义一个类继承Thread
        // 2 重写run方法
        // 3 创建子类的对象
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.setName("黄忠海");
        t2.setName("漳泉溪");
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        // 书写线程要执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"HelloWorld");
        }
    }
}

























