package com.sicuanyangguang;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

/*
* 需求： 创建5个学生对象
* 属性： 姓名，年龄 语文成绩  数学成绩  英语成绩
* 按照总分从高到低输出到控制台
* 如果总分 一样，按照语文成绩排
* 如果语文一样，按照数学成绩排
* 如果数学一样，按照英语成绩排
* 如果英语成绩一样，按照年龄排
* 如果年龄一样，按照姓名的字母排
* 如果都一样，认为是同一个学生，不存
*
*
* */
public class HJiHeX17 {
    public static void main(String[] args) {
        // 创建5个学生对象
        StudentP s1=new StudentP("yangyin",20,80.1,30.3,50.3);
        StudentP s2=new StudentP("zhangquanxi",30,10.3,3.1,4.1);
        StudentP s3=new StudentP("chaofei",25,1.1,2.2,3.3);
        StudentP s4=new StudentP("derb",26,7,3,2);
        StudentP s5=new StudentP("guap",50,3,5,90.100);
        // 创建集合呗
       TreeSet<StudentP> st=new TreeSet<>();
        // 添加元素
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        // 打印集合
        System.out.println(st);
    }
}

class StudentP implements Comparable
{
    private String name;
    private int age;
    private double chinese;
    private double math;
    private double english;

    public StudentP() {
    }

    public StudentP(String name, int age, double chinese, double math, double english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
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

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentP)) return false;
        StudentP studentP = (StudentP) o;
        return getAge() == studentP.getAge() && Double.compare(studentP.getChinese(), getChinese()) == 0 && Double.compare(studentP.getMath(), getMath()) == 0 && Double.compare(studentP.getEnglish(), getEnglish()) == 0 && Objects.equals(getName(), studentP.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getChinese(), getMath(), getEnglish());
    }

    @Override
    public String toString() {
        return "StudentP{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        return 0;
    }
}
