package com.sicuanyangguang;
/*
*需求： 用带有接口和抽象类的标准JavaBean类
*兵乓球运动员  姓名 年龄 学打兵乓球 说英语
* 篮球运动员 姓名 年龄 学打篮球
* 兵乓球教练  姓名 年龄 教打兵乓球  说英语
* 篮球 教练 姓名 年龄  教打篮球
*
* */
public class HJieKou3
{
    public static void main(String[] args)
    {
        PingpangBall a1=new PingpangBall("杨银光",20);
        a1.speak();
        a1.studyBall();
        System.out.println(a1.getName()+","+a1.getAge());
    }
}

abstract class Runner
{
    private String name;
    private int age;

    public Runner() {
    }

    public Runner(String name, int age) {
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
    public abstract void studyBall();//抽象类
}

abstract class Coach
{
    private int age;
    private String name;

    public Coach() {
    }

    public Coach(int age, String name) {
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
    public abstract void tachBall();//抽象类
}
class BasketballRunner extends Runner
{
    public BasketballRunner() {
    }

    public BasketballRunner(String name, int age) {
        super(name, age);
    }

    @Override
    public void studyBall()
    {
        System.out.println("篮球运动员正在学篮球");
    }
}
class PingpangBall extends Runner implements SpeakEnglishs
{
    public PingpangBall() {
    }

    public PingpangBall(String name, int age) {
        super(name, age);
    }

    @Override
    public void studyBall()
    {
        System.out.println("乒乓球运动员正在学习乒乓球");
    }

    @Override
    public void speak()
    {
        System.out.println("乒乓球运动员正在说英语");
    }
}

class BasketballCoach extends Coach
{
    public BasketballCoach() {
    }

    public BasketballCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void tachBall()
    {
        System.out.println("篮球教练正在教学篮球");
    }
}

class PingpangballCoach extends Coach implements SpeakEnglishs
{
    public PingpangballCoach() {
    }

    public PingpangballCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void tachBall()
    {
        System.out.println("乒乓球教练正在教学乒乓球");
    }

    @Override
    public void speak()
    {
        System.out.println("乒乓球教练正在说英语");
    }
}
