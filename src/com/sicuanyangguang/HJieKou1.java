package com.sicuanyangguang;
/*
* 接口就是一种规则:
* 谈一谈理解：比如说吧，我有一个父类车 车可以搬家，还有许多的车的子类也可以搬家，比如三轮，卡车....
* 但是我直接定义一个接口 人 ，现在人也能搬家了，然后我可以让任意的事物都来使用这个接口，达到搬家这个目的，这就是接口
*
* 如何定义一个接口 用关键字 interface  public interface 接口名{}  接口不能创建对象
* 如何使用一个接口
* 接口里面成员的特点
* 接口和类之间是实现的关系 通过implements 来表示
* 比如： public class 类名 implements 接口名1,接口名2{}  接口是支持多个接口的的
*
* 接口的子类也叫做实现类
* 接口的子类还可以继承一个类同时实现多个接口
* 比如： public class 类名 extents 父类 implements 接口1 ，接口2 {}
*
* 需求： 编写一个带有接口和抽象类的标准javabean
* 青蛙 属性 名字  年龄  行为 吃虫子 蛙泳
* 狗 属性 名字 年龄 行为 吃骨头 狗刨
* 兔子 属性 姓名 年龄 行为 吃胡萝卜
*
* */
public class HJieKou1
{
    public static void main(String[] args)
    {
        Frog1 a=new Frog1("黄朝飞",23);
        a.eating();
        a.Swimming();
        System.out.println(a.getAge()+"的"+a.getName()+"正在吃屎");
    }
}

abstract class Animals
{
    private String name;
    private int age;

    public Animals() {
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void eating();//直接写成抽象类
}

class Frog1 extends Animals implements Swimming//如果你以后需要实现多个接口的话，直接到后面加上就行了
    //比如往Swimming,jiekou2,jiukou3....
{
    public Frog1() {
    }

    public Frog1(String name, int age) {
        super(name, age);
    }

    @Override
    public void eating()
    {
        System.out.println(getAge()+"的"+getName()+"正在吃虫子");
    }

    @Override
    public void Swimming()
    {
        System.out.println(getAge()+"的"+getName()+"正在蛙泳");
    }
}
class Dogs extends Animals implements Swimming
{
    public Dogs() {
    }

    public Dogs(String name, int age) {
        super(name, age);
    }

    @Override
    public void eating() {
        System.out.println(getAge()+"的"+getName()+"正在吃骨头");
    }

    @Override
    public void Swimming()
    {
        System.out.println(getAge()+"的"+getName()+"正在狗刨");
    }
}
class rabbits extends Animals
{
    public rabbits() {
    }

    public rabbits(String name, int age) {
        super(name, age);
    }

    @Override
    public void eating()
    {
        System.out.println(getAge()+"的"+getName()+"正在吃胡萝卜");
    }
}
