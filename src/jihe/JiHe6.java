package jihe;

import java.util.ArrayList;

/*
* 需求： 定义一个手机类，phone javabean
* phone的属性是  ： 皮牌和价格
*
* main方法中定义一个集合，集合里面有三个手机对象。
* 分别是小米1000 苹果8000 锤子2999
* 定义一个方法将低于3000的手机信息返回
*
* */
public class JiHe6
{
    public static void main(String[] args)
    {
        ArrayList<phone> kungling=new ArrayList<>();
        phone sb1=new phone("小米",1000);
        phone sb2=new phone("苹果",8000);
        phone sb3=new phone("洛基亚",2999);
        kungling.add(sb1);
        kungling.add(sb2);
        kungling.add(sb3);
        ArrayList<phone> liba=phone.fanhui(kungling);
        for(int a=0;a<liba.size();a++)
        {
            System.out.println(liba.get(a).getPrice()+","+liba.get(a).getBrand());
        }
    }
}


class phone
{
    private String brand;
    public int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public phone() {
    }

    public static ArrayList<phone> fanhui(ArrayList<phone> der)
    {
        ArrayList<phone> kaiyuanshenshi =new ArrayList<>();
        for(int a=0;a<der.size();a++)
        {
            phone gaya=der.get(a);
            int dijia=gaya.getPrice();
            if(dijia<3000)
            {
                kaiyuanshenshi.add(gaya);
            }
        }
        return kaiyuanshenshi;
    }

}
//技巧：如果需要返回多个数据的话，可以把这些数据放到一个容器当中，然后再返回这个容器。
