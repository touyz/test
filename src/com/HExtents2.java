package com;
/*
* 子类能继承父类中的那些内容呢：父类的构造方法子类是不能继承的
* 成员变量： 子类都可以继承。私有的成员变量不能调用，但是可以继承。
* 成员方法： 非私有的能继承，但是私有的继承不了
*
*当父类的方法不能满足子类的时候就需要进行方法的重写。
* 在进行重写父类方法的时候建议加上@Override 可以让虚拟机看懂，更加的安全，更加的优雅，更加的有艺术感。
*注意是重写父类方法的时候，比如说  父类中有一个方法是 public void der()  , 子类也有一个public void der()
* 的时候，并且 方法里面的内容是不一样的，这就叫做重写父类的方法，要加上@Override.
* */
public class HExtents2
{
    public static void main(String[] args)
    {
        chinaDog a1=new chinaDog();
        a1.eat();
        spDog a2=new spDog();
        a2.eat();
    }
}
class Dog
{
    public void drink()
    {
        System.out.println("喝水");
    }
    public void seeHome()
    {
        System.out.println("看家");
    }
    public void eat()
    {
        System.out.println("吃饭");
    }
}

class hasiqi extends Dog
{
    @Override

    public void eat()
    {
        System.out.println("哈士奇吃狗粮");
    }
    public void breakHome()
    {
        System.out.println("哈士奇拆家");
    }
}
class spDog extends Dog
{
    @Override
    public void eat()
    {
        super.eat();
        System.out.println("sp狗吃狗粮和吃骨头");
    }
}
class chinaDog extends Dog {
    @Override
    public void eat() {
        System.out.println("中华田园犬吃好吃的");
    }
}
/*
* 继承当中  成员变量的特点  就近原则  先到局部变量那去找，然后到本类的成员变量中找，最后到父类中的局部变量去找
* 继承当中 成员方法的特点 直接调用就是就近原则  this调用就是本类的方法，super调用就是父类的方法
* 继承当中 构造方法的特点

* 总结一下 System.out.println(name);  //采用的是就近原则
* System.out.println(this.name);//调用的是本类成员变量
* System.out.println(super.name);//调用的是父类当中的成员变量
* */

/*成员方法的访问和这个成员变量的访问是基本一样的。
*
*
*
* */