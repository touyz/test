/*
* 关于package 和import机制
* 比如说，你在开发的时候，会创建很多很多的类
* 为什么使用package ，package是Java中的包机制，作用是方便程序的管理，不同的软件包具有不同的功能
* 怎么用？ package 是一个关键字，后面加上包名
* 并且package 只能出现Java源代码的第一行。
* 包名的命名规范，一般都是公司域名，倒序的方式+项目名+模块名+功能名
*package com.hb.javase.chapter17
*说白了就是好找，不然你写了半天的代码却不知道在哪里找，这不就求了吗
*
*那么应当怎样编译和运行呢？
* 你需要重新建立目录，现在你还用不到
*经典白学，用idea里面啥都有，不用搞。
*
*关于import 的使用
*
*
* */


public class bajiZhi {
    public static void main(String[] args) {
        System.out.println("我以为完了想念，而面对夕阳，希望你回到今天");
    }
}
