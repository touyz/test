package com;
/*
*只要是类和类之间有共同的特性，并且子类是父类中的一种，就可以用这个继承的关系
* 继承的格式是： 子类  继承  父类  如：  public class yangyinguang extends yangjianlin
*而且杨建林会的杨银光都会，并且杨银光 还会其他的东西，这个就是 继承的玩法
*
* */
/*
*
* java只支持单继承不支持多继承，但是支持多层继承
*
* 单继承就是一个子类只能继承一个父类  意思就是 一个儿子只能那个有一个爸爸，杨银光只有一个爸爸杨建林
* 不支持多继承就是 一个子类不能有多个爸爸，杨银光只有一个爸爸就是杨建林，但是没有其他的爸爸了
* 但是可以支持多层继承就是  杨银光继承杨建林  杨建林继承杨天福 杨天福就是杨银光的间接父类
*
*注意了哈： 在Java中没有爷爷这一说的，因为如果有了的话，那么后面还有太爷爷，祖爷爷，太祖爷爷，多麻烦，
*
* 所以在Java中就只有子类 父类 间接父类这一说
*
* 在Java中还有一个祖宗类  Object
*
* 在子类当中只能访问父类非私有的成员
* */
public class HExtents1
{
    public static void main(String[] args)
    {
        buoucat a1=new buoucat();
        a1.drink();
        a1.eat();
        a1.playlaosu();
    }
}

class Animals
{
    public void eat()
    {
        System.out.println("吃饭");
    }
    public void drink()
    {
        System.out.println("喝水");
    }
}

class CatAnimals extends Animals
{
    public void playlaosu()
    {
        System.out.println("抓老鼠");
    }
}

class DogAnimals extends Animals
{
    public void seeHome()
    {
        System.out.println("看家");
    }
}

class buoucat extends CatAnimals
{

}
class LiHuacat extends CatAnimals
{

}

class hasiqo extends  DogAnimals
{
    public void playhome()
    {
        System.out.println("拆家");
    }
}

class teddy extends DogAnimals
{
    public void cengyicheng()   //如果这里的public 变成private的话 子类就访问不了了
    {
        System.out.println("蹭一蹭");
    }
}
