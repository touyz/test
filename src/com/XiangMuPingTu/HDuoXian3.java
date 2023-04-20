package com.XiangMuPingTu;
/*
* 多线程的第二种启动方式
* 1 自己定义一个类实现Runnable接口
* 2 重写里面的run方法
* 3 创建自己的类对象
* 4 创建一个Thread类的对象，并开启线程
*
*
* */
public class HDuoXian3 {
    public static void main(String[] args) {
            MyRun mr=new MyRun();

            Thread t1=new Thread(mr);
            Thread t2=new Thread(mr);
            // 开启线程

        t1.setName("黄忠还");
        t2.setName("呈现还");
        t1.start();
        t2.start();
    }
}

class MyRun implements Runnable{

    @Override
    public void run() {
        // 书写线程要执行的代码
        for (int i = 0; i < 100; i++) {
            // 获取的就是当前线程的对象
            Thread t=Thread.currentThread();
            System.out.println(t.getName()+"HelloWorld");
        }
    }
}
