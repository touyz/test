/*
* 方法的参数是数组。
* 数组的传参就是这样的，c语言是学过的，但是也有不一样的地方，加之巩固。
* */
package com.sicuanyangguang.javase.array;

public class ArrayTest03 {
    public static void main(String[] args) {
        System.out.println("杨银光是真的很帅啊");
        int [] r={9,3,2,3,5,0};
        ArrayTest03.printArray(r);
        String[] w={"guang","yang","yin"};
        ArrayTest03.string(w);
    }
    public static void printArray(int[] shuZu)
    {
        for(int j=0;j<shuZu.length;j++ )
        {
            System.out.println(shuZu[j]);
        }
    }
    public static void string(String[] zifu)
    {
        for(int t=0;t<zifu.length;t++)
        {
            System.out.println(zifu[t]);
        }
    }
}



