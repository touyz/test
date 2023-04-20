package com.XiangMuPingTu;

public class XinJian {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        for(a=1;a<9;a++)
        {
            for(b=1;b<9-1;b++)
            {
                System.out.print(a+"="+a*b);
            }
            System.out.println();
        }
    }
}
