package com;
/*

1.定义狗类：属性：年龄和颜色 行为吃(String something) 看家(无参)
1.定义猫类：属性：年龄和颜色 行为吃(String something) 捉老鼠(无参)
3.定义Person类，就是饲养员， 属性： 姓名和年龄 行为 喂狗和喂猫
4.定义测试类：
定义打印方法一的内容是：
年龄为30岁的老王养了一只黑颜色的2岁的狗，2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
定义打印方法二的内容是：
年龄为25岁的老李养老一只灰颜色的3岁的猫，3岁的灰颜色的猫眯着眼睛侧着头吃鱼
*
* */
public class HDuoTai3
{
    public static void main(String[] args)
    {

    }
}
class Animals1
{
    private int age;
    private String colour;

    public Animals1() {
    }

    public Animals1(int age, String colour) {
        this.age = age;
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void eat(String something)
    {
        System.out.println("动物正在吃"+something);
    }
}
class Dogs extends Animals1 //子类继承父类也是需要有参和无参构造的，因为get和set方法父类有，就不用写了
{
    public Dogs() {
    }

    public Dogs(int age, String colour) {
        super(age, colour);
    }

    @Override
    public void eat(String something)
    {
        System.out.println(getAge()+","+getColour());
    }
    public void seeHome()
    {
        System.out.println("小狗正在看家");
    }
}

class Cats extends Animals1
{
    @Override
    public void eat(String something)
    {
        System.out.println(getAge()+","+getColour());
    }
    public void playLaoSu()
    {
        System.out.println("小猫正在捉老鼠");
    }
}

class Persons
{
    private String name;
    private int age;

    public Persons() {
    }

    public Persons(String name, int age) {
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
    public void keepPet()
    {

    }
}