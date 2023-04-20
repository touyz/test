package com.XiangMuPingTu;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentG
{
    private int age;
    private String name;
    private String address;
    private String id;

    public StudentG() {
    }

    public StudentG(int age, String name, String address, String id) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentG{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
    public static void tianJia(ArrayList<StudentG> list) // 添加
    {
        StudentG s=new StudentG();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生的姓名");
        String name = sc.next();
        s.setName(name);
        while(true) {
            System.out.println("请输入学生的id");
            String id = sc.next();
            boolean flag = weiYi(list, id);
            if (flag) {
                System.out.println("id存在，请重新输入");
            } else {
                s.setId(id);
                break;
            }
        }
        System.out.println("请输入学生的家庭住址");
        String address = sc.next();
        s.setAddress(address);
        // 把学生对象添加到学生中
        list.add(s);
        System.out.println("添加成功");
    }
    public static void shanChu(ArrayList<StudentG> list) // 删除
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你想要删除的学生的id");
        String id = sc.next();
        int i = suoYin(list,id);
        if(i>=0)
        {
            list.remove(i);
            System.out.println("删除成功");
        }
        else
        {
            System.out.println("不存在");
            return;
        }


    }
    public static void change(ArrayList<StudentG> list)// 改变
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你想要修改的学生的Id");
        String id = sc.next();
        int i = suoYin(list, id);
        if(i>=0)
        {
            StudentG st = list.get(i);
            st.setId(id);
        }
        else
        {
            System.out.println("不存在，请添加后再来");
            return;
        }
    }
    public static void chaXun(ArrayList<StudentG> list) // 查询
    {
        if(list.size()==0)
        {
            System.out.println("当前未添加元素，请添加元素后再来查询");
            return;
        }
        else
        {
            System.out.println("id"+","+"姓名"+","+"年龄"+","+"家庭住址");
            for (int i = 0; i < list.size(); i++) {
                StudentG st = list.get(i);
                System.out.println(st.getAddress()+","+st.getId()+","+st.getName()+","+st.getAge());
            }
        }
    }
    // 判断id是否唯一的方法 ，
    public static boolean weiYi(ArrayList<StudentG> list,String id)
    {
        for (int i = 0; i < list.size(); i++) {
            StudentG st = list.get(i);
            String id1 = st.getId();
            if(id1.equals(id))
            {
                return true;
            }
        }
        return false;
    }
    // 通过Id获取索引的方法
    public static int suoYin(ArrayList<StudentG> list,String id)
    {
        for (int i = 0; i < list.size(); i++) {
            StudentG st = list.get(i);
            String id1 = st.getId();
            if(id1.equals(id))
            {
                return i;
            }
        }
        return -1;
    }
}
