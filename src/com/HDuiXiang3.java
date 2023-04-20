package com;

import java.util.Scanner;

/*
* 定义数组存储3部汽车对象，汽车的属性有：品牌，价格，颜色，创建3个汽车对象，数据通过键盘录入得到，并把数据存到数组当中
* */
public class HDuiXiang3
{
    public static void main(String[] args)
    {
        Car[] arr=new Car[3];//定义数组并且是长度为3的数组
        Scanner sc=new Scanner(System.in);
        for (int a=0;a<arr.length;a++) {

            System.out.println("请输入汽车的品牌");
            String s1 = sc.next();
            System.out.println("请输入汽车的价格");
            double s2 = sc.nextDouble();
            System.out.println("请输入汽车的颜色");
            String s3 = sc.next();
            Car c1 = new Car(s1, s2, s3);//往对象里面赋值，注意了创建对象的时候一定要放在循环里面。
            arr[a] = c1;//存到数组里面
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            Car c2=arr[i];
            System.out.println(c2.getBrand()+","+c2.getColour()+","+c2.getPrice());
        }
    }
}

class Car
{
    private String brand;
    private Double price;
    private String colour;

    public Car(String brand, Double price, String colour) {
        this.brand = brand;
        this.price = price;
        this.colour = colour;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

