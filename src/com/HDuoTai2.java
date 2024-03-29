package com;
/*
* 多态调用成员的特点
*
* 变量的调用：编译看左边，运行也看左边
* 方法的调用： 编译看左边，运行看右边
*这个其实很简单，但是听老杜讲的时候，没听懂，现在好好的理解
*
* 在多态中调用成员变量的时候：
* 编译看左边： 在javac编译的时候，会先看看左边父类中有没有这个变量，如果有，编译成功，如果没有，编译直接失败
* 运行看左边 ： 在运行的时候，其实就是获取左边父类中这个成员变量的值了
*
* 在多态中调用成员方法的时候：
* 编译看左边： 在Javac编译的时候，会先看看左边父类中有没有这个方法，如果有，编译成功，如果没有，编译直接失败
* 运行看右边： 在运行的时候，其实就是调用右边子类中的这个成员方法了
*
*
* */
public class HDuoTai2
{
    public static void main(String[] args)
    {

    }
}
/*
* 多态的弊端
* 多态不能调用子类中的独有的方法。所以把调用者转化为子类就行了
* 比如说： Student s=new Student();
 *   Person a=new Student();
 *    Student s=(Student)a;  //这个就是父类强转为子类的方法。
 * 如果你瞎转的话，就会出现类型转换异常。
 * 如果你在转换之前做一个If判断就可以保证安全性了
 * 比如 if(a instanceof Student)
 * {
 *        Student s=(Student)a;
 * }
 * else if(a instanceof 其他)
 * {
 *      ...
 * }
 * else
 * {
 *      //没有。
 * }
 *
* */