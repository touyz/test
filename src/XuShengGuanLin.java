import java.util.ArrayList;
import java.util.Scanner;

public class XuShengGuanLin
{
    public static void main(String[] args)
    {
        ArrayList<Student> cuiwei=new ArrayList<>();//创建一个集合

        while (true)
        {
            System.out.println("---------欢迎来到学生管理系统");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            Scanner der=new Scanner(System.in);
            System.out.println("请选择");
            int  derb=der.nextInt();
            if(derb==1)
            {
                Student.addStudent(cuiwei);
            }
            else if(derb==2)
            {
                Student.deleteStudent(cuiwei);
            }
            else if(derb==3)
            {
                Student.changeStudent(cuiwei);
            }
            else if(derb==4)
            {
                Student.searchStudent(cuiwei);
            }
            else if(derb==5)
            {
                System.out.println("退出本管理系统");
                return;
            }
            else
            {
                System.out.println("选择错误，请重新选择");
            }
        }
    }
}
