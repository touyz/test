package com.sicuanyangguang;

import java.util.Objects;
import java.util.TreeMap;

/*
*
* 姓需求： 键： 学生对象
 * 值： 籍贯
 * 要求： 按照学生年龄的升序进行排序，年龄一样的话，按照名的字母进行排序，同姓名年龄视为同一个人。
*
* */
public class HJiHeX28 {
    public static void main(String[] args) {
        // 创建集合
        TreeMap<StudentTM,String> tr=new TreeMap<>();
        // 创建学生对象
       StudentTM s1=new StudentTM(20,"娘子杨");
       StudentTM s2=new StudentTM(220,"杨银光");
       StudentTM s3=new StudentTM(20,"娘子杨");
        // 添加元素
        tr.put(s1,"四川");
        tr.put(s2,"湖北");
        tr.put(s3,"四川");
        System.out.println(tr);
    }
}

class StudentTM implements Comparable
{
    private int age;
    private String name;

    public StudentTM() {
    }

    public StudentTM(int age, String name) {
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
        if (!(o instanceof StudentTM)) return false;
        StudentTM studentTM = (StudentTM) o;
        return getAge() == studentTM.getAge() && Objects.equals(getName(), studentTM.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }

    @Override
    public String toString() {
        return "StudentTM{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        // this 表示当前要添加的元素
        // o  表示红黑树中存在的元素

        return 0;
    }
}
