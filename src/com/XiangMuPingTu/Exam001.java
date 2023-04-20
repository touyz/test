package com.XiangMuPingTu;

public class Exam001  {
    public static void main(String[] args) {
        int[] arr1=new int[]{65,85,100,36,88};
        printArray(arr1);
        System.out.println("------------------------");
        int[] arr2=null;
        printArray(arr2);
        System.out.println("--------------------");
        int[] arr3={};

        printArray(arr3);
        System.out.println("-------------------------");
        int[] arr4 ={100};
        printArray(arr4);
    }
    public static void printArray(int[] arrs){
        System.out.print("该数组的内容为:[");
        if(arrs!=null &&arrs.length>0 ){
            for (int i = 0; i < arrs.length; i++) {
                System.out.println((i==arrs.length-1)?arrs[i]:(arrs[i]+","));
            }
        }
        System.out.println("]");
    }
}
