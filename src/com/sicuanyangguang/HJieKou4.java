package com.sicuanyangguang;
/*
* JDK8以后 运行在接口当中定义默认的方法，需要使用关键字 default 进行修饰
*作用就是解决接口升级的问题
*接口当中 默认方法的定义格式： public default 返回值类型 方法名 （参数列表）{}
* 范例 Public default void show(){}  public 可以省略，但是default不能省略
*接口当中也可以增加静态方法，用static进行修饰
* 格式： public static 返回值类型 方法名 （参数列表）
* 静态方法只能通过接口名调用，不能通过实现类或者对象名调用 比如
* 说接口名叫ddd  方法名叫eee 那么通过接口调用就是 ddd.eee
*
* 当一个方法的参数是接口的时候，可以传递接口所有实现类的对象 这种方式叫做接口多态
*
* */
public class HJieKou4
{
    public static void main(String[] args)
    {

    }
}



