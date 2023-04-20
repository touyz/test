package com.XiangMuPingTu;

import java.util.Scanner;

public class Exam002 {
    public static void main(String[] args) {
        int[] arr=new int[]{5,10,20,30,40,50,60};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查询的数:");
        int num=scanner.nextInt();
       int index= searchIndex(arr,num);
        System.out.println(num+"的索引号是:"+index);
    }
    public static int searchIndex(int[] arr,int data){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==data){
                return i;
            }
        }
        return -1;
    }
}
