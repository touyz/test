package com;

public class JieCheng {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <=10 ; i++) {
            int j=1;
            for (int a = 1; a <=i ; a++) {
                j=j*a;
            }
            sum=sum+j;
        }
        System.out.println(sum);
    }
}
