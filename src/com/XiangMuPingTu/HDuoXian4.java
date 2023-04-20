package com.XiangMuPingTu;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
*第三种方式  特点  可以得到多线程运行的结果
* 1 创建一个 MyCallable 实现 Callable接口
* 2 重写  call   这个是有返回值的，是可以返回多线程的结果
* 3 创建MyCallable 对象 就可以表示 多线程要执行的结果
* 4 创建FutureTask的对象  作用是管理多线程运行的结果
* 5 创建一个Thread 的对象，并启动  表示线程
*
* */
public class HDuoXian4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable fc=new MyCallable();
        FutureTask<Integer> ft=new FutureTask(fc);
        // 创建线程的对象
        Thread t1=new Thread(ft);
        // 启动线程
        t1.start();
        // 获取结果
        Integer result = ft.get();
        System.out.println(result);
    }
}


class MyCallable implements Callable<Integer>{

    public MyCallable() {
    }

    @Override
    public Integer call() throws Exception {
        // 求1-100的和
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            sum=sum+i;
        }
        return sum;
    }
}