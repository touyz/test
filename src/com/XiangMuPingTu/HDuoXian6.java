package com.XiangMuPingTu;
/*
* 线程的一个优先级
* java中采用的是抢占性调度，说白了就是随机
*  setPriority(int newPriority) 设置线程的优先级
 * final int getPriority() 获取线程的优先级
*
* */
public class HDuoXian6 {
    public static void main(String[] args) {
        // 创建需要执行的参数对象
        MyRuannable mr=new MyRuannable();
        // 创建线程需要执行的参数对象
        Thread t1=new Thread(mr,"坤坤");
        Thread t2=new Thread(mr,"中分");
        // 现在给线程来设置优先级
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
    }
}

class MyRuannable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
