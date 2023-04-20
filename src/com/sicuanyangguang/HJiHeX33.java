package com.sicuanyangguang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
* 班级里有N个学生，要求： 被点到的学生不会再被点到了。
* 但是如果全班的学生都被点到了的话， 就需要重新开始进行第二轮的点名。
*
* */
public class HJiHeX33 {
    public static void main(String[] args) {
        // 定义集合
        ArrayList<String> s=new ArrayList<>();
        // 添加学生的姓名
        Collections.addAll(s,"袁佳艺","杨思思","杨银光","梁子阳");
        // 随机元素
        /*Collections.shuffle(s);
        String name = s.get(0);
        System.out.println(name);*/
        Random r=new Random();
        int i = r.nextInt(s.size());
        String s1 = s.get(i);
        s.remove(s1); // 随机了元素然后删除，随一个删除一个
        System.out.println(s1);
    }
}
