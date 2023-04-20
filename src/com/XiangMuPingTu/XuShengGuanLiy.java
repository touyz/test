package com.XiangMuPingTu;

import java.util.Scanner;

public class XuShengGuanLiy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的人数");
        int stuNum=sc.nextInt();
        System.out.println("请输入课程数");
        int couNum=sc.nextInt();
        String[] name = new String[stuNum];
        String[] course = new String[couNum];
        int[][] score = new int[stuNum][couNum];
        int[] sum = new int[stuNum];
        int[] avg = new int[stuNum];
        String[] content = new String[stuNum];
        for (int i = 0; i < couNum; i++) {
            System.out.println("请输入第"+(i+1)+"个课程的名称");
            course[i]=sc.next();
        }
        for (int i = 0; i < stuNum; i++) {
            System.out.println("请输入第"+"(i+1)+"+"个学生的名字");
            name[i] = sc.next();
            content[i]=name[i]+"\t\t";
            for (int j = 0; j <couNum ; j++) {

                System.out.println("请输入"+name[i]+course[j]+"的成绩");
                score[i][j]=sc.nextInt();
                sum[i]+=score[i][j];
                content[i]+=score[i][j]+"\t\t";

            }
            avg[i]=sum[i]/stuNum;
            content[i]+=sum[i]+"\t\t"+avg+"\t\t";

        }
        for (int i = 0; i < stuNum-1; i++) {
            for (int j = 0; j <stuNum-1 ; j++) {

                if(sum[j]<sum[j+1]){
                    int t=sum[j];
                    sum[j]=sum[j+1];
                    sum[j+1]=t;
                    String temp=content[j];
                    content[j]=content[j+1];
                    content[j+1]=temp;
                }

            }
        }
        System.out.print("姓名\t\t");
        for (int i = 0; i <couNum ; i++) {
            System.out.println(course[i]+"\t\t");

        }
        System.out.println("总分\t\t平均分\t\t排名\t\t名");
        for (int i = 0; i < stuNum; i++) {
            System.out.println(content[i]+"第"+(i+1)+"名\t\t");
        }
    }
}
