package com.sicuanyangguang.javase.array;
/*关于每一个类型的默认值
  byte 0 short 0 int 0 long 0 float 0 double 0  boolean false  char 0 引用数据类型  null

*什么时候采用静态初始化，什么时候用动态初始化，当你创建数组的时候，有确定的元素的时候，就用静态初始化
否则就可以采用动态初始化的方法。先预分配一个空间。后期也可以赋值啊。
a[0]=1;
a[1]=3;   是吧，可以这样重新赋值。
* */
public class ArrayTest02
{
    public static void main(String[] args) {
        //定义数组用动态的方法
        int[] a=new int[4];
        for(int b=0;b<a.length;b++)
        {
            System.out.println(a[b]);
        }
        //初始化一个Object类型的元素，采用动态初始化，动态初始化是没有指定值的。
        Object[] a1 = new Object[4];
        for(int i=0;i<a1.length;i++)
        {
            System.out.println(a1[i]);
        }
        String[] str={"ddd","derq","ladje"};
        for(int i =0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }
        Object[] guang1={new Object(),new Object(),new Object()};
        for(int derb=0;derb< guang1.length;derb++)
        {
            System.out.println(guang1[derb]);
        }
    }
}



