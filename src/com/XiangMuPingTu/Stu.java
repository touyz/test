package com.XiangMuPingTu;

public class Stu {
    private String name;
    public static int getMax(int num1,int num2){
        return num1>num2?num1:num2;
    }
    public void study(){
        System.out.println(name+"在上java");
    }

    public static void main(String[] args) {
        System.out.println(Stu.getMax(10,20));
        System.out.println(getMax(100,200));
        Stu s=new Stu();
        s.name="张三";
        s.study();
        System.out.println(s.getMax(20,50));
        System.out.println(s.name);
    }
}