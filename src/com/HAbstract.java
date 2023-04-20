package com;
/*
* 1 抽象类的定义格式: public abstract class 类名{}
* 2 抽象方法对的定义格式 : public abstract 返回值类型 方法名(参数列表); 注意了 不写方法体的。
* 3 子类继承抽象类之后，如何重写抽象方法
* 4 抽象方法： 将共性的方法抽取到父类之后，由于每个子类执行的内容是不一样的，所以在父类中是不能确定具体的方法的，
* 所以该方法就可以定义为抽象方法。
* 5 抽象类： 如果一个类中有抽象方法，那么这个类就 必须 声成抽象类
*
*6 抽象类不能创建对象。但是抽象类可以有构造方法
*
* 抽象类中不一定有抽象方法  但是有抽象方法的一定是抽象类
*
* 抽象类的子类，要么重写抽象类中所有的抽象方法，要么是抽象类
* */
public class HAbstract
{
    public static void main(String[] args)
    {
        //可以创建一个子类的对象
        Studentss a=new Studentss(3,"yyy");
        System.out.println(a.getAge()+","+a.getName());
    }
}


abstract class Person2//抽象类中是不能创建对象的。
{   private int age;
    private String name;

    public Person2() {
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

    public Person2(int age, String name) {
        this.age = age;
        this.name = name;

    }//抽象类中是可以创建构造方法的，但是抽象方法连对象都创建不了，你搞一个构造方法有什么用呢？给子类的属性去赋值的
//别慌，看我的操作，我先直接创建一个子类
    public abstract void work();//alt+回车   ，变成抽象方法。
    public void suiJiao()
    {
        System.out.println("杨银光正在睡觉");//说明了在一个抽象类当中是可以没有抽象方法的。
    }
}

class Studentss extends Person2

{
    public Studentss() {
    }

    public Studentss(int age, String name) {
        super(age, name);
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
