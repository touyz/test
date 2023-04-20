package jihe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
* 添加一个学生对象进行遍历，需求： 定义一个集合，添加一些学生对象，并进行遍历，学生类的属性为：姓名，年龄。
*
* */
/*
public class JiHe4
{
    public static void main(String[] args)
    {
           //创建一个学生类的集合
        ArrayList<Students> der=new ArrayList<>();
        //再new几个学生类的对象吧
        Students der1=new Students(23,"黄朝飞");
        Students der2=new Students(30,"张全西");
        Students der3=new Students(26,"黄忠海");
        //添加学生对象到集合里面去
        der.add(der1);
        der.add(der2);
        der.add(der3);
        //遍历一下
        for(int a=0;a<der.size();a++)
        {
            System.out.println(der.get(a).getAge()+","+der.get(a).getName());
        }
    }
}
class Students
{
    private int age;
    private String name;

    public Students() {
    }

    public Students(int age, String name) {
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
    }  以上的是自定义的类去遍历，下面我要写一个可以通过键盘录入的方式来遍历自定义类
}*/
public class JiHe4
{
    public static void main(String[] args)
    {
        //创建一个集合
        ArrayList<Students> der=new ArrayList<>();
        //键盘录入学生的信息并且添加到集合当中去
        Scanner sb=new Scanner(System.in);
        for(int a=0;a<3;a++)
        {
            Students der1=new Students();
            System.out.println("请输入学生的一个姓名");
            String fuguang=sb.next();
            System.out.println("请输入学生的一个年龄");
            int fuyao=sb.nextInt();
            //接着把输入的name 和age 直接赋给学生对象
            der1.setAge(fuyao);
            der1.setName(fuguang);
            //把学生对象添加到集合当中去
            der.add(der1);
        }
        for(int b=0;b<der.size();b++)
        {
            System.out.println(der.get(b));
        }
    }
}



class Students {
    private int age;
    private String name;

    public Students() {
    }

    public Students(int age, String name) {
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
}