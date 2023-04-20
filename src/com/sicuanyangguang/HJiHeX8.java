package com.sicuanyangguang;
/*
* linkedList集合的底层就是双向链表
*
* 泛型： 泛型的格式<数据类型>  如果没有泛型的话，在获取数据的时候，无法使用特有的方法。
*java中的泛型是伪泛型，
*
* 泛型类 当一个类中，某个变量的数据类型不确定的时候，就可以定义带有泛型的类
*
*
* */
/*
* 编写类的时候，如果不确定类型，就可以定义位泛型。
*
* */
public class HJiHeX8<E> {
    Object[] ob=new Object[10];
    int size;
    public boolean add(E e)
    {
        /*
        *E表示不确定的类型，e就是形参的名字，就是变量名。
        * */
     return  true;
    }
}
