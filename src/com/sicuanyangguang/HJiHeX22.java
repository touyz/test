package com.sicuanyangguang;

import java.util.*;
import java.util.function.BiConsumer;

/*
* hashMap 是最常用的一个实现类
* hasMap和hasSet的底层是一样的，是数组，链表，红黑树
*  如果键的位置是存储的自定义对象，重写 equals 和hashcode方法
*  如果值是自定义对象的话，就可以不用重写这两种方法。
* 所以很依赖这两种方法保证键的唯一性
*
*
* 需求： 创建一个HashMap集合，键是学生对象（student）,值是籍贯（string）
* 存储三个键值对元素，并且遍历
* 要求： 同姓名，同年龄认为是同一个学生
*
*
* */
public class HJiHeX22 {
    public static void main(String[] args) {
        // 创建学生对象
        StudentM s1=new StudentM(20,"陈贤海");
        StudentM s2=new StudentM(22,"吴秋波");
        StudentM s3=new StudentM(224,"张全西");
        // 创建HashMap对象
        HashMap<StudentM,String> m=new HashMap<>();
        // 添加元素
        m.put(s1,"广西");
        m.put(s2,"贵州");
        m.put(s3,"甘肃");
        // 进行遍历
        m.forEach(new BiConsumer<StudentM, String>() {
            @Override
            public void accept(StudentM a, String s) {
                System.out.println(a+","+s);
            }
        });
        System.out.println("--------------------------------");
        m.forEach((StudentM a, String s) ->{
            System.out.println(a+","+s);
            }
        );
        System.out.println("------------------------");
        Set<StudentM> a = m.keySet();
        Iterator<StudentM> iterator = a.iterator();
        while(iterator.hasNext())
        {
            StudentM der = iterator.next();
            //System.out.println(der);
            String s = m.get(der);
            System.out.println(der+","+s);
        }
        System.out.println("---------------------");
        Set<Map.Entry<StudentM, String>> sb = m.entrySet();
        for (Map.Entry<StudentM, String> sb1 : sb) {
            StudentM key = sb1.getKey();
            String value = sb1.getValue();
            System.out.println(key+","+value);
        }
    }
}

class StudentM
{
    private int age;
    private String name;

    public StudentM() {
    }

    public StudentM(int age, String name) {
        this.age = age;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentM)) return false;
        StudentM studentM = (StudentM) o;
        return getAge() == studentM.getAge() && Objects.equals(getName(), studentM.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }

    @Override
    public String toString() {
        return "StudentM{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}