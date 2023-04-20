package com;
/*
* 总结this 和 super ,为什么要单独的用一个类，因为真的很重要啊，加油吧
*
* this: 理解为一个变量，表示当前方法调用者的地址值；
*super ： 代表父类存储的空间
* this.成员变量  this. 成员方法  this.本类的构造方法
*  super. 父类中的成员变量  super. 父类中的成员方法   super. 父类中的构造方法
*
* 需求： 1 经理
* 成员变量： 工号 姓名 工资 管理奖金
* 成员方法： 工作（管理其他人），吃饭（吃米饭）
*
* 2 厨师
* 成员变量: 工号 姓名 工资
* 成员方法 工作（炒菜） 吃饭（吃米饭）
*用标准的javabean 写出来。好好的看，这个是新知识
* */
public class HExtents4
{
    public static void main(String[] args)
    {
        Manager a=new Manager(222,"杨银光",99999.3,99999);
        //调用构造方法都是用这个引用.的方式别忘了
        System.out.println(a.getBonus()+","+a.getMoney()+","+a.getNumber()+","+a.getName());
        a.work();
        a.eat();
        Cook a2=new Cook();
        a2.setMoney(233.3);
        a2.setNumber(2234);
        a2.setName("王锦");
        System.out.println(","+a2.getMoney()+","+a2.getNumber()+","+a2.getName());
        a2.work();
        a2.eat();
    }
}
class Staff
{
    private int number;
    private String name;
    private double money;

    public Staff() {
    }

    public Staff(int number, String name, double money) {
        this.number = number;
        this.name = name;
        this.money = money;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public void work()
    {
        System.out.println("员工在工作");
    }
    public void eat()
    {
        System.out.println("吃米饭");
    }
}

class Manager extends Staff
{
    private double bonus;

    public Manager() {
    }

    public Manager(int number, String name, double money, double bonus) {
        super(number, name, money);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work()
    {
        System.out.println("工作是管理其他的人");
    }
}

class Cook extends Staff
{
    public Cook() {
    }

    public Cook(int number, String name, double money) {
        super(number, name, money);
    }

    @Override
    public void work()
    {
        System.out.println("厨师正在炒菜");
    }
}