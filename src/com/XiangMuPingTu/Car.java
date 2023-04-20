package com.XiangMuPingTu;

public class Car {
    String name;
    double price;
    public Car(){
        System.out.println("无参构造器");
    }
    public Car(String n,double p){
        System.out.println("有参构造器1");
        name=n;
        price=p;
    }
    public Car(String n){
        System.out.println("有参构造器2");
        name=n;
    }
    public Car(double p){
        System.out.println("有参构造器3");
        price=p;
    }
    public void start(){
        System.out.println(name+"启动了");
    }
    public void run(){
        System.out.println("价格是"+price+"的");
    }
}

















