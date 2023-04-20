package com;

import java.util.Random;

public class HRandom1
{
    public static void main(String[] args)
    {
        //需求是生成1-100的随机数 1-100，1-1  100-1   0-99  99+1=100； 100，1
        Random r=new Random();
        int number=r.nextInt(100)+1;
        //System.out.println();
        //秘诀：可以生成任意数到任意数之间的随机值，是黑马程序员阿伟的心得，别忘了感恩，不忘初心，方得始终。
        /*比如说，我要生成7-15的随机数
        1.让这个范围的头尾都要减去一个值，并且还要让范围的头变成一个0，所以应当减去7
        因为只有减去了7，范围头才是0吗，所以就是0-8
        2.尾巴加1
        3.结果就是尾巴加1和第一步减去的那个值，说白了就是尾巴+1后是8+1=9，第一步减去的值就是7，所以就是9，7
        * */
        Random r1=new Random();
       int number1=r1.nextInt(9)+7;//范围就是7-15

    }
}
