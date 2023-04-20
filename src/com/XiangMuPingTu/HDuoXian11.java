package com.XiangMuPingTu;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* 如果想要手动的加锁或者手动的解锁  就就可以用新的锁的对象 Lock
* void lock() 获得锁
* void unlock() 释放锁
* 但是 lock是接口不能直接实例化，这里采用的是他的实现类 ReentrantLock 来实列化
*
*   ReentrantLock的构造方法
* ReentrantLock() 创建一个ReentrantLock 的实例
*
*
* */
public class HDuoXian11 {
    public static void main(String[] args) {
        // 创建线程的对象
        MyThreat t1=new MyThreat();
        MyThreat t2=new MyThreat();
        MyThreat t3=new MyThreat();
        // 给对象起名字
        t1.setName("李易峰");
        t2.setName("黄忠海");
        t3.setName("漳泉溪");
        // 开始
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThreats extends Thread{
    static int ticket=0;
    // 给用枷锁
    static Lock lock=new ReentrantLock();
    @Override
    public void run() {
        // 循环
        while (true){
            // 同步代码块
            //synchronized (MyThreat.class){
            lock.lock(); // 直接上锁
                // 判断
            try {
                if(ticket==100){

                        Thread.sleep(10);

                }
                else{
                    ticket++;
                    System.out.println(Thread.currentThread().getName()+"正在卖"+ticket+"票");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock(); // 释放锁
            }
            //}

        }
    }
}





