package com;
/*
* 定义一个数组，存储3部手机对象，手机的属性： 品牌，价格，颜色
* 要求是计算3部手机的平均价格
* */
public class HDuiXiang4
{
    public static void main(String[] args)
    {
        Phone[] arr=new Phone[3];//定义一个数组，并且存储3部手机的信息
        Phone p1=new Phone("小米",1288.1,"紫色");//创建了3个对象
        Phone p2=new Phone("苹果",3288.1,"灰色");
        Phone p3=new Phone("华为",2288.1,"蓝色");
        //把手机对象添加到数组当中。
        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p3;
        int sum=0;
        for (int i = 0; i < arr.length; i++)
        {
            Phone p4=arr[i];
            sum+=p4.getPrice();
        }
        double average =sum*1.0/arr.length;
        System.out.println(average);
    }
}

class Phone
{
    private String brand;
    private Double price;
    private String colour;

    public Phone() {
    }

    public Phone(String brand, Double price, String colour) {
        this.brand = brand;
        this.price = price;
        this.colour = colour;
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
