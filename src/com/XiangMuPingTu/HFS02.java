package com.XiangMuPingTu;
/*
* 获取反射的一个构造方法
*
*  Class 类中获取构造方法的方法
*  Constructor<?>[] getConstructors(); 返回所有公共构造方法对象的数组
*  Constructor<?>[] getDeclaredConstructors(); 返回所有构造方法对象的数组
*  Constructor<T> [] getConstructor(); 返回单个公共构造方法对象
*  Constructor<T> getDeclaredConstructor; 返回单个构造方法对象
*
*
*
* */
public class HFS02 {
    public static void main(String[] args) {
        // 获取class字节码的对象
    }
}


class Teacher{
    private String name;
    private int age;

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;

    }
}












