package com;

import java.util.Scanner;

public class Score {

    public static void main(String[] args) {

        double[] score = new double[7];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0, a = 1; i < score.length; i++, a++) {
            System.out.println("请输入第" + a + "的评委的评分");
            double b = scanner.nextDouble();
            while(b < 0 || b > 100) {
                System.out.println("输入有误，请重新输入");
                b = scanner.nextDouble();
            }
            score[i] = b;
        }
        double max = -1;
        double min = 101;
        double sum = 0;
        for(int j = 0; j < score.length; j++) {
            if(score[j] > max) {
                max = score[j];
            }
            if(score[j] < min) {
                min = score[j];
            }
            sum = sum + score[j];
        }
        double average = 0;
        average = (sum - min - max) / (score.length - 2);
        System.out.println("平均分"+average);

    }

}

