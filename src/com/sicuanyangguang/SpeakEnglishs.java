package com.sicuanyangguang;

public interface SpeakEnglishs
{
    public abstract void speak();
    public default void show() //自定义方法
    {
        System.out.println("接口的方法体");
    }
    public static void der()//接口当中的静态方法
    {
        System.out.println("dd");
    }
}
