package com.XiangMuPingTu;
/*
* 一个反射的原理 ： 反射就是指对于任何一个class类 ，在运行的时候都可以直接得到这个类的全部
*
* 在运行的时候，可以直接得到这个类的构造器对象 Constructor
* 在运行的时候，可以直接得到这个类的成员变量对象 Field
* 在运行的时候，可以直接得到这个类的成员方法对象 Method
*
* 这种动态获取的能力就是反射
*
*反射的关键  反射的第一步是先得到编译后的Class对象，然后就可以得到Class的全部成分
* HelloWorld.java-> javac ->HelloWorld.class
* Class c=HelloWorld.class;
* 说白了反射就是从类里面拿东西，但是IO流也是可以从类里面拿东西啊，那为什么要用反射？
* 很简单，因为反射的效率是要比IO流高很多的，而且获取的很详细，干干净净，一点也不剩
*
*
*
* */
public class HFS01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取class对象的三种方式
        // 1 Class.forName("全类名"); 全类名就是包名和类名
        Class classz1=Class.forName("com.XiangMuPingTu.Studentfs");
        System.out.println(classz1);
        // 2 类名.Class
        Class classz2 = Studentfs.class;
        System.out.println(classz1==classz2);
        // 3 对象.getClass();
        Studentfs st=new Studentfs();
        Class classz3=st.getClass();
        System.out.println(classz1==classz2);
        System.out.println(classz2==classz3);
        // 者三种方式获取的字节码文件都是相同的
        // 但是第三种方式是需要获取对象才能用
    }
}

class Studentfs{
    private String name;
    private int age;

    public Studentfs() {
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
        return "Studentfs{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Studentfs(String name, int age) {
        this.name = name;
        this.age = age;


    }
}















