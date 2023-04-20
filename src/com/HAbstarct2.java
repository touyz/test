package com;
/*
* 需求： 编写抽象类的标准的javabean类 青蛙 属性 名字 年龄  行为 吃虫子 喝水
* 狗 属性 名字 年龄  行为 吃骨头 喝水
* 山羊 属性 名字 年龄 行为 吃草 喝水
* 分析一下： 虽然这三种动物都要吃东西，但是吃的东西的内容是不一样的，所以可以把吃东西这个方法定义成抽象方法
* 而抽象方法所在的类必须是抽象类
* */

// 抽象类方法还有一个隐藏的作用 强制所有子类必须按照父类定义的格式进行重写 有统一的味道




public class HAbstarct2
{
    public static void main(String[] args)
    {
        Frog f=new Frog(2,"小青蛙");
        System.out.println(f.getAge()+","+f.getName());
        f.drink();
        f.eatDong();
    }
}
abstract class Animalss
{
    private int age;
    private String name;

    public Animalss() {
    }

    public Animalss(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void drink()
    {
        System.out.println("动物在喝水");
    }
    public abstract void eatDong();/*解释一下，因为吃东西这个方法是每个动物都吃的不一样
    所以肯定就是必须要在子类里重写这个方法，但是呢，害怕有些人不回去重写，所以就要把这个方法定义成抽象方法
    而当一个类中有了抽象方法的时候，那么这个类也必须是一个抽象类，只要定义了抽象方法，在子类中就必须要重写这个方法
    这个就是对于抽象的理解了*/
}
class Frog extends Animalss
{
    public Frog() {
    }

    public Frog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eatDong()
    {
        System.out.println("青蛙在吃虫子");
    }
}

class Dog1 extends Animalss
{
    public Dog1() {
    }

    public Dog1(int age, String name) {
        super(age, name);
    }

    @Override
    public void eatDong() {
        System.out.println("狗吃骨头");
    }
}

class Sheep extends Animalss
{
    public Sheep() {
    }

    public Sheep(int age, String name) {
        super(age, name);
    }

    @Override
    public void eatDong() {
        System.out.println("山羊在吃草");
    }
}