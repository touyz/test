import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Student
{
    private String id;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() && Objects.equals(getId(), student.getId()) && Objects.equals(getName(), student.getName()) && Objects.equals(getAddress(), student.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getAddress());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


    public static void addStudent(ArrayList<Student> cuiwei)//添加学生
    {
        Student der5=new Student();
        Scanner der=new Scanner(System.in);
        while (true)
        {
            System.out.println("请输入id");
            String der1 = der.next();
            boolean flag = only(cuiwei, der1);
            if (flag)
            {
                System.out.println("存在,请重新输入");
            }
            else
            {
                der5.setId(der1);
                break;
            }
        }
        System.out.println("请输入姓名");
        String der2=der.next();
        der5.setName(der2);
        System.out.println("请输入年龄");
        int der3=der.nextInt();
        der5.setAge(der3);
        System.out.println("请输入家庭住址");
        String der4=der.next();
        der5.setAddress(der4);
        //Student der5=new Student(der1,der2,der3,der4);//直接把键盘录入的四个数据放到学生对象中
        //ArrayList<Student> der6=new ArrayList<>();//不用创建一个集合，因为之前已经创建一个集合了
        //这个BUG我找了2个小时，记住了，如果你创建一个集合，那就不用再写了，不然你存不了。
        cuiwei.add(der5);//直接把学生对象放到集合里面去，现在突然之间发觉很妙啊，一环套一环。
        System.out.println("添加成功");
    }
    public static void deleteStudent(ArrayList<Student> cuiwei)//删除学生
    {
        Scanner hangu=new Scanner(System.in);
        System.out.println("请输入你想要删除的学生的id");
        String hangu1=hangu.next();
        int suoy=suoyin(cuiwei,hangu1);
        if(suoy>=0)
        {
            cuiwei.remove(suoy);
            System.out.println("这个学生的id已经被删除了，兄弟");
        }
        else
        {
            System.out.println("Id不存在，请重新添加后再来删除");
        }
    }
    public static void changeStudent(ArrayList<Student> cuiwei)//改变学生
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你想修改的学生的id");
        String st=sc.next();
        int suoyin=suoyin(cuiwei,st);
        if(suoyin>=0)
        {
            cuiwei.get(suoyin);
            Student stu=cuiwei.get(suoyin);//把获取集合中的索引传到学生对象当中去。
            Scanner sca=new Scanner(System.in);
            System.out.println("请输入你想要修改的id");
            String id=sca.next();
            stu.setId(id);
            System.out.println("请输入你想要修改的学生姓名");
            String name=sca.next();
            stu.setName(name);
            System.out.println("请输入你想要修改的学生的年龄");
            int age=sca.nextInt();
            stu.setAge(age);
            System.out.println("请输入你想要修改的学生的家庭住址");
            String address=sca.next();
            stu.setAddress(address);
        }
        else
        {
            System.out.println("你想修改的学生信息不存在，请添加后再来");
        }
    }
    public static void searchStudent(ArrayList<Student> cuiwei)//查询学生
    {
        if(cuiwei.size()==0)//整个集合的长度是0，所以就没有学生的信息。
        {
            System.out.println("当前无学生信息，请添加后查询");
            return;//表示就结束了。
        }
            System.out.println("id\t\t姓名\t年龄\t家庭住址");
            for (int a = 0; a < cuiwei.size(); a++) {
                Student cuiwei1 = cuiwei.get(a);
                System.out.println(cuiwei1.getId() + "," + cuiwei1.getName() + "," + cuiwei1.getAge() + "," + cuiwei1.getAddress());
            }
    }
    public static boolean only(ArrayList<Student> cuiwei,String id)//判断id是否唯一
    {
        for(int a=0;a<cuiwei.size();a++)
        {
            Student st=cuiwei.get(a);
            String aidi=st.getId();
            if(aidi.equals(id))
            {
                return true;//存在返回true，不存在返回false
            }
        }
        return false;
    }
    public static int suoyin(ArrayList<Student> cuiwei,String id)//通过索引判断id是否唯一
    {
        for(int a=0;a<cuiwei.size();a++)//遍历集合
        {
            Student st=cuiwei.get(a);//在集合里面得到每一个学生对象
            String str=st.getId();//在学生对象里面得到Id
            if(str.equals(id))//用对象里面的Id来和输入的id比较
            {
                return a;//如果有这个id的话，就直接返回这个id的索引，说白了这个索引就是下标
            }
        }
        return -1;//如果不存在的话，就直接返回一个复数
    }
}