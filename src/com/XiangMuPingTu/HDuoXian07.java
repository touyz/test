package com.XiangMuPingTu;
/* final void setDaemon(boolean on) 设置为守护线程
 *  public static void yield()  出让线程/礼让线程
 * public static void join() 插入线程/ 插队线程
*  守护线程的应用场景是: 把聊天和发送软件都看作是一个线程，把聊天这个 窗口关闭了之后，这个发送消息也就没有必要存在了
*  说的通俗一点就是 把QQ看成是一个线程，然后，QQ里面的发消息是一个守护线程，我把QQ都已经关闭了，那么这个守护线程发消息
* 肯定就没有存在的必要了。
*
*
* */
public class HDuoXian07 {
    public static void main(String[] args) {
        // 设置线程的一个参数对象
        MyTheat1 t1=new MyTheat1();
        MyThreat2 t2=new MyThreat2();
        // 给t1和t2设置名字
        t1.setName("郭超坤");
        t2.setName("柴杜坤");
        // 给t2设置守护线程，说白了就是备胎线程，其实就是当那个不是守护线程的结束了之后，守护线程也就结束了
        t2.setDaemon(true);
        // 分别打印t1和t2
        t1.start();
        t2.start();
    }
}

class MyTheat1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}

class MyThreat2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}