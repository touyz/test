public class HArrayTest01//遍历数组并且求和,练习1
{
    public static void main(String[] args)
    {
        int[] a={1,2,3,4};
        int sum=0;
        for (int i = 0; i < a.length; i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
//练习2，定义一个数组，存储1，2，3，4，5，6，7，8，9，10，遍历里面的数组，并且统计里面有多少能被3整除的个数
class HaHa
{
    public static void main(String[] args)
    {
        int[] a1={1,2,3,4,5,6,7,8,9,10};
        int count=0;
        for (int i = 0; i < a1.length; i++)
        {
            if(a1[i]%3==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
* 二维数组的学习
*
*
*
*
* */






