package com;
/*
* 定义一个长度为3的数组，数组存储1-3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
* 学生的属性：学号，姓名，年龄
* 要求1：添加一个学生对象后，需要判断学生id的唯一性
* 要求2：添加完毕后，遍历所有学生的信息
* 要求3：通过id删除学生信息，如果存在，提示删除成功，如果不存在，提示该用户不存在,并且遍历信息
* 要求4: 查询数组Id为"tianmen"的学生，如果存在，他的年龄将会+1
*
*
* */
public class HDuXiang6
{
    public static void main(String[] args)
    {
        Student[] arr=new Student[3];//定义一个长度为3的数组
        Student s1=new Student(202205,"杨银光",20);//创建一个对象，并且初始化
        Student s2=new Student(202204,"杨",22);//创建一个对象，并且初始化
        Student s3=new Student(202203,"杨银",23);//创建一个对象，并且初始化
        //三个对象放到数组当中去
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        //要求1：添加一个学生对象后，需要判断学生xuehao的唯一性

    }
}


class Student
{
    private int xuehao;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int xuehao, String name, int age) {
        this.xuehao = xuehao;
        this.name = name;
        this.age = age;
    }

    public int getXuehao() {
        return xuehao;
    }

    public void setXuehao(int xuehao) {
        this.xuehao = xuehao;
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
}