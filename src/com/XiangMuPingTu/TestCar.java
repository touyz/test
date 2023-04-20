package com.XiangMuPingTu;

public class TestCar {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.name="宝马";
        c1.price=200;
        System.out.println(c1.name);
        System.out.println(c1.price);
        c1.start();
        c1.run();
        System.out.println("---------------");
        Car c2=new Car("本次",2000);
        System.out.println(c2.name); 
        System.out.println(c2.price);
        c2.start();
        c2.run();
        System.out.println("-----------------------");
        Car c3=new Car("长城");
        System.out.println(c3.name);
        System.out.println(c3.price);
        System.out.println("-------------");
        Car c4=new Car(15);
        System.out.println(c4.name);
        System.out.println(c4.price);
    }
}
