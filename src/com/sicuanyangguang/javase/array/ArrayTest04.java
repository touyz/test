package com.sicuanyangguang.javase.array;
/*
* 当一个方法的参数是数组的时候，还可以这样传参数
*
* */
public class ArrayTest04 {
    public static void main(String[] args) {
        //静态初始化一维数组
        int [] a={1,2,3};
        ArrayTest04.printArray(a);
        //动态初始化一维数组
        int [] a1=new int [4];
        ArrayTest04.printArray(a1);
        //还有另外的一种方式调用动态方法
        ArrayTest04.printArray(new int [5]);
    }
    public static void printArray(int[] shuzu)
    {
        for(int a=0;a<shuzu.length;a++)
        {
            System.out.println(shuzu[a]);
        }
    }
}
