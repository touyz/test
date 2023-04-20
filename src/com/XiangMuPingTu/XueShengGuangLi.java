package com.XiangMuPingTu;

import java.util.ArrayList;
import java.util.Scanner;

public class XueShengGuangLi
{
    public static void main(String[] args)
    {
        ArrayList<StudentG> st=new ArrayList<>();// 创建一个集合
        while(true)
        {
            System.out.println("-----------欢迎来到学生管理系统---------");
            System.out.println("1是添加学生，2 是删除学生3 是修改学生4是查询学生5是退出");

            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if (i == 1) {
                StudentG.tianJia(st);
                } else if (i == 2) {
                    StudentG.shanChu(st);
                } else if (i == 3) {
                    System.out.println("修改学生");
                } else if (i == 4) {
                   StudentG.chaXun(st);
                } else if (i == 5) {
                    break;
                } else {
                    System.out.println("输入错误，请重新选择");
                }
        }
    }
}
