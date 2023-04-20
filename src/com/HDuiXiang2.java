package com;

import java.util.Objects;

//主要是写一下对象数组的练习，不然都话，啥都不会。
//定义一个数组，存储3个商品对象，属性: Id,名字，价格，库存，创建3个商品对象，并存到数组当中去
public class HDuiXiang2
{
    public static void main(String[] args) {
        Goods[] arr1=new Goods[3];//动态初始化，长度是3,创建一个数组
        //创建3个商品对像
        Goods g1=new Goods("aaa","苹果",10.3,20);
        Goods g2=new Goods("bbb","梨子",2.3,3);
        Goods g3=new Goods("ccc","香蕉",4.4,8);
        //把商品添加到数组当中
        arr1[0]=g1;
        arr1[1]=g2;
        arr1[2]=g3;
        //遍历
        for (int i = 0; i < arr1.length; i++) {
            //i是数组当中的索引（下标），arr[i]表示的数组当中的元素
            Goods good=arr1[i];//一定要用东西接受，不然就是全部是地址
            System.out.println(good.getId()+","+good.getName()+","+good.getPrice()+","+good.getKunCun());
        }
    }


}

class Goods
{
    private String id;
    private String name;
    private Double price ;
    private int  kunCun;

    public Goods() {
    }

    public Goods(String id, String name, Double price, int kunCun) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.kunCun = kunCun;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getKunCun() {
        return kunCun;
    }

    public void setKunCun(int kunCun) {
        this.kunCun = kunCun;
    }

    @Override
    public String toString() {
        return id+","+name+","+price+","+kunCun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Goods)) return false;
        Goods goods = (Goods) o;
        return getKunCun() == goods.getKunCun() && Objects.equals(getId(), goods.getId()) && Objects.equals(getName(), goods.getName()) && Objects.equals(getPrice(), goods.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPrice(), getKunCun());
    }
}


/*
*
* 在这之前再把这个this给回顾一下，不然又忘完了。
* 比如说吧
* public class der
* {
*   int age=1;  //成员变量
*   public staitc void main()
*       {
*           int age=3;//局部变量
*           System.out.println(age);   //这里打印的就是局部变量，因为就近原则嘛
*       }
* }
*但是你如果想要用成员变量的话，就在前边加上this.就行了
* 但是如果这个代码中没有局部变量，只有成员变量的话，那么就可以省略this.不写了
*this是通常表示当前方法的调用者
* */