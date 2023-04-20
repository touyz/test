package com.sicuanyangguang;

import java.util.Objects;
import java.util.TreeSet;

/*
* TreeSet 对象的排序的练习题
* 需求： 创建一个TreeSet 集合，并添加3个学生对象
* 学生对象的属性是： 姓名和年龄
* 要按照要求对学生的年龄进行排序
* 同年龄按照姓名字母进行排序，同姓名，同年龄认为是一个人
*
* 要学习比较规则，才可以进行自定义的类进行排序
* 方式一： javabean 类实现Comparable 接口指定比较的规则  默认排序
*
* 方式二： 比较器排序 创建TreeSet 对象的时候，传递比较器Comparator 指定规则。
*  默认的是使用第一种，如果第一种不能满足的话，就可以使用第二种方法进行。
*
*
* */
public class HJiHeX15 {
    public static void main(String[] args) {
        StudentT s1=new StudentT(20,"yyy");//创建了三个学生对象
        StudentT s2=new StudentT(22,"yyz");
        StudentT s3=new StudentT(2,"ygz");
        TreeSet<StudentT> st=new TreeSet<>();// 创建了一个treeSet集合
        //添加元素
        st.add(s1);
        st.add(s2);
        st.add(s3);
        System.out.println(st);

    }
}

class StudentT implements Comparable<StudentT>
{
    private int age;
    private String name;

    public StudentT() {
    }

    public StudentT(int age, String name) {
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
    public String toString() {
        return "StudentT{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentT)) return false;
        StudentT studentT = (StudentT) o;
        return getAge() == studentT.getAge() && Objects.equals(getName(), studentT.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName());
    }

    @Override
    public int compareTo(StudentT o) {
        // 现在就可以在方法里面指定排序的规则
        // 假设现在只看年龄，我想要按照升序进行排序
        return this.getAge() - o.getAge();
        // this 表示当前要添加的元素，O表示在红黑树中存在的元素
    }
}
