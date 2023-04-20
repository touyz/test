package com.XiangMuPingTu;
/*
* 死锁不是一个知识点，而是一个错误。
*
* 多线程的生产者和消费者，也叫等待唤醒机制
*
*  消费者的执行原理，如果桌子上面有东西，那么就可以直接吃，如果没有那就先等待，等有了之后就可以直接吃
*
*  生产者也是一样的，先把东西放在桌子上面，叫消费者开吃
*
*  还有最后一种情况对于生产者来说就是，桌子上面已经有食物了，所以还是等待。
*
* 常见的三种方法: void wait() 当前的线程等待，知道被其他的线程唤醒
*
* void notify() 随机唤醒单个线程
*
* void notifyAll() 唤醒所有的线程
*
*
*
* */
public class HDuoXian12 {
    public static void main(String[] args) {

    }
}
