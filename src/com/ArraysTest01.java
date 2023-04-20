package com;

import java.util.Arrays;

public class ArraysTest01
{
    public static void main(String[] args)
    {
        int[] arr={1,2,5,3,2,1,5,3,8,3,3};
        Arrays.sort(arr);//这就是利用工具类直接将数组排序，很方便
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
//先来冒泡排序算法

