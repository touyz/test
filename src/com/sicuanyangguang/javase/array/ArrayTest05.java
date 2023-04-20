package com.sicuanyangguang.javase.array;
/*
* main方法上面的String[] args  有什么用？
* JVM调用main方法的时候会自动传一个string数组
* 而JVM会默认的长度是args ,而args 的长度不是null,不会出现空指针异常。长度是0.
* */
public class ArrayTest05 {
    public static void main(String[] args) {
        System.out.println(args.length);
    }
}
