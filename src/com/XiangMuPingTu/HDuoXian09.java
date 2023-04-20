package com.XiangMuPingTu;
/*
* 现成的生命周期  说白了就可以当成是人的一生，人的一生是由小孩，少年，青年，中年和老年组成的，
* 其实线程的生命周期其实也是一样的，也是有多种的状态组成的。
*
* 创建线程的对象-> 有资格或者没有资格来执行-> 如果抢到了CPU的有运行权-> 运行完毕-> 线程死亡，变成rubbish
*
* 线程的安全问题:
* 需求: 某电影院正在卖电影票 共有100张票，然后有3个窗口，请设计一个电影院买票
* 买票引来的安全问题: 会重复票，因为线程执行的时候是会有随机性的。
* 那到底该怎么改呢? 很简单把操作共享的代码给锁起来，就是说白了你如果2个人去上厕所，但是只有一个坑，你主要抢到了
* 把门给锁起来就行了，是吧。
*
* 同步代码块：
* 格式：
* synchronized(锁){
*   共享的数据的代码
* }
*
*
*
* */
public class HDuoXian09 {
    public static void main(String[] args) {

        // 创建线程的对象
        MyThreat t1=new MyThreat();
        MyThreat t2=new MyThreat();
        MyThreat t3=new MyThreat();
        // 给线程起名字
        t1.setName("忘忧君");
        t2.setName("不夜侯");
        t3.setName("扶摇");
        // 开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThreat extends Thread{
    // 定义变量票
    static int ticket=0;
// 创建一个锁对象，但是这个锁对象一定是要唯一的
    static Object obj=new Object();
    @Override
    public void run() {
      while (true) {
          synchronized (obj){
              if(ticket<100)
              {
                  try {
                      Thread.sleep(50);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  ticket++;
                  System.out.println(getName()+"正在卖第"+ticket+"票");
              }
              else{
                  break;
              }
          }
          }
      }
    }


