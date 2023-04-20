package com.sicuanyangguang;
/*
* 可变参数： 计算2个数据的和
* 计算3个数据的和
* ... 计算N个数据的和
*
* 1 可变参数本质上就是一个数组
* 2 格式： 数据类型... 变量名
*
* */
public class HJiHeX29 {
    public static void main(String[] args) {
        int a=getSum(1,4,34,5);
        System.out.println(a);
    }
    public static int getSum(int...a)
    {
        int sum=0;
        for (int i : a) {
            sum=sum+i;
        }
        return sum;
    }
}
