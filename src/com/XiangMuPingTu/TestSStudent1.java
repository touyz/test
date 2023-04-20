package com.XiangMuPingTu;

public class TestSStudent1 {
    public static void main(String[] args) {
        SStudent s1=new SStudent();
        System.out.println(s1);
        s1.name="张三";
        s1.sex="女";
        s1.age=18;
        System.out.println(s1.name);
        System.out.println(s1.sex);
        System.out.println(s1.age);
        s1.study();
        s1.sleep();
        s1.eat();
        System.out.println("------------");
        SStudent s2=new SStudent();
        System.out.println(s2);
        s2.name="李四";
        s2.sex="男";
        s2.age=20;
        System.out.println(s2.name);
        System.out.println(s2.sex);
        System.out.println(s2.age);
        s2.study();
        s2.sleep();
        s2.eat();
    }
}
