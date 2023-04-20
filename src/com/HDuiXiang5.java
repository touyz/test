package com;
/*
* 定义数组存储4个女朋友的对象，女朋友的属性： 姓名，年龄，性别，爱好
* 要求1，计算出四个女朋友的平均年龄
* 要求二： 统计年龄比平均年龄低的女朋友有几个，并且把他们的所有的信息都给打印出来
* */
public class HDuiXiang5
{
    public static void main(String[] args)
    {
        Girl[] arr=new Girl[4];//定义一个数组
        //创建四个女朋友的对象
        Girl p1=new Girl("袁嘉艺",21,"女","喜欢舔杨银光的Jb");
        Girl p2=new Girl("杨思思",22,"女","喜欢舔杨银光的屁眼");
        Girl p3=new Girl("张玲",23,"女","喜欢舔杨银光的脚趾");
        Girl p4=new Girl("枫花恋",25,"女","喜欢舔杨银光的舌头");
        arr[0]=p1;//把对象放到数组当中去
        arr[1]=p2;
        arr[2]=p3;
        arr[3]=p4;
        //遍历数组
        int sum=0;
        for (int i = 0; i < arr.length; i++)
        {
            Girl p5=arr[i];//用一个东西来接受数组里面所有的东西，然后再用这个东西（引用）.你想要得到的元素
            sum+=p5.getAge();

        }
        int average=sum/arr.length;
        System.out.println(average);
        int sum1=0;
        int count=0;
        for (int a = 0; a < arr.length; a++)
        {
            Girl p6=arr[a];
            sum1+=p6.getAge();
            if(p6.getAge()<average)
            {
                count++;
                System.out.println(p6.getAge()+","+p6.getHobby()+","+p6.getName()+","+p6.getSix());
                System.out.println(count);
            }
        }
        int average1=sum1/ arr.length;
    }
}

class Girl
{
    private String name;
    private int age;
    private String six;
    private String hobby;

    public Girl() {
    }

    public Girl(String name, int age, String six, String hobby) {
        this.name = name;
        this.age = age;
        this.six = six;
        this.hobby = hobby;
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

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
