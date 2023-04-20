package com.XiangMuPingTu;
/*
* 常见的成员方法
* String getName() 返回此线程的名称
* void setName(String name) 设置线程的名字(构造方法也是可以设置名字)
* static Thread currentThread() 获取当前的线程的对象
* static void sleep(long time) 让线程休眠指定的时间，单位为毫秒
*  setPriority(int newPriority) 设置线程的优先级
* final int getPriority() 获取线程的优先级
* final void setDaemon(boolean on) 设置为守护线程
*  public static void yield()  出让线程/礼让线程
* public static void join() 插入线程/ 插队线程
*
*
* */
public class HDuoXian5 {
    public static void main(String[] args) {
        // 创建线程的对象
            MyThread t1=new MyThread();
            MyThread t2=new MyThread();
            // 开启线程
        t1.start();
        t2.start();
    }
}
class MyThred extends Thread{
    public MyThred() {
    }

    public MyThred(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}
// 1秒=1000毫秒

