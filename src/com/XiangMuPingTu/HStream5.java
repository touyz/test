package com.XiangMuPingTu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
* 现在有两个ArrayList 集合
* 第一个集合中： 存储6名男演员的名字和年龄。第二个集合中存储6名女演员的名字和年龄
* 姓名和年龄中间用逗号分开，比如，张三，23
* 要求完成如下的操作
*  1 男演员的名字只要为三个字的前两人
*  2 女演员只要姓杨的，姓名和女演员的姓名合并到一起
*  4 将上一步的演员信息封装成Actor对
*  5 将所有的演员对象都保持到List集合当中去象并且不要第一个
*  3 把过滤的男演员的
*  演员类Actor ，属性有  name ，age
*
*
* */
public class HStream5 {
    public static void main(String[] args) {
        // 第一个集合，存储男演员的姓名和年龄
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"胡歌,30","杨银光,20","白敬亭，29","李易峰，35");
        // 第二个集合，存储女演员的姓名和年龄
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"桃乃木香奈，23","杨幂，30","杨得很");
        // 男演员的名字只要三个字的并且是前两个人
        Stream<String> stream1 = list1.stream();
        stream1.skip(1).limit(2);
        // 女演员只要姓杨的，并且不要第一个
        Stream<String> stream2 = list2.stream().skip(2);
        stream2.limit(3);
        // 将过滤后的名字合并到一起
        Stream.concat(stream1,stream2).map(s-> new Actor());
    }
}

class Actor
{
    private int age;
    private String name;

    public Actor() {
    }

    public Actor(int age, String name) {
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
        return "Actor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
