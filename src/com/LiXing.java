package com;

public class LiXing {

    public static void main(String[] args) {
        //控制台输出菱形
        int numT = 5;//行数
        //打印上半部分菱形，外层循环控制行
        for (int i = 1; i <= numT; i++) {
            //内层循环控制列
            //填充空白格
            for (int j = 1; j <= numT - i; j++) {
                System.out.print(" ");
            }
            //三角形中心列及左半边
            for (int k = 1; k <= i; k++) {
                System.out.print("*");//输出符号时此括号填指定符号
            }
            //三角形右半边
            for (int n = i - 1; n >= 1; n--) {
                System.out.print("*");//输出符号填符号
            }
            //换行
            System.out.println();
        }

        //打印下半部分菱形，外层循环控制行
        for (int i = 1; i < numT; i++) {
            //内层循环控制列
            //填充空白格
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //三角形中心列及左半边
            for (int k = 1; k <= numT - i; k++) {
                System.out.print("*");//输出符号填符号
            }
            //三角形右半边
            for (int n = numT - 1 - i; n > 0; n--) {
                System.out.print("*");//输出符号填符号
            }
            //换行
            System.out.println();


        }
    }
}
